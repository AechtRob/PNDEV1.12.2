package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHibernaspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelHibernaspis extends ModelBasePalaeopedia {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer shape10;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape34;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer shape14;
    public AdvancedModelRenderer shape18;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer shape22;
    public AdvancedModelRenderer shape23;
    public AdvancedModelRenderer shape24;
    public AdvancedModelRenderer shape25;
    public AdvancedModelRenderer shape15;
    public AdvancedModelRenderer shape16;
    public AdvancedModelRenderer shape17;
    public AdvancedModelRenderer shape20;
    public AdvancedModelRenderer shape21;
    public AdvancedModelRenderer shape26;
    public AdvancedModelRenderer shape27;
    public AdvancedModelRenderer shape3;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape13;
    public AdvancedModelRenderer shape41;
    public AdvancedModelRenderer shape42;
    public AdvancedModelRenderer shape43;
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape33;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer shape37;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer shape39;
    public AdvancedModelRenderer shape40;

    public ModelHibernaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tail1 = new AdvancedModelRenderer(this, 0, 41);
        this.Tail1.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.Tail1.addBox(-3.0F, -1.0F, -1.0F, 6, 3, 5, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 30, 26);
        this.shape9.setRotationPoint(-3.0F, 0.15F, 0.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(shape9, 0.02583087292951608F, -0.3977605365295077F, 0.0F);
        this.shape13 = new AdvancedModelRenderer(this, 40, 17);
        this.shape13.setRotationPoint(0.0F, 1.6F, -0.6F);
        this.shape13.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(shape13, -0.08761552845011533F, 0.0F, 0.0F);
        this.shape22 = new AdvancedModelRenderer(this, 13, 10);
        this.shape22.setRotationPoint(0.0F, 0.3F, 3.1F);
        this.shape22.addBox(0.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape22, 0.0F, -0.4288273972150068F, 0.0F);
        this.shape10 = new AdvancedModelRenderer(this, 0, 10);
        this.shape10.setRotationPoint(-5.0F, 0.2F, -6.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotateAngle(shape10, 0.0F, -0.25342180738957665F, 0.0F);
        this.shape23 = new AdvancedModelRenderer(this, 13, 13);
        this.shape23.setRotationPoint(0.0F, 0.3F, 4.8F);
        this.shape23.addBox(0.0F, 0.0F, -0.2F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape23, 0.0F, -0.4288273972150068F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 23, 40);
        this.Tail2.setRotationPoint(0.0F, -0.9F, 4.0F);
        this.Tail2.addBox(-2.0F, 0.0F, -1.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(Tail2, -0.03839724354387525F, 0.0F, 0.0F);
        this.shape16 = new AdvancedModelRenderer(this, 0, 21);
        this.shape16.setRotationPoint(0.0F, 0.3F, 0.7F);
        this.shape16.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape16, 0.0F, 0.36913713679680066F, 0.0F);
        this.shape33 = new AdvancedModelRenderer(this, 0, 49);
        this.shape33.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.shape33.addBox(-2.0F, -1.0F, -1.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(shape33, 0.05113814708343386F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 0, 19);
        this.shape11.setRotationPoint(5.0F, 0.2F, -6.0F);
        this.shape11.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotateAngle(shape11, 0.0F, 0.25342180738957665F, 0.0F);
        this.shape24 = new AdvancedModelRenderer(this, 15, 14);
        this.shape24.setRotationPoint(-0.05F, 0.3F, 5.71F);
        this.shape24.addBox(0.1F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape24, 0.0F, -0.5146975964131277F, 0.0F);
        this.shape27 = new AdvancedModelRenderer(this, 19, 13);
        this.shape27.setRotationPoint(-9.45F, 0.0F, -7.0F);
        this.shape27.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape27, 3.141592653589793F, -1.0955431714768409F, 3.141592653589793F);
        this.Tail4 = new AdvancedModelRenderer(this, 38, 38);
        this.Tail4.setRotationPoint(0.0F, -0.24F, 3.5F);
        this.Tail4.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Tail4, 0.27021767942953795F, 0.0F, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, -0.2F, 14.0F);
        this.Body.addBox(-5.0F, 0.0F, -7.0F, 10, 3, 7, 0.0F);
        this.shape19 = new AdvancedModelRenderer(this, 0, 14);
        this.shape19.setRotationPoint(0.0F, 0.3F, 1.8F);
        this.shape19.addBox(0.0F, 0.0F, -0.7F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape19, 0.0F, -0.3855432317655474F, 0.0F);
        this.shape20 = new AdvancedModelRenderer(this, 13, 19);
        this.shape20.setRotationPoint(0.0F, 0.3F, 3.1F);
        this.shape20.addBox(-1.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape20, 0.0F, 0.4288273972150068F, 0.0F);
        this.shape17 = new AdvancedModelRenderer(this, 0, 23);
        this.shape17.setRotationPoint(0.0F, 0.3F, 1.8F);
        this.shape17.addBox(-1.0F, 0.0F, -0.7F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape17, 0.0F, 0.3855432317655474F, 0.0F);
        this.shape14 = new AdvancedModelRenderer(this, 0, 10);
        this.shape14.setRotationPoint(0.0F, 0.3F, -0.3F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape14, 0.0F, -0.2235766771804736F, 0.0F);
        this.shape3 = new AdvancedModelRenderer(this, 28, 12);
        this.shape3.setRotationPoint(0.0F, 0.08F, -0.9F);
        this.shape3.addBox(-2.5F, 0.0F, -0.1F, 5, 2, 1, 0.0F);
        this.setRotateAngle(shape3, 0.08237954069413235F, 0.0F, 0.0F);
        this.shape26 = new AdvancedModelRenderer(this, 15, 23);
        this.shape26.setRotationPoint(0.05F, 0.3F, 5.71F);
        this.shape26.addBox(-1.1F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape26, 0.0F, 0.5146975964131277F, 0.0F);
        this.shape43 = new AdvancedModelRenderer(this, 2, 0);
        this.shape43.setRotationPoint(-0.7F, 0.18F, -1.5F);
        this.shape43.addBox(-0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F);
        this.setRotateAngle(shape43, 0.10489428804485919F, 0.7853981633974483F, 0.0F);
        this.shape25 = new AdvancedModelRenderer(this, 19, 22);
        this.shape25.setRotationPoint(9.45F, 0.0F, -7.0F);
        this.shape25.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape25, 3.141592653589793F, 1.0955431714768409F, 3.141592653589793F);
        this.shape37 = new AdvancedModelRenderer(this, 21, 49);
        this.shape37.setRotationPoint(0.0F, 3.49F, 0.43F);
        this.shape37.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(shape37, 0.033335788713091695F, 0.0F, 0.0F);
        this.shape15 = new AdvancedModelRenderer(this, 0, 19);
        this.shape15.setRotationPoint(0.0F, 0.3F, -0.3F);
        this.shape15.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape15, 0.0F, 0.2235766771804736F, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 30, 16);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape1, -0.009599310885968812F, 0.0F, 0.0F);
        this.shape40 = new AdvancedModelRenderer(this, 43, 56);
        this.shape40.setRotationPoint(0.0F, 1.91F, -4.0F);
        this.shape40.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 6, 0.0F);
        this.setRotateAngle(shape40, -0.01937315469713706F, 0.0F, 0.0F);
        this.shape18 = new AdvancedModelRenderer(this, 0, 12);
        this.shape18.setRotationPoint(0.0F, 0.3F, 0.7F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape18, 0.0F, -0.36913713679680066F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 28, 4);
        this.shape12.setRotationPoint(0.0F, 0.2F, -5.0F);
        this.shape12.addBox(-1.5F, -0.1F, 0.0F, 3, 1, 6, 0.0F);
        this.setRotateAngle(shape12, 0.09215338450530061F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 45, 41);
        this.Tail3.setRotationPoint(0.0F, 0.05F, 5.0F);
        this.Tail3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Tail3, 0.0027925268031909274F, 0.0F, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 31, 18);
        this.shape4.setRotationPoint(0.0F, 1.91F, 0.04F);
        this.shape4.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape4, -0.2282890661608583F, 0.0F, 0.0F);
        this.shape34 = new AdvancedModelRenderer(this, 45, 10);
        this.shape34.setRotationPoint(0.0F, 4.8F, -4.2F);
        this.shape34.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(shape34, -0.0471238898038469F, 0.0F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 40, 2);
        this.shape2.setRotationPoint(0.0F, 2.28F, -6.1F);
        this.shape2.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 6, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 30, 20);
        this.shape8.setRotationPoint(3.0F, 0.15F, 0.0F);
        this.shape8.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(shape8, 0.02583087292951608F, 0.3977605365295077F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 0, 31);
        this.shape5.setRotationPoint(0.0F, 0.1F, -11.0F);
        this.shape5.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 4, 0.0F);
        this.shape21 = new AdvancedModelRenderer(this, 13, 22);
        this.shape21.setRotationPoint(0.0F, 0.3F, 4.8F);
        this.shape21.addBox(-1.0F, 0.0F, -0.2F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape21, 0.0F, 0.4288273972150068F, 0.0F);
        this.shape41 = new AdvancedModelRenderer(this, 1, 1);
        this.shape41.setRotationPoint(0.7F, 0.18F, -1.5F);
        this.shape41.addBox(-0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F);
        this.setRotateAngle(shape41, 0.10489428804485919F, 0.7853981633974483F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 14, 31);
        this.shape6.setRotationPoint(0.0F, 2.2F, 0.6F);
        this.shape6.addBox(-2.0F, -1.2F, 0.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(shape6, -0.16528268016386302F, 0.0F, 0.0F);
        this.shape42 = new AdvancedModelRenderer(this, 0, 0);
        this.shape42.setRotationPoint(0.0F, 0.18F, -1.46F);
        this.shape42.addBox(-0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F);
        this.setRotateAngle(shape42, 0.10489428804485919F, 0.7853981633974483F, 0.0F);
        this.shape39 = new AdvancedModelRenderer(this, 43, 49);
        this.shape39.setRotationPoint(0.0F, 2.1F, 4.0F);
        this.shape39.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(shape39, -0.2012876538283124F, 0.0F, 0.0F);
        this.Body.addChild(this.Tail1);
        this.shape5.addChild(this.shape9);
        this.shape5.addChild(this.shape13);
        this.shape10.addChild(this.shape22);
        this.Body.addChild(this.shape10);
        this.shape10.addChild(this.shape23);
        this.Tail1.addChild(this.Tail2);
        this.shape11.addChild(this.shape16);
        this.Tail1.addChild(this.shape33);
        this.Body.addChild(this.shape11);
        this.shape10.addChild(this.shape24);
        this.shape26.addChild(this.shape27);
        this.Tail3.addChild(this.Tail4);
        this.shape10.addChild(this.shape19);
        this.shape11.addChild(this.shape20);
        this.shape11.addChild(this.shape17);
        this.shape10.addChild(this.shape14);
        this.shape5.addChild(this.shape3);
        this.shape11.addChild(this.shape26);
        this.shape5.addChild(this.shape43);
        this.shape24.addChild(this.shape25);
        this.Tail2.addChild(this.shape37);
        this.shape11.addChild(this.shape15);
        this.shape3.addChild(this.shape1);
        this.shape39.addChild(this.shape40);
        this.shape10.addChild(this.shape18);
        this.Body.addChild(this.shape12);
        this.Tail2.addChild(this.Tail3);
        this.shape3.addChild(this.shape4);
        this.Body.addChild(this.shape34);
        this.Body.addChild(this.shape2);
        this.shape5.addChild(this.shape8);
        this.Body.addChild(this.shape5);
        this.shape11.addChild(this.shape21);
        this.shape5.addChild(this.shape41);
        this.shape5.addChild(this.shape6);
        this.shape5.addChild(this.shape42);
        this.Tail4.addChild(this.shape39);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleX = (float) Math.toRadians(90);
        this.Body.offsetY = -0.0F;
        this.Body.offsetZ = -0.175F;
        this.Body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, -0.1F, 0.1F, 0.0F);
        this.Body.offsetZ = -0.1F;
        this.Body.offsetY = 0.28F;
        this.Body.offsetX = -0.0F;
        this.Body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body.offsetY = 1.3F;
        //this.Body.offsetX = 0.2F;
        this.Body.offsetZ = -0.9F;

        EntityPrehistoricFloraHibernaspis ee = (EntityPrehistoricFloraHibernaspis) e;
        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.Body.offsetY = 2.4F;
                this.Body.rotateAngleX = (float) Math.toRadians(40);
                swaymodifier = 0;
            }
            else {
                this.Body.offsetY = 2.4F - 1.3F + (1.3F * (float)((double)ee.getBuriedTick()/60D));
                this.Body.rotateAngleX = (float) Math.toRadians(50 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.Body.offsetY = 1.3F;
        }


        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedmodifier;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(Body, speed, 0.3F * swaymodifier, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = 1.25F;
                this.bob(Body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
