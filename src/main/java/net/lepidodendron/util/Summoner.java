//package net.lepidodendron.util;
//
//import net.lepidodendron.entity.*;
//import net.minecraft.command.CommandBase;
//import net.minecraft.command.CommandException;
//import net.minecraft.command.ICommandSender;
//import net.minecraft.command.WrongUsageException;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityList;
//import net.minecraft.entity.EntityLiving;
//import net.minecraft.entity.IEntityLivingData;
//import net.minecraft.entity.effect.EntityLightningBolt;
//import net.minecraft.nbt.JsonToNBT;
//import net.minecraft.nbt.NBTException;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.server.MinecraftServer;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.util.math.Vec3d;
//import net.minecraft.world.World;
//import net.minecraft.world.chunk.storage.AnvilChunkLoader;
//
//import javax.annotation.Nullable;
//import java.util.Collections;
//import java.util.List;
//
//public class Summoner extends CommandBase
//{
//    public String getName()
//    {
//        return "pf_summon";
//    }
//
//    public int getRequiredPermissionLevel()
//    {
//        return 2;
//    }
//
//    public String getUsage(ICommandSender sender)
//    {
//        return "commands.summon.usage";
//    }
//
//    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
//    {
//        if (args.length < 1)
//        {
//            throw new WrongUsageException("commands.summon.usage", new Object[0]);
//        }
//        else
//        {
//            String s = args[0];
//
//            String variantStr = "";
//            if (s.indexOf("@") >= 0) {
//                variantStr = s.substring(s.indexOf("@") + 1);
//                s = s.substring(0,s.indexOf("@"));
//            }
//
//
//            BlockPos blockpos = sender.getPosition();
//            Vec3d vec3d = sender.getPositionVector();
//            double d0 = vec3d.x;
//            double d1 = vec3d.y;
//            double d2 = vec3d.z;
//
//            if (args.length >= 4)
//            {
//                d0 = parseDouble(d0, args[1], true);
//                d1 = parseDouble(d1, args[2], false);
//                d2 = parseDouble(d2, args[3], true);
//                blockpos = new BlockPos(d0, d1, d2);
//            }
//
//            d0 = blockpos.getX() + 0.5;
//            d2 = blockpos.getZ() + 0.5;
//
//            World world = sender.getEntityWorld();
//
//            if (!world.isBlockLoaded(blockpos))
//            {
//                throw new CommandException("commands.summon.outOfWorld", new Object[0]);
//            }
//            else if (EntityList.LIGHTNING_BOLT.equals(new ResourceLocation(s)))
//            {
//                world.addWeatherEffect(new EntityLightningBolt(world, d0, d1, d2, false));
//                //notifyCommandListener(sender, this, "commands.summon.success", new Object[0]);
//            }
//            else
//            {
//                NBTTagCompound nbttagcompound = new NBTTagCompound();
//                boolean flag = false;
//
//                if (args.length >= 5)
//                {
//                    String s1 = buildString(args, 4);
//
//                    try
//                    {
//                        nbttagcompound = JsonToNBT.getTagFromJson(s1);
//                        flag = true;
//                    }
//                    catch (NBTException nbtexception)
//                    {
//                        throw new CommandException("commands.summon.tagError", new Object[] {nbtexception.getMessage()});
//                    }
//                }
//
//                nbttagcompound.setString("id", s);
//                Entity entity = AnvilChunkLoader.readWorldEntityPos(nbttagcompound, world, d0, d1, d2, true);
//
//                if (entity == null)
//                {
//                    throw new CommandException("commands.summon.failed", new Object[0]);
//                }
//                else
//                {
//                    //System.err.println("Rand: " + ((world.rand.nextFloat() - 0.5F)/10F));
//                    entity.setLocationAndAngles(d0 + ((world.rand.nextFloat() - 0.5F)/10F), d1 + 0.25, d2 + ((world.rand.nextFloat() - 0.5F)/10F), MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
//
//                    if (!flag && entity instanceof EntityLiving)
//                    {
//                        ((EntityLiving)entity).onInitialSpawn(world.getDifficultyForLocation(new BlockPos(entity)), (IEntityLivingData)null);
//                    }
//
//                    //Exceptions for variants:
//                    if (entity instanceof EntityPrehistoricFloraPalaeodictyoptera && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraPalaeodictyoptera palaeodictyoptera = (EntityPrehistoricFloraPalaeodictyoptera) entity;
//                        palaeodictyoptera.setPNType(EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraPalaeodictyopteraNymph && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraPalaeodictyopteraNymph palaeodictyoptera = (EntityPrehistoricFloraPalaeodictyopteraNymph) entity;
//                        palaeodictyoptera.setPNType(EntityPrehistoricFloraPalaeodictyopteraNymph.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraDragonfly && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraDragonfly dragonfly = (EntityPrehistoricFloraDragonfly) entity;
//                        dragonfly.setPNType(EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraDragonflyNymph && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraDragonflyNymph dragonfly = (EntityPrehistoricFloraDragonflyNymph) entity;
//                        dragonfly.setPNType(EntityPrehistoricFloraDragonflyNymph.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraMegasecoptera && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraMegasecoptera dragonfly = (EntityPrehistoricFloraMegasecoptera) entity;
//                        dragonfly.setPNType(EntityPrehistoricFloraMegasecoptera.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraTitanoptera && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraTitanoptera titanoptera = (EntityPrehistoricFloraTitanoptera) entity;
//                        titanoptera.setPNType(EntityPrehistoricFloraTitanoptera.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraTitanopteraNymph && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraTitanopteraNymph titanoptera = (EntityPrehistoricFloraTitanopteraNymph) entity;
//                        titanoptera.setPNType(EntityPrehistoricFloraTitanopteraNymph.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraKalligrammatid && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraKalligrammatid kalligrammatid = (EntityPrehistoricFloraKalligrammatid) entity;
//                        kalligrammatid.setPNType(EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraNotostracan && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraNotostracan notostracan = (EntityPrehistoricFloraNotostracan) entity;
//                        notostracan.setPNType(EntityPrehistoricFloraNotostracan.Type.getTypeFromString(variantStr));
//                    }
//                    else if (entity instanceof EntityPrehistoricFloraLacewing && !variantStr.equalsIgnoreCase("")) {
//                        EntityPrehistoricFloraLacewing lacewing = (EntityPrehistoricFloraLacewing) entity;
//                        lacewing.setPNType(EntityPrehistoricFloraLacewing.Type.getTypeFromString(variantStr));
//                    }
////                    else if (entity instanceof EntityPrehistoricFloraLacewingNymph && !variantStr.equalsIgnoreCase("")) {
////                        EntityPrehistoricFloraLacewingNymph lacewing = (EntityPrehistoricFloraLacewingNymph) entity;
////                        lacewing.setPNType(EntityPrehistoricFloraLacewingNymph.Type.getTypeFromString(variantStr));
////                    }
//
//                    //notifyCommandListener(sender, this, "commands.summon.success", new Object[0]);
//                }
//            }
//        }
//    }
//
//    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos)
//    {
//        if (args.length == 1)
//        {
//            return getListOfStringsMatchingLastWord(args, EntityList.getEntityNameList());
//        }
//        else
//        {
//            return args.length > 1 && args.length <= 4 ? getTabCompletionCoordinate(args, 1, targetPos) : Collections.emptyList();
//        }
//    }
//}
