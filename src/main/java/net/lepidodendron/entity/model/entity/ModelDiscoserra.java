package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDiscoserra extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;

    public ModelDiscoserra() {
        this.textureWidth = 38;
        this.textureHeight = 38;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.06F, 18.063F, 0.2831F);
        this.main.cubeList.add(new ModelBox(main, 20, 20, -0.69F, -2.063F, 1.7169F, 1, 6, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 0, -0.69F, -0.863F, 3.7169F, 1, 3, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -0.94F, -3.063F, -2.2831F, 2, 9, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 0, -0.94F, -2.063F, -4.2831F, 2, 6, 2, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.56F, 5.937F, -2.2831F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.637F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -1.5F, -3.0F, -3.0F, 2, 3, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.56F, 4.137F, -4.6831F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8988F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -1.5F, -2.9806F, -2.0001F, 2, 3, 2, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.06F, 1.937F, -4.2831F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, 0.9F, -0.7F, -3.35F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -0.9F, -0.7F, -3.35F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 10, -1.0F, -0.9F, -3.45F, 2, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.44F, 4.787F, 3.3669F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 26, 0.5F, -0.0044F, -0.0112F, 0, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 26, -0.25F, -2.0044F, -0.0112F, 1, 2, 3, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.44F, 5.937F, 1.7169F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 33, 0.525F, 0.0F, 0.3F, 0, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 10, -0.25F, -2.0F, 0.0F, 1, 2, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.66F, -0.2029F, -5.4753F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.6581F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.002F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 22, -1.7F, -0.5F, -0.5F, 1, 1, 1, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.56F, -1.163F, -6.4081F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9643F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 21, -1.5F, 0.0012F, -1.9759F, 2, 3, 2, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.56F, -2.388F, -4.8081F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 0, -1.5F, -0.001F, -1.991F, 2, 3, 2, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.56F, -4.213F, -2.4081F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 16, -1.5F, -0.0141F, -3.0061F, 2, 2, 3, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.44F, -2.4773F, 4.8908F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.1781F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.475F, -1.05F, 0.725F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.44F, -2.5559F, 3.9685F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 32, 0.5F, -1.5966F, -0.2922F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.06F, -2.5559F, 3.9685F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0036F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 23, -0.75F, 0.0034F, 0.0078F, 1, 2, 2, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.44F, -3.713F, 2.3169F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 30, 0.525F, -1.6961F, 0.0243F, 0, 2, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 30, -0.25F, 0.0039F, 0.0243F, 1, 2, 2, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.44F, -4.613F, 0.5669F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 31, 0.5F, -1.7058F, 0.1922F, 0, 2, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 18, -0.5F, -0.0058F, -0.0078F, 2, 2, 2, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.56F, -4.563F, 0.7169F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 3, -0.525F, -0.675F, -2.65F, 0, 1, 3, 0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 6, -1.5F, -0.075F, -3.15F, 2, 2, 3, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.06F, 0.687F, 4.4669F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 33, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 9, 22, 0.0F, -2.3F, 0.0F, 0, 4, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-0.94F, 5.637F, 0.2169F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.7582F, -0.147F, 0.3655F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 9, 0, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.06F, 5.637F, 0.2169F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.7582F, 0.147F, -0.3655F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 9, 0, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.06F, 5.937F, 1.7169F);
        this.main.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 20, 20, -0.25F, -8.0F, 0.0F, 1, 6, 2, 0.003F, true));
        this.bone.cubeList.add(new ModelBox(bone, 32, 0, -0.25F, -6.8F, 2.0F, 1, 3, 1, 0.002F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6109F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 10, -0.25F, -2.0F, 0.0F, 1, 2, 2, 0.002F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.15F, 1.65F);
        this.bone.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9163F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 26, -0.25F, -2.0044F, -0.0112F, 1, 2, 3, 0.001F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -8.493F, 2.2516F);
        this.bone.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0036F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 23, -0.25F, 0.0034F, 0.0078F, 1, 2, 2, 0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -9.65F, 0.6F);
        this.bone.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 30, -0.25F, 0.0039F, 0.0243F, 1, 2, 2, 0.002F, true));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-0.94F, 1.937F, -3.2831F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.2182F, -0.5672F, 0.0F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 21, 30, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.06F, 1.937F, -3.2831F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.2182F, 0.5672F, 0.0F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 21, 30, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.06F, 1.7731F, -5.7142F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.75F, -0.0879F, -1.3972F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 16, 0.0F, -0.675F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 16, -1.5F, -0.675F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.0361F, 1.056F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 13, -1.0F, 0.2F, -2.95F, 2, 1, 3, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.34F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.14F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.3F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
