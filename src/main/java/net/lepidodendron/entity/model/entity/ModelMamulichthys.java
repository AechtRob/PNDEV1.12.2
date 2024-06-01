package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMamulichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    public ModelMamulichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.8443F, -0.579F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -7.0943F, -2.671F, 5, 7, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 26, -2.0F, -8.7943F, -3.671F, 4, 3, 4, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -8.7943F, 0.329F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 10, -1.5F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -8.7943F, -3.171F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.9163F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 16, 0.0F, -3.925F, 0.0F, 1, 4, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.7512F, 4.2423F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 15, -2.0F, -1.8431F, -0.9132F, 4, 5, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.6569F, -0.9132F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 26, -1.5F, -1.975F, 0.375F, 3, 2, 5, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.6894F, 2.2526F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.9512F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, 0.5F, -3.0122F, -0.622F, 0, 3, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0547F, 1.4028F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6458F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 10, -0.5F, -2.5819F, -0.1234F, 1, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.4431F, 0.0118F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3403F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 34, -1.5F, -0.0801F, 0.0175F, 3, 2, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 3.3569F, 0.1868F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3612F, 0.2637F, -0.7302F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 24, 26, -0.5F, -0.0005F, -0.5326F, 1, 3, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4995F, 0.9674F);
        this.backLeftFin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 17, 0.0F, -1.7F, -0.5F, 0, 3, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 3.3569F, 0.1868F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3612F, -0.2637F, 0.7302F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 24, 26, -0.5F, -0.0005F, -0.5326F, 1, 3, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.4995F, 0.9674F);
        this.backRightFin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 17, 0.0F, -1.7F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5254F, 4.1286F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 30, -1.5F, -1.4685F, -0.5919F, 3, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 3.7888F, 1.648F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.5F, -1.3F, -1.2F, 0, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.5315F, 1.4081F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 44, -1.5F, -0.8F, -1.95F, 2, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.9685F, 1.4081F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 43, -0.5F, -0.1F, -2.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2498F, 3.3836F);
        this.tail2.addChild(tail3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.1713F, 2.9818F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4014F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, 0.5F, 0.3628F, -3.516F, 0, 4, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.1713F, 2.9818F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 42, -0.5F, -0.4372F, -0.116F, 1, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.7187F, 0.0245F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 41, -1.5F, -0.5F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0687F, 1.1282F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5978F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 50, -1.0F, -1.025F, -1.95F, 2, 2, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 2.1557F, -2.421F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 25, 0, -2.5F, -8.25F, -4.25F, 4, 5, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -5.2F, -7.925F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.5752F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -1.65F, 0.0286F, -1.2582F, 0, 3, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -5.2F, -7.925F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.5752F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 28, 1.65F, 0.0286F, -1.2582F, 0, 3, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -5.2F, -7.925F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.5752F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 7, -0.5F, 0.0036F, -1.0082F, 3, 4, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -6.975F, -7.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0865F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 23, -0.5F, 0.0114F, -2.0098F, 3, 2, 2, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -10.95F, -1.25F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6065F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 0, -2.5F, 0.0F, -7.0F, 3, 3, 3, -0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 34, -2.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.25F, -0.25F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 38, -1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.7F, -3.25F, -1.15F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 1.1096F, 1.1731F, 1.7829F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 41, 29, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.0F, 2.5F);
        this.frontLeftFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 17, -1.0F, 0.0F, -2.8F, 2, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.7F, -3.25F, -1.15F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 1.1096F, -1.1731F, -1.7829F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 41, 29, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.0F, 2.5F);
        this.frontRightFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2182F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 17, -1.0F, 0.0F, -2.8F, 2, 0, 5, 0.0F, true));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.65F, -6.075F, -6.3F);
        this.head.addChild(eyes);
        this.setRotateAngle(eyes, 0.5236F, 0.0F, 0.0F);
        this.eyes.cubeList.add(new ModelBox(eyes, 0, 20, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.eyes.cubeList.add(new ModelBox(eyes, 0, 20, -2.8F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -4.1964F, -4.2582F);
        this.head.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 1.7596F, 0.0101F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2662F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 15, -0.5F, -0.9888F, -2.9912F, 3, 1, 3, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, -1.55F, 0.7536F, 0.5168F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 15, 1.55F, 0.7536F, 0.5168F, 0, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 37, -0.5F, 1.0036F, 0.0168F, 3, 1, 4, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.main.offsetZ = -0.3F;
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(head, 0.0F, 0.01F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.05F;
        this.main.offsetX = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.9F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 4.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.0F, -0.9F, 0.2F);
        this.setRotateAngle(head, 0.0F, 0.01F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.28F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.2f, f2, 1);

            this.flap(backRightFin, speed * 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
            this.flap(backLeftFin, speed * 0.8F, -0.3F, true, 0F, 0.3F, f2, 1F);
            this.flap(frontRightFin, speed * 0.8F, 0.25F, true, 0F, -0.1F, f2, 1F);
            this.flap(frontLeftFin, speed * 0.8F, -0.25F, true, 0F, 0.1F, f2, 1F);
            this.swing(frontRightFin, speed * 0.8F, 0.4F, true, 0F, -0.2F, f2, 1F);
            this.swing(frontLeftFin, speed * 0.8F, -0.4F, true, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
