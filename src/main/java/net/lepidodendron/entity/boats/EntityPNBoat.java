package net.lepidodendron.entity.boats;

import com.google.common.collect.Lists;
import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class EntityPNBoat extends EntityBoat
{
    private static final DataParameter<Integer> TIME_SINCE_HIT = EntityDataManager.<Integer>createKey(EntityPNBoat.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> FORWARD_DIRECTION = EntityDataManager.<Integer>createKey(EntityPNBoat.class, DataSerializers.VARINT);
    private static final DataParameter<Float> DAMAGE_TAKEN = EntityDataManager.<Float>createKey(EntityPNBoat.class, DataSerializers.FLOAT);
    private static final DataParameter<Integer> BOAT_TYPE = EntityDataManager.<Integer>createKey(EntityPNBoat.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean>[] DATA_ID_PADDLE = new DataParameter[] {EntityDataManager.createKey(EntityPNBoat.class, DataSerializers.BOOLEAN), EntityDataManager.createKey(EntityPNBoat.class, DataSerializers.BOOLEAN)};
    private final float[] paddlePositions;
    private float momentum;
    private float outOfControlTicks;
    private float deltaRotation;
    private float deltaPitch;
    private int lerpSteps;
    private double lerpX;
    private double lerpY;
    private double lerpZ;
    private double lerpYaw;
    private double lerpPitch;
    private boolean leftInputDown;
    private boolean rightInputDown;
    private boolean forwardInputDown;
    private boolean backInputDown;
    private double waterLevel;
    private float boatGlide;
    private EntityPNBoat.Status status;
    private EntityPNBoat.Status previousStatus;
    private double lastYd;

    public EntityPNBoat(World worldIn)
    {
        super(worldIn);
        this.paddlePositions = new float[2];
        this.preventEntitySpawning = true;
        this.setSize(1.375F, 0.5625F);
    }

    public EntityPNBoat(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
    }

    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    protected void entityInit()
    {
        this.dataManager.register(TIME_SINCE_HIT, Integer.valueOf(0));
        this.dataManager.register(FORWARD_DIRECTION, Integer.valueOf(1));
        this.dataManager.register(DAMAGE_TAKEN, Float.valueOf(0.0F));
        this.dataManager.register(BOAT_TYPE, Integer.valueOf(0));

        for (DataParameter<Boolean> dataparameter : DATA_ID_PADDLE)
        {
            this.dataManager.register(dataparameter, Boolean.valueOf(false));
        }
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBox(Entity entityIn)
    {
        return entityIn.canBePushed() ? entityIn.getEntityBoundingBox() : null;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox()
    {
        return this.getEntityBoundingBox();
    }

    @Override
    public boolean canBePushed()
    {
        return true;
    }

    @Override
    public double getMountedYOffset()
    {
        return -0.1D;
    }

    @Override
    public boolean attackEntityFrom(@Nonnull DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else if (!this.world.isRemote && !this.isDead)
        {
            if (source instanceof EntityDamageSourceIndirect && source.getTrueSource() != null && this.isPassenger(source.getTrueSource()))
            {
                return false;
            }
            else
            {
                this.setForwardDirection(-this.getForwardDirection());
                this.setTimeSinceHit(10);
                this.setDamageTaken(this.getDamageTaken() + (amount * 1.5F) * 10.0F);
                this.markVelocityChanged();
                boolean flag = source.getTrueSource() instanceof EntityPlayer && ((EntityPlayer)source.getTrueSource()).capabilities.isCreativeMode;

                if (flag || this.getDamageTaken() > 40.0F)
                {
                    if (!flag && this.world.getGameRules().getBoolean("doEntityDrops"))
                    {
                        this.dropItemWithOffset(this.getItemBoat(), 1, 0.0F);
                    }

                    this.setDead();
                }

                return true;
            }
        }
        else
        {
            return true;
        }
    }

    @Override
    public void applyEntityCollision(Entity entityIn)
    {
        if (entityIn instanceof EntityBoat)
        {
            if (entityIn.getEntityBoundingBox().minY < this.getEntityBoundingBox().maxY)
            {
                super.applyEntityCollision(entityIn);
            }
        }
        else if (entityIn.getEntityBoundingBox().minY <= this.getEntityBoundingBox().minY)
        {
            super.applyEntityCollision(entityIn);
        }
    }

    @Override
    public Item getItemBoat()
    {
        switch (this.getPNBoatType())
        {
            case AGATHIS: default:
                return ItemAgathisBoatItem.block;
            case ALPIA:
                return ItemAlpiaBoatItem.block;
            case APPLE:
                return ItemAppleBoatItem.block;
            case ARAUCARIA:
                return ItemAraucariaBoatItem.block;
            case ARAUCARIOXYLON:
                return ItemAraucarioxylonBoatItem.block;
            case ARAUCARITES:
                return ItemAraucaritesBoatItem.block;
            case ARCHAEANTHUS:
                return ItemArchaeanthusBoatItem.block;
            case ARCHAEOPTERIS:
                return ItemArchaeopterisBoatItem.block;
            case ARTHROPITYS:
                return ItemArthropitysBoatItem.block;
            case ARTOCARPUS:
                return ItemArtocarpusBoatItem.block;
            case BEECH:
                return ItemBeechBoatItem.block;
            case BOTHRODENDRON:
                return ItemBothrodendronBoatItem.block;
            case BRACHYPHYLLUM:
                return ItemBrachyphyllumBoatItem.block;
            case BRISTLECONE:
                return ItemBristleconeBoatItem.block;
            case CALAMITES:
                return ItemCalamitesBoatItem.block;
            case CEPHALOTAXUS:
                return ItemCephalotaxusBoatItem.block;
            case CORDAITES:
                return ItemCordaitesBoatItem.block;
            case CUNNINGHAMIA:
                return ItemCunninghamiaBoatItem.block;
            case CYPRESS:
                return ItemCypressBoatItem.block;
            case CZEKANOWSKIA:
                return ItemCzekanowskiaBoatItem.block;
            case DAWN_REDWOOD:
                return ItemDawnRedwoodBoatItem.block;
            case DEAD:
                return ItemDeadBoatItem.block;
            case DIAPHORODENDRON:
                return ItemDiaphorodendronBoatItem.block;
            case DICROIDIUM_F:
                return ItemDicroidiumFBoatItem.block;
            case DICROIDIUM_O:
                return ItemDicroidiumOBoatItem.block;
            case FURCULA:
                return ItemFurculaBoatItem.block;
            case GANGAMOPTERIS:
                return ItemGangamopterisBoatItem.block;
            case GINKGO:
                return ItemGinkgoBoatItem.block;
            case GINKGOITES:
                return ItemGinkgoitesBoatItem.block;
            case GLOSSOPTERIS:
                return ItemGlossopterisBoatItem.block;
            case HIRONOIA:
                return ItemHironoiaBoatItem.block;
            case HYMENAEA:
                return ItemHymenaeaBoatItem.block;
            case LEPIDODENDRON:
                return ItemLepidodendronBoatItem.block;
            case LEPIDOPHLOIOS:
                return ItemLepidophloiosBoatItem.block;
            case LIRIODENDRON:
                return ItemLiriodendronBoatItem.block;
            case MACRONEUROPTERIS:
                return ItemMacroneuropterisBoatItem.block;
            case MAGNOLIA:
                return ItemMagnoliaBoatItem.block;
            case MAPLE:
                return ItemMapleBoatItem.block;
            case NOTHOFAGUS:
                return ItemNothofagusBoatItem.block;
            case PENTOXYLALES:
                return ItemPentoxylalesBoatItem.block;
            case PHOENICOPSIS:
                return ItemPhoenicopsisBoatItem.block;
            case PITYS:
                return ItemPitysBoatItem.block;
            case PLANE:
                return ItemPlaneBoatItem.block;
            case PODOCARP:
                return ItemPodocarpBoatItem.block;
            case PODOZAMITES:
                return ItemPodozamitesBoatItem.block;
            case REDWOOD:
                return ItemRedwoodBoatItem.block;
            case SCIADOPITYS:
                return ItemSciadopitysBoatItem.block;
            case SCRUBBY_PINE:
                return ItemScrubbyPineBoatItem.block;
            case SIGILLARIA:
                return ItemSigillariaBoatItem.block;
            case SPHENOBAIERA:
                return ItemSphenobaieraBoatItem.block;
            case SYCAMORE:
                return ItemSycamoreBoatItem.block;
            case TAXODIUM:
                return ItemTaxodiumBoatItem.block;
            case TELEMACHUS:
                return ItemTelemachusBoatItem.block;
            case WALCHIA:
                return ItemWalchiaBoatItem.block;
            case WOLLEMI:
                return ItemWollemiBoatItem.block;
            case YEW:
                return ItemYewBoatItem.block;
            case PHOENIX:
                return ItemPhoenixBoatItem.block;
            case ELATOCLADUS:
                return ItemElatocladusBoatItem.block;
            case NEHVIZDYELLA:
                return ItemNehvizdyellaBoatItem.block;
            case LAURUS:
                return ItemLaurusBoatItem.block;
            case CHESTNUT:
                return ItemChestnutBoatItem.block;
            case BISONIA:
                return ItemBisoniaBoatItem.block;
            case EMBOTHRIUM:
                return ItemEmbothriumBoatItem.block;
            case PAGIOPHYLLUM:
                return ItemPagiophyllumBoatItem.block;
            case HIRMERIELLA:
                return ItemHirmeriellaBoatItem.block;
            case FIG:
                return ItemFigBoatItem.block;
            case GOLDEN_LARCH:
                return ItemGoldenLarchBoatItem.block;
            case ARID_PINE:
                return ItemAridPineBoatItem.block;
            case OLIVE:
                return ItemOliveBoatItem.block;
            case CEDAR:
                return ItemCedarBoatItem.block;
            case THUJA:
                return ItemThujaBoatItem.block;
            case LIQUIDAMBAR:
                return ItemLiquidambarBoatItem.block;
            case SYNCHYSIDENDRON:
                return ItemSynchysidendronBoatItem.block;
            case DOYLEALES:
                return ItemDoylealesBoatItem.block;
            case SATPURAPHYLLUM:
                return ItemSatpuraphyllumaBoatItem.block;
            case ULLMANNIA:
                return ItemUllmanniaBoatItem.block;
            case BIARMOBAIERA:
                return ItemBiarmobaieraBoatItem.block;
            case LEPTOPHLOEUM:
                return ItemLeptophloeumBoatItem.block;
            case MIROVIA:
                return ItemMiroviaBoatItem.block;
            case ALBERTIA:
                return ItemAlbertiaBoatItem.block;
            case WOODWORTHIA:
                return ItemWoodworthiaBoatItem.block;
            case ARBORAMOSA:
                return ItemArboramosaBoatItem.block;
            case SCHILDERIA:
                return ItemSchilderiaBoatItem.block;
            case DRYOPHYLLUM:
                return ItemDryophyllumBoatItem.block;
            case BEAUPREA:
                return ItemBeaupreaBoatItem.block;
            case POPULUS:
                return ItemPopulusBoatItem.block;
            case SAURAUIA:
                return ItemSaurauiaBoatItem.block;
            case ABIES:
                return ItemAbiesBoatItem.block;
            case GLYPTOSTROBUS:
                return ItemGlyptostrobusBoatItem.block;
            case TSUGA:
                return ItemTsugaBoatItem.block;
            case TORREYA:
                return ItemTorreyaBoatItem.block;

        }
    }

    public Block getItemPlanks()
    {
        switch (this.getPNBoatType())
        {
            case AGATHIS: default:
                return BlockAgathisPlanks.block;
            case ALPIA:
                return BlockAlpiaPlanks.block;
            case APPLE:
                return BlockApplePlanks.block;
            case ARAUCARIA:
                return BlockAraucariaPlanks.block;
            case ARAUCARIOXYLON:
                return BlockAraucarioxylonPlanks.block;
            case ARAUCARITES:
                return BlockAraucaritesPlanks.block;
            case ARCHAEANTHUS:
                return BlockArchaeanthusPlanks.block;
            case ARCHAEOPTERIS:
                return BlockArchaeopterisPlanks.block;
            case ARTHROPITYS:
                return BlockArthropitysPlanks.block;
            case ARTOCARPUS:
                return BlockArtocarpusPlanks.block;
            case BEECH:
                return BlockBeechPlanks.block;
            case BOTHRODENDRON:
                return BlockBothrodendronPlanks.block;
            case BRACHYPHYLLUM:
                return BlockBrachyphyllumPlanks.block;
            case BRISTLECONE:
                return BlockBristleconePlanks.block;
            case CALAMITES:
                return BlockCalamitesPlanks.block;
            case CEPHALOTAXUS:
                return BlockCephalotaxusPlanks.block;
            case CORDAITES:
                return BlockCordaitesPlanks.block;
            case CUNNINGHAMIA:
                return BlockCunninghamiaPlanks.block;
            case CYPRESS:
                return BlockCypressPlanks.block;
            case CZEKANOWSKIA:
                return BlockCzekanowskiaPlanks.block;
            case DAWN_REDWOOD:
                return BlockDawnRedwoodPlanks.block;
            case DEAD:
                return BlockDeadPlanks.block;
            case DIAPHORODENDRON:
                return BlockDiaphorodendronPlanks.block;
            case DICROIDIUM_F:
                return BlockDicroidiumFPlanks.block;
            case DICROIDIUM_O:
                return BlockDicroidiumOPlanks.block;
            case FURCULA:
                return BlockFurculaPlanks.block;
            case GANGAMOPTERIS:
                return BlockGangamopterisPlanks.block;
            case GINKGO:
                return BlockGinkgoPlanks.block;
            case GINKGOITES:
                return BlockGinkgoitesPlanks.block;
            case GLOSSOPTERIS:
                return BlockGlossopterisPlanks.block;
            case HIRONOIA:
                return BlockHironoiaPlanks.block;
            case HYMENAEA:
                return BlockHymenaeaPlanks.block;
            case LEPIDODENDRON:
                return BlockWoodenPlanks.block;
            case LEPIDOPHLOIOS:
                return BlockLepidophloiosPlanks.block;
            case LIRIODENDRON:
                return BlockLiriodendronPlanks.block;
            case MACRONEUROPTERIS:
                return BlockMacroneuropterisPlanks.block;
            case MAGNOLIA:
                return BlockMagnoliaPlanks.block;
            case MAPLE:
                return BlockMaplePlanks.block;
            case NOTHOFAGUS:
                return BlockNothofagusPlanks.block;
            case PENTOXYLALES:
                return BlockPentoxylalesPlanks.block;
            case PHOENICOPSIS:
                return BlockPhoenicopsisPlanks.block;
            case PITYS:
                return BlockPitysPlanks.block;
            case PLANE:
                return BlockPlanePlanks.block;
            case PODOCARP:
                return BlockPodocarpPlanks.block;
            case PODOZAMITES:
                return BlockPodozamitesPlanks.block;
            case REDWOOD:
                return BlockRedwoodPlanks.block;
            case SCIADOPITYS:
                return BlockSciadopitysPlanks.block;
            case SCRUBBY_PINE:
                return BlockScrubbyPinePlanks.block;
            case SIGILLARIA:
                return BlockSigillariaPlanks.block;
            case SPHENOBAIERA:
                return BlockSphenobaieraPlanks.block;
            case SYCAMORE:
                return BlockSycamorePlanks.block;
            case TAXODIUM:
                return BlockTaxodiumPlanks.block;
            case TELEMACHUS:
                return BlockTelemachusPlanks.block;
            case WALCHIA:
                return BlockWalchiaPlanks.block;
            case WOLLEMI:
                return BlockWollemiPlanks.block;
            case YEW:
                return BlockYewPlanks.block;
            case PHOENIX:
                return BlockPhoenixPlanks.block;
            case ELATOCLADUS:
                return BlockElatocladusPlanks.block;
            case NEHVIZDYELLA:
                return BlockNehvizdyellaPlanks.block;
            case LAURUS:
                return BlockLaurusPlanks.block;
            case CHESTNUT:
                return BlockChestnutPlanks.block;
            case BISONIA:
                return BlockBisoniaPlanks.block;
            case EMBOTHRIUM:
                return BlockEmbothriumPlanks.block;
            case PAGIOPHYLLUM:
                return BlockPagiophyllumPlanks.block;
            case HIRMERIELLA:
                return BlockHirmeriellaPlanks.block;
            case FIG:
                return BlockFigPlanks.block;
            case GOLDEN_LARCH:
                return BlockGoldenLarchPlanks.block;
            case ARID_PINE:
                return BlockAridPinePlanks.block;
            case OLIVE:
                return BlockOlivePlanks.block;
            case CEDAR:
                return BlockCedarPlanks.block;
            case THUJA:
                return BlockThujaPlanks.block;
            case LIQUIDAMBAR:
                return BlockLiquidambarPlanks.block;
            case SYNCHYSIDENDRON:
                return BlockSynchysidendronPlanks.block;
            case DOYLEALES:
                return BlockDoylealesPlanks.block;
            case SATPURAPHYLLUM:
                return BlockSatpuraphyllumPlanks.block;
            case ULLMANNIA:
                return BlockUllmanniaPlanks.block;
            case BIARMOBAIERA:
                return BlockBiarmobaieraPlanks.block;
            case LEPTOPHLOEUM:
                return BlockLeptophloeumPlanks.block;
            case MIROVIA:
                return BlockMiroviaPlanks.block;
            case ALBERTIA:
                return BlockAlbertiaPlanks.block;
            case WOODWORTHIA:
                return BlockWoodworthiaPlanks.block;
            case ARBORAMOSA:
                return BlockArboramosaPlanks.block;
            case SCHILDERIA:
                return BlockSchilderiaPlanks.block;
            case DRYOPHYLLUM:
                return BlockDryophyllumPlanks.block;
            case BEAUPREA:
                return BlockBeaupreaPlanks.block;
            case POPULUS:
                return BlockPopulusPlanks.block;
            case SAURAUIA:
                return BlockSaurauiaPlanks.block;
            case ABIES:
                return BlockAbiesPlanks.block;
            case GLYPTOSTROBUS:
                return BlockGlyptostrobusPlanks.block;
            case TSUGA:
                return BlockTsugaPlanks.block;
            case TORREYA:
                return BlockTorreyaPlanks.block;

        }
    }

    @Override
    @Nonnull
    public ItemStack getPickedResult(RayTraceResult target)
    {
        return new ItemStack(this.getItemBoat());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void performHurtAnimation()
    {
        this.setForwardDirection(-this.getForwardDirection());
        this.setTimeSinceHit(10);
        this.setDamageTaken(this.getDamageTaken() * 11.0F);
    }

    @Override
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
        this.lerpX = x;
        this.lerpY = y;
        this.lerpZ = z;
        this.lerpYaw = (double)yaw;
        this.lerpPitch = (double)pitch;
        this.lerpSteps = 10;
    }

    @Override
    public EnumFacing getAdjustedHorizontalFacing()
    {
        return this.getHorizontalFacing().rotateY();
    }

    @Override
    public void onUpdate()
    {

        this.previousStatus = this.status;
        this.status = this.getBoatStatus();

        if (this.status != EntityPNBoat.Status.UNDER_WATER && this.status != EntityPNBoat.Status.UNDER_FLOWING_WATER)
        {
            this.outOfControlTicks = 0.0F;
        }
        else
        {
            ++this.outOfControlTicks;
        }

        if (!this.world.isRemote && this.outOfControlTicks >= 60.0F)
        {
            this.removePassengers();
        }

        if (this.getTimeSinceHit() > 0)
        {
            this.setTimeSinceHit(this.getTimeSinceHit() - 1);
        }

        if (this.getDamageTaken() > 0.0F)
        {
            this.setDamageTaken(this.getDamageTaken() - 1.0F);
        }

        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        //super.onUpdate();
        if (!this.world.isRemote)
        {
            this.setFlag(6, this.isGlowing());
        }
        super.onEntityUpdate();


        this.tickLerp();

        if (this.canPassengerSteer())
        {
            if (this.getPassengers().isEmpty() || !(this.getPassengers().get(0) instanceof EntityPlayer))
            {
                this.setPaddleState(false, false);
            }

            this.updateMotion();

            if (this.world.isRemote)
            {
                this.controlBoat();
                this.world.sendPacketToServer(new CPacketSteerBoat(this.getPaddleState(0), this.getPaddleState(1)));
            }

            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
        }
        else
        {
            this.motionX = 0.0D;
            this.motionY = 0.0D;
            this.motionZ = 0.0D;
        }

        for (int i = 0; i <= 1; ++i)
        {
            if (this.getPaddleState(i))
            {
                if (!this.isSilent() && (double)(this.paddlePositions[i] % ((float)Math.PI * 2F)) <= (Math.PI / 4D) && ((double)this.paddlePositions[i] + 0.39269909262657166D) % (Math.PI * 2D) >= (Math.PI / 4D))
                {
                    SoundEvent soundevent = this.getPaddleSound();
                    if (soundevent != null)
                    {
                        Vec3d vec3d = this.getLook(1.0F);
                        double d0 = i == 1 ? -vec3d.z : vec3d.z;
                        double d1 = i == 1 ? vec3d.x : -vec3d.x;
                        this.world.playSound((EntityPlayer)null, this.posX + d0, this.posY, this.posZ + d1, soundevent, this.getSoundCategory(), 1.0F, 0.8F + 0.4F * this.rand.nextFloat());
                    }
                }

                this.paddlePositions[i] = (float)((double)this.paddlePositions[i] + 0.39269909262657166D);
            }
            else
            {
                this.paddlePositions[i] = 0.0F;
            }
        }

        this.doBlockCollisions();
        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().grow(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), EntitySelectors.getTeamCollisionPredicate(this));

        if (!list.isEmpty())
        {
            boolean flag = !this.world.isRemote && !(this.getControllingPassenger() instanceof EntityPlayer);

            for (int j = 0; j < list.size(); ++j)
            {
                Entity entity = list.get(j);

                if (!entity.isPassenger(this))
                {
                    if (flag && this.getPassengers().size() < 2 && !entity.isRiding() && entity.width < this.width && entity instanceof EntityLivingBase && !(entity instanceof EntityWaterMob) && !(entity instanceof EntityPlayer))
                    {
                        entity.startRiding(this);
                    }
                    else
                    {
                        this.applyEntityCollision(entity);
                    }
                }
            }
        }
    }

    @Nullable
    @Override
    protected SoundEvent getPaddleSound()
    {
        switch (this.getBoatStatus())
        {
            case IN_WATER:
            case UNDER_WATER:
            case UNDER_FLOWING_WATER:
                return SoundEvents.ENTITY_BOAT_PADDLE_WATER;
            case ON_LAND:
                return SoundEvents.ENTITY_BOAT_PADDLE_LAND;
            case IN_AIR:
            default:
                return null;
        }
    }

    private void tickLerp()
    {
        if (this.lerpSteps > 0 && !this.canPassengerSteer())
        {
            double d0 = this.posX + (this.lerpX - this.posX) / (double)this.lerpSteps;
            double d1 = this.posY + (this.lerpY - this.posY) / (double)this.lerpSteps;
            double d2 = this.posZ + (this.lerpZ - this.posZ) / (double)this.lerpSteps;
            double d3 = MathHelper.wrapDegrees(this.lerpYaw - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.lerpSteps);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.lerpPitch - (double)this.rotationPitch) / (double)this.lerpSteps);
            --this.lerpSteps;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
    }

    @Override
    public void setPaddleState(boolean left, boolean right)
    {
        this.dataManager.set(DATA_ID_PADDLE[0], Boolean.valueOf(left));
        this.dataManager.set(DATA_ID_PADDLE[1], Boolean.valueOf(right));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public float getRowingTime(int side, float limbSwing)
    {
        return this.getPaddleState(side) ? (float)MathHelper.clampedLerp((double)this.paddlePositions[side] - 0.39269909262657166D, (double)this.paddlePositions[side], (double)limbSwing) : 0.0F;
    }

    private EntityPNBoat.Status getBoatStatus()
    {
        EntityPNBoat.Status EntityBoatLepidodendron$status = this.getUnderwaterStatus();

        if (EntityBoatLepidodendron$status != null)
        {
            this.waterLevel = this.getEntityBoundingBox().maxY;
            return EntityBoatLepidodendron$status;
        }
        else if (this.checkInWater())
        {
            if (this.getPNBoatType() == Type.CALAMITES)
            {
                //Calamites boats sink!
                return EntityPNBoat.Status.UNDER_WATER;
            }
            return EntityPNBoat.Status.IN_WATER;
        }
        else
        {
            float f = this.getBoatGlide();

            if (f > 0.0F)
            {
                this.boatGlide = f;
                return EntityPNBoat.Status.ON_LAND;
            }
            else
            {
                return EntityPNBoat.Status.IN_AIR;
            }
        }
    }

    @Override
    public float getWaterLevelAbove()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.maxY);
        int l = MathHelper.ceil(axisalignedbb.maxY - this.lastYd);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            label108:

            for (int k1 = k; k1 < l; ++k1)
            {
                float f = 0.0F;
                int l1 = i;

                while (true)
                {
                    if (l1 >= j)
                    {
                        if (f < 1.0F)
                        {
                            float f2 = (float)blockpos$pooledmutableblockpos.getY() + f;
                            return f2;
                        }

                        break;
                    }

                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(l1, k1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER)
                        {
                            f = Math.max(f, BlockLiquid.getBlockLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos));
                        }

                        if (f >= 1.0F)
                        {
                            continue label108;
                        }
                    }

                    ++l1;
                }
            }

            float f1 = (float)(l + 1);
            return f1;
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }
    }

    @Override
    public float getBoatGlide()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        AxisAlignedBB axisalignedbb1 = new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY - 0.001D, axisalignedbb.minZ, axisalignedbb.maxX, axisalignedbb.minY, axisalignedbb.maxZ);
        int i = MathHelper.floor(axisalignedbb1.minX) - 1;
        int j = MathHelper.ceil(axisalignedbb1.maxX) + 1;
        int k = MathHelper.floor(axisalignedbb1.minY) - 1;
        int l = MathHelper.ceil(axisalignedbb1.maxY) + 1;
        int i1 = MathHelper.floor(axisalignedbb1.minZ) - 1;
        int j1 = MathHelper.ceil(axisalignedbb1.maxZ) + 1;
        List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();
        float f = 0.0F;
        int k1 = 0;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int l1 = i; l1 < j; ++l1)
            {
                for (int i2 = i1; i2 < j1; ++i2)
                {
                    int j2 = (l1 != i && l1 != j - 1 ? 0 : 1) + (i2 != i1 && i2 != j1 - 1 ? 0 : 1);

                    if (j2 != 2)
                    {
                        for (int k2 = k; k2 < l; ++k2)
                        {
                            if (j2 <= 0 || k2 != k && k2 != l - 1)
                            {
                                blockpos$pooledmutableblockpos.setPos(l1, k2, i2);
                                IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);
                                iblockstate.addCollisionBoxToList(this.world, blockpos$pooledmutableblockpos, axisalignedbb1, list, this, false);

                                if (!list.isEmpty())
                                {
                                    f += iblockstate.getBlock().getSlipperiness(iblockstate, this.world, blockpos$pooledmutableblockpos, this);
                                    ++k1;
                                }

                                list.clear();
                            }
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return f / (float)k1;
    }

    private boolean checkInWater()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.minY);
        int l = MathHelper.ceil(axisalignedbb.minY + 0.001D);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        boolean flag = false;
        this.waterLevel = Double.MIN_VALUE;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int k1 = i; k1 < j; ++k1)
            {
                for (int l1 = k; l1 < l; ++l1)
                {
                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(k1, l1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER)
                        {
                            float f = BlockLiquid.getLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos);
                            this.waterLevel = Math.max((double)f, this.waterLevel);
                            flag |= axisalignedbb.minY < (double)f;
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return flag;
    }

    @Nullable
    private EntityPNBoat.Status getUnderwaterStatus()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        double d0 = axisalignedbb.maxY + 0.001D;
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.maxY);
        int l = MathHelper.ceil(d0);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        boolean flag = false;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int k1 = i; k1 < j; ++k1)
            {
                for (int l1 = k; l1 < l; ++l1)
                {
                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(k1, l1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER && d0 < (double)BlockLiquid.getLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos))
                        {
                            if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() != 0)
                            {
                                EntityPNBoat.Status EntityBoatLepidodendron$status = EntityPNBoat.Status.UNDER_FLOWING_WATER;
                                return EntityBoatLepidodendron$status;
                            }

                            flag = true;
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return flag ? EntityPNBoat.Status.UNDER_WATER : null;
    }

    private void updateMotion()
    {
        double d0 = -0.03999999910593033D;
        double d1 = this.hasNoGravity() ? 0.0D : -0.03999999910593033D;
        double d2 = 0.0D;
        this.momentum = 0.05F;

        if (this.previousStatus == EntityPNBoat.Status.IN_AIR && this.status != EntityPNBoat.Status.IN_AIR && this.status != EntityPNBoat.Status.ON_LAND)
        {
            this.waterLevel = this.getEntityBoundingBox().minY + (double)this.height;
            this.setPosition(this.posX, (double)(this.getWaterLevelAbove() - this.height) + 0.101D, this.posZ);
            this.motionY = 0.0D;
            this.lastYd = 0.0D;
            this.status = EntityPNBoat.Status.IN_WATER;
        }
        else
        {
            if (this.status == EntityPNBoat.Status.IN_WATER
            ) {
                d2 = (this.waterLevel - this.getEntityBoundingBox().minY) / (double)this.height;
                this.momentum = 0.9F;
            }
            else if (this.status == EntityPNBoat.Status.UNDER_FLOWING_WATER)
            {
                d1 = -7.0E-4D;
                this.momentum = 0.9F;
            }
            else if (this.status == EntityPNBoat.Status.UNDER_WATER)
            {
                d2 = 0.009999999776482582D;
                this.momentum = 0.45F;
            }
            else if (this.status == EntityPNBoat.Status.IN_AIR)
            {
                this.momentum = 0.9F;
            }
            else if (this.status == EntityPNBoat.Status.ON_LAND)
            {
                this.momentum = this.boatGlide;

                if (this.getControllingPassenger() instanceof EntityPlayer)
                {
                    this.boatGlide /= 2.0F;
                }
            }

            this.motionX *= (double)this.momentum;
            this.motionZ *= (double)this.momentum;
            this.deltaRotation *= this.momentum;
            this.motionY += d1;

            if (d2 > 0.0D)
            {
                double d3 = 0.65D;
                this.motionY += d2 * 0.06153846016296973D;
                double d4 = 0.75D;
                this.motionY *= 0.75D;
            }
        }
    }

    private void controlBoat()
    {
        if (this.isBeingRidden())
        {
            float f = 0.0F;
            float f1 = 0.0F;

            if (this.leftInputDown)
            {
                this.deltaRotation += -1.0F;
            }

            if (this.rightInputDown)
            {
                ++this.deltaRotation;
            }

            if (this.rightInputDown != this.leftInputDown && !this.forwardInputDown && !this.backInputDown)
            {
                f += 0.005F;
            }

            this.rotationYaw += this.deltaRotation;
            this.rotationPitch += this.deltaPitch;

            if (this.forwardInputDown)
            {
                f += 0.04F;
            }

            if (this.backInputDown)
            {
                f -= 0.005F;
            }

            this.motionX += (double)(MathHelper.sin(-this.rotationYaw * 0.017453292F) * f);
            this.motionZ += (double)(MathHelper.cos(this.rotationYaw * 0.017453292F) * f);

            this.setPaddleState(this.rightInputDown && !this.leftInputDown || this.forwardInputDown, this.leftInputDown && !this.rightInputDown || this.forwardInputDown);
        }
    }

    @Override
    public void updatePassenger(Entity passenger)
    {
        if (this.isPassenger(passenger))
        {
            float f = 0.0F;
            float f1 = (float)((this.isDead ? 0.009999999776482582D : this.getMountedYOffset()) + passenger.getYOffset());

            if (this.getPassengers().size() > 1)
            {
                int i = this.getPassengers().indexOf(passenger);

                if (i == 0)
                {
                    f = 0.2F;
                }
                else
                {
                    f = -0.6F;
                }

                if (passenger instanceof EntityAnimal)
                {
                    f = (float)((double)f + 0.2D);
                }
            }

            Vec3d vec3d = (new Vec3d((double)f, 0.0D, 0.0D)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
            passenger.setPosition(this.posX + vec3d.x, this.posY + (double)f1, this.posZ + vec3d.z);
            passenger.rotationYaw += this.deltaRotation;
            passenger.setRotationYawHead(passenger.getRotationYawHead() + this.deltaRotation);
            this.applyYawToEntity(passenger);

            if (passenger instanceof EntityAnimal && this.getPassengers().size() > 1)
            {
                int j = passenger.getEntityId() % 2 == 0 ? 90 : 270;
                passenger.setRenderYawOffset(((EntityAnimal)passenger).renderYawOffset + (float)j);
                passenger.setRotationYawHead(passenger.getRotationYawHead() + (float)j);
            }
        }
    }

    @Override
    protected void applyYawToEntity(Entity entityToUpdate)
    {
        entityToUpdate.setRenderYawOffset(this.rotationYaw);
        float f = MathHelper.wrapDegrees(entityToUpdate.rotationYaw - this.rotationYaw);
        float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
        entityToUpdate.prevRotationYaw += f1 - f;
        entityToUpdate.rotationYaw += f1 - f;
        entityToUpdate.setRotationYawHead(entityToUpdate.rotationYaw);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void applyOrientationToEntity(Entity entityToUpdate)
    {
        this.applyYawToEntity(entityToUpdate);
    }

    @Override
    public String getName() {
        if (this.hasCustomName())
        {
            return this.getCustomNameTag();
        }
        else
        {
            return I18n.translateToLocal("item.pf_" + this.getPNBoatType().getName() + "_boat_item.name");
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setString("Type", this.getPNBoatType().getName());
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound)
    {
        if (compound.hasKey("Type", 8))
        {
            this.setBoatType(EntityPNBoat.Type.getTypeFromString(compound.getString("Type")));
        }
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
    {
        if (player.isSneaking())
        {
            return false;
        }
        else
        {
            if (!this.world.isRemote && this.outOfControlTicks < 60.0F)
            {
                player.startRiding(this);
            }

            return true;
        }
    }

    @Override
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos)
    {
        this.lastYd = this.motionY;

        if (!this.isRiding())
        {
            if (onGroundIn)
            {
                if (this.fallDistance > 3.0F)
                {
                    if (this.status != EntityPNBoat.Status.ON_LAND)
                    {
                        this.fallDistance = 0.0F;
                        return;
                    }

                    this.fall(this.fallDistance, 1.0F);

                    if (!this.world.isRemote && !this.isDead)
                    {
                        this.setDead();

                        if (this.world.getGameRules().getBoolean("doEntityDrops"))
                        {
                            for (int i = 0; i < 3; ++i)
                            {
                                this.entityDropItem(new ItemStack(this.getItemPlanks(), 1), 0.0F);
                            }

                            for (int j = 0; j < 2; ++j)
                            {
                                this.dropItemWithOffset(Items.STICK, 1, 0.0F);
                            }
                        }
                    }
                }

                this.fallDistance = 0.0F;
            }
            else if (this.world.getBlockState((new BlockPos(this)).down()).getMaterial() != Material.WATER && y < 0.0D)
            {
                this.fallDistance = (float)((double)this.fallDistance - y);
            }
        }
    }

    @Override
    public boolean getPaddleState(int side)
    {
        return ((Boolean)this.dataManager.get(DATA_ID_PADDLE[side])).booleanValue() && this.getControllingPassenger() != null;
    }

    @Override
    public void setDamageTaken(float damageTaken)
    {
        this.dataManager.set(DAMAGE_TAKEN, Float.valueOf(damageTaken));
    }

    @Override
    public float getDamageTaken()
    {
        return ((Float)this.dataManager.get(DAMAGE_TAKEN)).floatValue();
    }

    @Override
    public void setTimeSinceHit(int timeSinceHit)
    {
        this.dataManager.set(TIME_SINCE_HIT, Integer.valueOf(timeSinceHit));
    }

    @Override
    public int getTimeSinceHit()
    {
        return ((Integer)this.dataManager.get(TIME_SINCE_HIT)).intValue();
    }

    @Override
    public void setForwardDirection(int forwardDirection)
    {
        this.dataManager.set(FORWARD_DIRECTION, Integer.valueOf(forwardDirection));
    }

    @Override
    public int getForwardDirection()
    {
        return ((Integer)this.dataManager.get(FORWARD_DIRECTION)).intValue();
    }

    public void setBoatType(EntityPNBoat.Type boatType)
    {
        this.dataManager.set(BOAT_TYPE, Integer.valueOf(boatType.ordinal()));
    }

    public void setBoatType(int boatType)
    {
        this.dataManager.set(BOAT_TYPE, Integer.valueOf(boatType));
    }

    public EntityPNBoat.Type getPNBoatType()
    {
        return EntityPNBoat.Type.byId(((Integer)this.dataManager.get(BOAT_TYPE)).intValue());
    }

    @Override
    protected boolean canFitPassenger(Entity passenger)
    {
        return this.getPassengers().size() < 2;
    }

    @Nullable
    @Override
    public Entity getControllingPassenger()
    {
        List<Entity> list = this.getPassengers();
        return list.isEmpty() ? null : (Entity)list.get(0);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void updateInputs(boolean p_184442_1_, boolean p_184442_2_, boolean p_184442_3_, boolean p_184442_4_)
    {
        this.leftInputDown = p_184442_1_;
        this.rightInputDown = p_184442_2_;
        this.forwardInputDown = p_184442_3_;
        this.backInputDown = p_184442_4_;
    }

    public static enum Status
    {
        IN_WATER,
        UNDER_WATER,
        UNDER_FLOWING_WATER,
        ON_LAND,
        IN_AIR;
    }

    public static enum Type
    {
        AGATHIS(1, "agathis"),
        ALPIA(2, "alpia"),
        APPLE(3, "apple"),
        ARAUCARIA(4, "araucaria"),
        ARAUCARIOXYLON(5, "araucarioxylon"),
        ARAUCARITES(6, "araucarites"),
        ARCHAEANTHUS(7, "archaeanthus"),
        ARCHAEOPTERIS(8, "archaeopteris"),
        ARTHROPITYS(9, "arthropitys"),
        ARTOCARPUS(10, "artocarpus"),
        BEECH(11, "beech"),
        BOTHRODENDRON(12, "bothrodendron"),
        BRACHYPHYLLUM(13, "brachyphyllum"),
        BRISTLECONE(14, "bristlecone"),
        CALAMITES(15, "calamites"),
        CEPHALOTAXUS(16, "cephalotaxus"),
        CORDAITES(17, "cordaites"),
        CUNNINGHAMIA(18, "cunninghamia"),
        CYPRESS(19, "cypress"),
        CZEKANOWSKIA(20, "czekanowskia"),
        DAWN_REDWOOD(21, "dawn_redwood"),
        DEAD(22, "dead"),
        DIAPHORODENDRON(23, "diaphorodendron"),
        DICROIDIUM_F(24, "dicroidium_f"),
        DICROIDIUM_O(25, "dicroidium_o"),
        FURCULA(26, "furcula"),
        GANGAMOPTERIS(27, "gangamopteris"),
        GINKGO(28, "ginkgo"),
        GINKGOITES(29, "ginkgoites"),
        GLOSSOPTERIS(30, "glossopteris"),
        HIRONOIA(31, "hironoia"),
        HYMENAEA(32, "hymenaea"),
        LEPIDODENDRON(33, "lepidodendron"),
        LEPIDOPHLOIOS(34, "lepidophloios"),
        LIRIODENDRON(35, "liriodendron"),
        MACRONEUROPTERIS(36, "macroneuropteris"),
        MAGNOLIA(37, "magnolia"),
        MAPLE(38, "maple"),
        NOTHOFAGUS(39, "nothofagus"),
        PENTOXYLALES(40, "pentoxylales"),
        PHOENICOPSIS(41, "phoenicopsis"),
        PITYS(42, "pitys"),
        PLANE(43, "plane"),
        PODOCARP(44, "podocarp"),
        PODOZAMITES(45, "podozamites"),
        REDWOOD(46, "redwood"),
        SCIADOPITYS(47, "sciadopitys"),
        SCRUBBY_PINE(48, "scrubby_pine"),
        SIGILLARIA(49, "sigillaria"),
        SPHENOBAIERA(50, "sphenobaiera"),
        SYCAMORE(51, "sycamore"),
        TAXODIUM(52, "taxodium"),
        TELEMACHUS(53, "telemachus"),
        WALCHIA(54, "walchia"),
        WOLLEMI(55, "wollemi"),
        YEW(56, "yew"),
        PHOENIX(57, "phoenix"),
        ELATOCLADUS(58, "elatocladus"),
        NEHVIZDYELLA(59, "nehvizdyella"),
        LAURUS(60, "laurus"),
        CHESTNUT(61, "chestnut"),
        BISONIA(62, "bisonia"),
        EMBOTHRIUM(63, "embothrium"),
        PAGIOPHYLLUM(64, "pagiophyllum"),
        HIRMERIELLA(65, "hirmeriella"),
        FIG(66, "fig"),
        GOLDEN_LARCH(67, "golden_larch"),
        OLIVE(68, "olive"),
        CEDAR(69, "cedar"),
        ARID_PINE(70, "arid_pine"),
        THUJA(71, "arid_pine"),
        LIQUIDAMBAR(71, "liquidambar"),
        SYNCHYSIDENDRON(72, "synchysidendron"),
        DOYLEALES(73, "doyleales"),
        SATPURAPHYLLUM(74, "satpuraphyllum"),
        ULLMANNIA(75, "ullmannia"),
        BIARMOBAIERA(76, "biarmobaiera"),
        LEPTOPHLOEUM(77, "leptophloeum"),
        MIROVIA(78, "mirovia"),
        ALBERTIA(79, "albertia"),
        WOODWORTHIA(80, "woodworthia"),
        ARBORAMOSA(81, "arboramosa"),
        SCHILDERIA(82, "schilderia"),
        DRYOPHYLLUM(83, "dryophyllum"),
        BEAUPREA(84, "beauprea"),
        POPULUS(85, "populus"),
        SAURAUIA(86, "saurauia"),
        ABIES(87, "saurauia"),
        GLYPTOSTROBUS(88, "glyptostrobus"),
        TSUGA(89, "tsuga"),
        TORREYA(90, "torreya")
        ;

        private final String name;
        private final int metadata;

        private Type(int metadataIn, String nameIn)
        {
            this.name = nameIn;
            this.metadata = metadataIn;
        }

        public String getName()
        {
            return this.name;
        }

        public int getMetadata()
        {
            return this.metadata;
        }

        public String toString()
        {
            return this.name;
        }

        public static EntityPNBoat.Type byId(int id)
        {
            if (id < 0 || id >= values().length)
            {
                id = 0;
            }

            return values()[id];
        }

        public static EntityPNBoat.Type getTypeFromString(String nameIn)
        {
            for (int i = 0; i < values().length; ++i)
            {
                if (values()[i].getName().equals(nameIn))
                {
                    return values()[i];
                }
            }

            return values()[0];
        }
    }

    // Forge: Fix MC-119811 by instantly completing lerp on board
    @Override
    protected void addPassenger(Entity passenger)
    {
        super.addPassenger(passenger);
        if(this.canPassengerSteer() && this.lerpSteps > 0)
        {
            this.lerpSteps = 0;
            this.posX = this.lerpX;
            this.posY = this.lerpY;
            this.posZ = this.lerpZ;
            this.rotationYaw = (float)this.lerpYaw;
            this.rotationPitch = (float)this.lerpPitch;
        }
    }
}