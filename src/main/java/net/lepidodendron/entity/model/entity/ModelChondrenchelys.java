package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelChondrenchelys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail7;

    public ModelChondrenchelys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.8658F, -5.1452F);
        this.main.cubeList.add(new ModelBox(main, 16, 5, -2.0F, -0.8408F, -2.3048F, 4, 3, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.5658F, 0.1952F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, -0.5F, -0.675F, -2.95F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 24, -2.0F, 0.025F, -2.95F, 3, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 2.1842F, -2.3048F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 45, 14, -1.0F, -1.15F, -4.4F, 2, 1, 2, 0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.3F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 35, -1.0F, -0.025F, -3.075F, 3, 2, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.6828F, -4.1016F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 42, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.6F, -2.0331F, -4.7753F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.45F, -0.325F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.7F, -0.45F, -0.325F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.775F, -4.575F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 0, -1.0F, -0.0123F, -2.9951F, 2, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.9F, -3.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 33, -1.0F, -0.025F, -1.575F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 26, -1.0F, -2.025F, -3.0F, 3, 2, 3, -0.002F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.25F, -0.625F, -1.625F);
        this.head.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.2336F, -0.9276F, 0.4609F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 31, 35, -0.75F, -0.375F, -0.375F, 2, 1, 1, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 24, 0, 0.75F, -1.125F, -0.125F, 3, 2, 0, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.25F, -0.625F, -1.625F);
        this.head.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.2336F, 0.9276F, -0.4609F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 31, 35, -1.25F, -0.375F, -0.375F, 2, 1, 1, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 24, 0, -3.75F, -1.125F, -0.125F, 3, 2, 0, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.1447F, -4.4154F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.0697F, 0.0402F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 41, -0.5F, 0.0F, -2.4F, 2, 1, 3, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.6842F, 2.1952F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -2.0F, -2.5F, 0.0F, 5, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -2.775F, 0.0F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 40, -1.525F, -0.425F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.775F, 0.0F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -1.5F, 0.275F, 0.0F, 4, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 10, -2.0F, -2.95F, 0.0F, 5, 4, 5, 0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 33, 0.5F, -3.65F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.5F, 0.0F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 0, -1.5F, -3.0F, 0.0F, 5, 3, 3, -0.001F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 0.7F, 1.5F);
        this.tail2.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.2399F, 0.4253F, -0.1006F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 45, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, 0.7F, 1.5F);
        this.tail2.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.2399F, -0.4253F, 0.1006F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 45, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.45F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 15, -1.5F, -2.15F, -0.05F, 4, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.9F, -0.05F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 7, 0.525F, -0.775F, 0.075F, 0, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 28, -1.0F, -0.025F, 0.075F, 3, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.05F, 4.4F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, -1.0F, -1.15F, -0.05F, 3, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.15F, 2.45F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 41, 0.5F, -1.5F, -2.5F, 0, 1, 5, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 9, -0.5F, -0.75F, -2.5F, 2, 2, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 17, -0.5F, -1.15F, -0.05F, 2, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.65F, 1.95F);
        this.tail5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 43, 0.475F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.25F, 3.75F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 23, 35, 0.0F, -0.15F, -0.05F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.15F, 1.45F);
        this.tail6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 42, 0.5F, -0.5F, -1.5F, 0, 1, 4, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 28, 17, 0.5F, -0.15F, -0.05F, 0, 1, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 1.05F;
        this.main.rotateAngleY = (float)Math.toRadians(245);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(backrightfin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backleftfin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(dorsalfinR, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(dorsalfinL, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(frontrightfin, speed * 0.8F, -0.5F, false, 0F, -0.2F, f2, 1F);
            this.swing(frontleftfin, speed * 0.8F, 0.5F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -.30F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
