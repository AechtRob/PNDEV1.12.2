package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPsilichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r28;

    public ModelPsilichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.0F, -4.25F);
        this.body.cubeList.add(new ModelBox(body, 36, 0, -1.5F, -2.5F, -4.0F, 3, 5, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -2.0F, -3.0F, -1.0F, 4, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.925F, -7.15F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.8465F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 42, -1.0F, -1.0F, -1.0F, 2, 2, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.675F, -4.675F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 40, -1.0F, -2.0F, -1.0F, 2, 4, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.75F, -0.2F, -6.725F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 28, 1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.75F, -0.2F, -6.725F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 28, -2.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, -6.125F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 48, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.025F, -5.55F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.384F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 0, -0.5F, -1.05F, -1.0F, 2, 1, 3, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.35F, -7.85F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2443F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 4, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.375F, 0.825F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 19, -1.5F, -1.0F, -2.0F, 3, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -2.375F, 0.875F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 34, -2.5F, -1.0F, -1.05F, 3, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.15F, -2.075F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 36, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.025F, -3.15F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 32, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.25F, 2.5F, -2.6F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 47, 2.0F, -4.0F, -1.0F, 1, 4, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, 2.5F, -2.6F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 47, -3.0F, -4.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.75F, 1.5F, -1.925F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.4363F, -0.3491F, 0.1745F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 26, 40, 0.0F, -1.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.75F, 1.5F, -1.925F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.4363F, 0.3491F, -0.1745F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 26, 40, 0.0F, -1.0F, 0.0F, 0, 3, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.35F, -3.75F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 26, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.1F, -3.9F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 14, -0.5F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.192F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 20, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.192F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 20, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.0F, 0.35F, -8.8F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, 0.0F, -0.1047F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.675F, 3.3F);
        this.lipright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4189F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 26, -1.0F, -1.0F, -0.6F, 1, 1, 3, 0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.lipright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 48, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.01F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.0F, 0.35F, -8.8F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, 0.0F, 0.1047F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.675F, 3.3F);
        this.lipleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4189F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 26, 0.0F, -1.0F, -0.6F, 1, 1, 3, 0.02F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.lipleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2443F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 48, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.01F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 0, -1.5F, -2.25F, -0.5F, 3, 5, 5, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.175F, -4.175F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 35, -1.0F, -2.0F, 4.0F, 2, 2, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -2.2F, 0.25F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.7854F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 34, 1.0F, -7.0F, -1.0F, 0, 7, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.425F, -4.75F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1134F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 8, -1.0F, -5.0F, 4.0F, 2, 1, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 3.75F, 1.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.1309F, 0.0F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 46, 40, 0.0F, -0.75F, -1.0F, 0, 4, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 3.75F, 1.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.1309F, 0.0F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 46, 40, 0.0F, -0.75F, -1.0F, 0, 4, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 20, 10, -1.0F, -1.6F, -0.55F, 2, 3, 6, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.4F, 2.375F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 48, 0.0F, 0.125F, 0.025F, 0, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.45F, 0.2F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1134F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 28, -1.0F, -2.0F, -1.0F, 2, 1, 6, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 3.125F, 0.7F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3142F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 26, -1.0F, -2.0F, -1.0F, 2, 2, 6, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 5.45F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 46, -0.75F, -1.6F, -0.825F, 1, 2, 4, -0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 10, 46, -0.25F, -1.6F, -0.825F, 1, 2, 4, -0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.25F, 2.7F, 0.2F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 42, -0.5F, -3.0F, -0.65F, 1, 2, 4, -0.02F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 42, -1.0F, -3.0F, -0.65F, 1, 2, 4, -0.02F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.9F, 3.075F);
        this.body4.addChild(body5);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.1F, 0.975F);
        this.body5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3054F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -0.5F, -0.9F, -1.75F, 1, 1, 6, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -0.9F, -1.75F, 0, 6, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.9F;
        this.body.offsetX = 0.968F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 2.7F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//        this.head.rotateAngleY = (float) Math.toRadians(90);
//        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
//        this.head.offsetX = -0.14F;
//        this.head.offsetY = -0.19F;
//        this.head.offsetZ = 0.06F;
//        this.head.render(0.01F);
//        this.resetToDefaultPose();
//    }
//    public void renderStaticFloor(float f) {
//        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
//        this.head.offsetY = 0.139F;
//        this.head.render(0.01f);
//        resetToDefaultPose();
//    }

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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pectoralfinright, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.3F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
