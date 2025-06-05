package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityVolcanoFireball extends Entity
{

    Entity shootingEntity;

    public EntityVolcanoFireball(World worldIn)
    {
        super(worldIn);
        this.preventEntitySpawning = true;
        this.setSize(0.98F, 0.98F);
    }

    public EntityVolcanoFireball(World worldIn, double x, double y, double z, Entity shooter)
    {
        this(worldIn);
        this.setPosition(x, y, z);
        float f = (float)(Math.random() * (Math.PI * 2D));
        this.motionX = (double)(-((float)Math.sin((double)f)) * rand.nextFloat() * 1.1F);
        this.motionY = (double) 2.0F * rand.nextFloat() ;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * rand.nextFloat() * 1.1F);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        this.shootingEntity = shooter;
    }

    protected void onImpact(RayTraceResult result)
    {
        if (!this.world.isRemote)
        {
            boolean doGriefing = world.getGameRules().getBoolean("mobGriefing");
            if (!LepidodendronConfig.doVolcanoGriefing) {
                doGriefing = false;
            }
            if (!world.playerEntities.isEmpty() && doGriefing) {
                for (EntityPlayer currentPlayer : world.playerEntities) {
                    if ((currentPlayer.isSpectator()) || (currentPlayer.isCreative())) {
                        doGriefing = false;
                        break;
                    }
                }
            }
            if (result.entityHit != null)
            {
                if (!result.entityHit.isImmuneToFire())
                {
                    boolean flag = result.entityHit.attackEntityFrom(DamageSource.ON_FIRE, 5.0F);

                    if (flag && doGriefing)
                    {
                        result.entityHit.setFire(5);
                    }
                }
            }
            else
            {
                if (doGriefing)
                {
                    BlockPos blockpos = result.getBlockPos().offset(result.sideHit);

                    if (this.world.isAirBlock(blockpos))
                    {
                        this.world.setBlockState(blockpos, Blocks.FIRE.getDefaultState());
                    }
                }
            }

            this.setDead();
        }
    }

    public boolean canBeCollidedWith()
    {
        return false;
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {

    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return false;
    }

    @Override
    protected void entityInit() {

    }

    public void onUpdate()
    {

        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (!this.hasNoGravity())
        {
            this.motionY -= 0.03999999910593033D;
        }

        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
        this.motionY *= 0.9800000190734863D;

        if (this.world.isRemote) {
            this.setFire(1);
        }

        if (this.world.isBlockLoaded(new BlockPos(this))) {
            RayTraceResult raytraceresult = ProjectileHelper.forwardsRaycast(this, true, true, this.shootingEntity);

            if (raytraceresult != null)
            {
                this.onImpact(raytraceresult);
            }
            else if (this.onGround) {
                boolean doGriefing = world.getGameRules().getBoolean("mobGriefing");
                if (!LepidodendronConfig.doVolcanoGriefing) {
                    doGriefing = false;
                }
                if (!world.playerEntities.isEmpty() && doGriefing) {
                    for (EntityPlayer currentPlayer : world.playerEntities) {
                        if ((currentPlayer.isSpectator()) || (currentPlayer.isCreative())) {
                            doGriefing = false;
                            break;
                        }
                    }
                }
                if (doGriefing) {
                    this.world.setBlockState(this.getPosition(), Blocks.FIRE.getDefaultState());
                }
                this.setDead();
            }

            this.world.spawnParticle(EnumParticleTypes.FLAME, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            this.setDead();
        }

    }

}