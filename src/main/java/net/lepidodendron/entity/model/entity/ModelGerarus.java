package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelGerarus extends AdvancedModelBase {
    private final AdvancedModelRenderer gerarus;
    private final AdvancedModelRenderer thorax;
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
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftCercus;

    public ModelGerarus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.gerarus = new AdvancedModelRenderer(this);
        this.gerarus.setRotationPoint(0.0F, 22.0F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -1.1769F, 0.1358F);
        this.gerarus.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 1, 15, -1.0F, -0.0231F, -3.1358F, 2, 2, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 0.9769F, -1.1358F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 18, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.9769F, -1.1358F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 18, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0231F, -0.3358F);
        this.thorax.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 14, 0.0F, -1.5F, 0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.2491F, -1.3444F, -0.3211F);
        this.thorax.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.0385F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 14, 0.0F, -1.1F, 0.3F, 0, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.2491F, -1.3444F, -0.3211F);
        this.thorax.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0385F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 14, 0.0F, -1.1F, 0.3F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.9406F, -0.7463F, -2.2085F);
        this.thorax.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, -0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 20, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.9406F, -0.7463F, -2.2085F);
        this.thorax.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6981F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 20, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.4769F, -2.5358F);
        this.thorax.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 20, -0.5F, -0.3F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.4769F, -2.5358F);
        this.thorax.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 20, -1.5F, -0.3F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.9769F, -1.6358F);
        this.thorax.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, -1.5F, -1.4F, -0.9F, 3, 2, 3, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, 1.4269F, -1.8858F);
        this.thorax.addChild(rightLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.8727F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 9, -7.0F, -1.3F, 0.0F, 7, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 2.1269F, -0.8858F);
        this.thorax.addChild(rightLeg2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.829F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 5, -7.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.6F, -0.0231F, 0.2142F);
        this.thorax.addChild(rightForewing);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 8, 14, -1.5F, -0.1F, -1.0F, 3, 0, 11, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.6F, -0.0231F, 1.2142F);
        this.thorax.addChild(rightHindwing);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 9, 26, -1.5F, 0.0F, -1.0F, 3, 0, 10, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.6F, -0.0231F, 0.2142F);
        this.thorax.addChild(leftForewing);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 15, 14, -1.5F, -0.15F, -1.0F, 3, 0, 11, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.6F, -0.0231F, 1.2142F);
        this.thorax.addChild(leftHindwing);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 16, 26, -1.5F, -0.05F, -1.0F, 3, 0, 10, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, 1.4269F, -1.8858F);
        this.thorax.addChild(leftLeg1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.8727F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 9, 0.0F, -1.3F, 0.0F, 7, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 2.1269F, -0.8858F);
        this.thorax.addChild(leftLeg2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.829F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 5, 0.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.6029F, -3.0626F);
        this.thorax.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 1, 27, -0.5F, -0.226F, -2.0732F, 1, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5514F, -0.137F, -1.2134F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6981F, -0.829F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5514F, -0.137F, -1.2134F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6981F, 0.829F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2323F, -2.1088F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8F, -1.42F, 0.229F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.9171F, 0.4718F, -0.5355F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 32, -1.1198F, 0.701F, -0.2189F, 1, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.9958F, 0.229F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 32, 0.65F, 1.701F, -0.1025F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 32, -0.65F, 1.701F, -0.1025F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 3, 32, -0.5F, 0.201F, -0.1025F, 1, 2, 1, 0.1F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.8F, -1.42F, 0.229F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.9171F, -0.4718F, 0.5355F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 32, 0.1198F, 0.701F, -0.2189F, 1, 1, 1, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.4F, -0.2225F, -0.8657F);
        this.head.addChild(rightAntenna);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightAntenna.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, -10, 36, -4.9F, -0.0333F, -9.8846F, 5, 0, 10, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4F, -0.2225F, -0.8657F);
        this.head.addChild(leftAntenna);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftAntenna.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, -10, 36, -0.1F, -0.0333F, -9.8846F, 5, 0, 10, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -1.3F, 0.4F);
        this.gerarus.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 6, 2, -1.0F, 0.6F, 6.6F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 5, -1.0F, 0.1F, -0.4F, 2, 2, 7, 0.0F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-1.0F, 1.1F, 7.6F);
        this.abdomen.addChild(rightCercus);
        this.setRotateAngle(rightCercus, 0.0F, -0.5236F, 0.0F);
        this.rightCercus.cubeList.add(new ModelBox(rightCercus, 6, -1, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 2.25F, 0.85F);
        this.abdomen.addChild(rightLeg3);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 1.2217F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 19, 1, -9.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 2.25F, 0.85F);
        this.abdomen.addChild(leftLeg3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.2217F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 1, 0.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, true));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(1.0F, 1.1F, 7.6F);
        this.abdomen.addChild(leftCercus);
        this.setRotateAngle(leftCercus, 0.0F, 0.5236F, 0.0F);
        this.leftCercus.cubeList.add(new ModelBox(leftCercus, 6, -1, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.gerarus.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.gerarus.render(0.005f);
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.gerarus.offsetY = -0.50F;
        this.gerarus.offsetX = 0.0F;
        this.gerarus.rotateAngleY = (float)Math.toRadians(0);
        this.gerarus.rotateAngleX = (float)Math.toRadians(-88);
        this.gerarus.rotateAngleZ = (float)Math.toRadians(0);
        this.gerarus.scaleChildren = true;
        float scaler = 0.6F;
        this.gerarus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.gerarus.render(f);
        //Reset rotations, positions and sizing:
        this.gerarus.setScale(1.0F, 1.0F, 1.0F);
        this.gerarus.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Thoraxbase.offsetY = 1.325F;

        float modifier = 1F;

        this.faceTarget(f3, f4, 6, head);

        EntityPrehistoricFloraCrawlingFlyingInsectBase ee = (EntityPrehistoricFloraCrawlingFlyingInsectBase) e;
        if (ee.getIsFlying()) {
            this.setRotateAngle(abdomen, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(leftCercus, 0.0F, 0.5236F, 0.0F);
            this.setRotateAngle(leftForewing, 0.0F, 1.9199F, 0.0F);
            this.setRotateAngle(leftHindwing, 0.0F, 0.9599F, 0.0F);
            this.setRotateAngle(leftLeg1, -0.1543F, 0.8625F, -0.202F);
            this.setRotateAngle(leftLeg2, -0.2753F, -0.7926F, 0.3776F);
            this.setRotateAngle(leftLeg3, -0.5365F, -1.1615F, 0.5751F);
            this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(rightCercus, 0.0F, -0.5236F, 0.0F);
            this.setRotateAngle(rightForewing, 0.0F, -1.9199F, 0.0F);
            this.setRotateAngle(rightHindwing, 0.0F, -0.9599F, 0.0F);
            this.setRotateAngle(rightLeg1, -0.1543F, -0.8625F, 0.202F);
            this.setRotateAngle(rightLeg2, -0.2753F, 0.7926F, -0.3776F);
            this.setRotateAngle(rightLeg3, -0.5365F, 1.1615F, -0.5751F);

            this.flap(leftForewing,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(leftHindwing,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(rightForewing,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(rightHindwing,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);
        }
        else {
            this.walk(neck, 0.12F, -0.1F, false, 0, -0.05F, f2, 0.8F);
            this.walk(head, 0.12F, -0.3F, false, 0, -0.15F, f2, 0.8F);

            if (!(f3 == 0.0F || !ee.getIsMoving())) {
                this.swing(leftLeg1, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);
                this.swing(leftLeg2, 0.5F * modifier, -0.5F, false, 3, 0.25F, f2, 1F);
                this.swing(leftLeg3, 0.5F * modifier, -0.5F, false, 0, 0.25F, f2, 1F);

                this.swing(rightLeg1, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
                this.swing(rightLeg2, 0.5F * modifier, 0.5F, false, 0, -0.25F, f2, 1F);
                this.swing(rightLeg3, 0.5F * modifier, 0.5F, false, 3, -0.25F, f2, 1F);
            }
        }

        this.walk(leftAntenna, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(rightAntenna, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(leftAntenna, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

    }
}
