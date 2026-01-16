package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBolivosteus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelBolivosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin;


    public ModelBolivosteus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.3F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.0908F, 0.288F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 0, -4.2403F, 0.0F, 1.4957F, 4, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9687F, 0.288F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 25, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0908F, -0.288F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 0, 0.2403F, 0.0F, 1.4957F, 4, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -1.6782F, -7.9658F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.9687F, -0.288F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 25, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7282F, -7.9658F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 30, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -2.0755F, -5.9962F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 14, -2.0F, 0.0F, -2.0F, 2, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 4, -3.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.5122F, -6.4554F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 35, -2.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4755F, -6.4962F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0654F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 7, -2.0F, -2.0F, 0.05F, 4, 2, 4, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.0755F, -5.9962F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0654F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -3.0F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.8F, -2.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 14, -2.0F, -0.5F, 0.0F, 4, 3, 4, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2224F, 3.4053F);
        this.tail.addChild(tail2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.5438F, 5.0028F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0785F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 22, -1.0F, -1.7F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5416F, 3.0919F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 17, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.6724F, 0.0948F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 14, -1.0F, 0.0F, 0.0F, 3, 2, 5, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.7315F, 2.0364F, 1.9912F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.035F, -0.2595F, 0.17F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 26, 30, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.7315F, 2.0364F, 1.9912F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.035F, 0.2595F, -0.17F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 26, 30, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0724F, 4.5948F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 22, -1.0F, -0.25F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.35F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 30, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.1669F, -6.3288F);
        this.main.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6446F, -0.1175F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 34, -1.0F, -1.0F, -1.975F, 2, 1, 1, -0.01F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 22, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.6519F, -0.2026F, -6.1139F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0668F, 0.6516F, -0.1098F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, -2, 0, -8.0F, 0.0F, 0.0F, 8, 0, 7, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.6519F, -0.2026F, -6.1139F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0668F, -0.6516F, 0.1098F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, -2, 0, 0.0F, 0.0F, 0.0F, 8, 0, 7, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.13F;
        this.main.offsetY = -0.22F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.9F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

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
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraBolivosteus ee = (EntityPrehistoricFloraBolivosteus) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.main.offsetY = 1.35F - 1.05F;
                this.main.rotateAngleX = -(float) Math.toRadians(30);
                swaymodifier = 0;
            }
            else {
                this.main.offsetY = 1.05F - 1.05F + (0.08F * (float)((double)ee.getBuriedTick()/60D));
                this.main.rotateAngleX = -(float) Math.toRadians(30 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.main.offsetY = 1.05F - 1.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

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
            this.swing(main, speed, 0.05F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.0F - 1.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
