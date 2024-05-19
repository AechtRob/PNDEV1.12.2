package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThalassiodracon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelThalassiodracon extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Leftfrontflipper1;
    private final AdvancedModelRenderer Leftfrontflipper2;
    private final AdvancedModelRenderer Rightfrontflipper1;
    private final AdvancedModelRenderer Rightfrontflipper2;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;

    private ModelAnimator animator;

    public ModelThalassiodracon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 19.0F, 8.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 3.25F, -2.0F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 24, -4.5F, -5.0F, 1.0F, 8, 6, 6, 0.0F, false));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(3.25F, 2.5F, 0.5F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, 0.2182F);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 11, 42, -0.5F, -1.0F, -0.5F, 4, 2, 3, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(2.25F, 0.0F, -0.5F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, 0.0F, -0.0873F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 22, 18, 0.25F, -0.5F, 0.0F, 9, 1, 4, -0.01F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-3.25F, 2.5F, 0.5F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0F, -0.2182F);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 11, 42, -3.5F, -1.0F, -0.5F, 4, 2, 3, 0.0F, true));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-2.25F, 0.0F, -0.5F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.0F, 0.0873F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 22, 18, -9.25F, -0.5F, 0.0F, 9, 1, 4, -0.01F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0873F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 33, 0, -2.5F, -1.5F, 0.0F, 5, 4, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 42, -1.5F, -1.0F, -0.5F, 3, 3, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 44, 10, -1.0F, -1.0F, -0.5F, 2, 2, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -0.5F, 0.5F, 1, 1, 4, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.5F, 3.0F, -3.0F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -6.0F, -5.0F, -8.0F, 11, 7, 11, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.5F, -3.75F, -8.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 18, -4.0F, -1.0F, -5.0F, 8, 6, 6, 0.0F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(3.5F, 3.25F, -3.5F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, 0.0F, 0.2182F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 44, 17, -0.5F, -1.0F, -0.5F, 4, 2, 3, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(2.25F, 0.0F, -0.5F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, 0.0F, -0.0873F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 26, 36, 0.25F, -0.5F, 0.0F, 9, 1, 4, -0.01F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-3.5F, 3.25F, -3.5F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0F, -0.2182F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 44, 17, -3.5F, -1.0F, -0.5F, 4, 2, 3, 0.0F, true));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-2.25F, 0.0F, -0.5F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.0F, 0.0873F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 26, 36, -9.25F, -0.5F, 0.0F, 9, 1, 4, -0.01F, true));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.Bodyfront.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0436F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 30, -3.0F, -1.0F, -6.0F, 6, 5, 7, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 1.25F, -5.0F);
        this.Neck2.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0436F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 39, 41, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.Neck6 = new AdvancedModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Neck4.addChild(Neck6);
        this.setRotateAngle(Neck6, -0.0436F, 0.0F, 0.0F);
        this.Neck6.cubeList.add(new ModelBox(Neck6, 19, 41, -1.5F, -1.0F, -6.0F, 3, 3, 7, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0879F, -6.2572F);
        this.Neck6.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 44, 23, -1.5F, 0.0879F, -1.2428F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.65F, 0.4879F, -0.9928F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.65F, 0.4879F, -0.9928F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 32, 41, -1.0F, 1.0879F, -4.2428F, 2, 1, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.5879F, -2.5428F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 37, -1.5F, 0.0285F, -1.8399F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0879F, -1.2428F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 50, -1.5F, 0.05F, -1.9F, 2, 1, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.2497F, 2.0879F, -2.7231F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0541F, -0.1475F, 0.3531F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 1, 0.0F, -0.025F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.2497F, 2.0879F, -2.7231F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0541F, 0.1475F, -0.3531F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 1, 0.0F, -0.025F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, 1.5879F, -1.1428F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1571F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 33, 0.0F, -0.5F, -3.1F, 1, 1, 3, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, 1.5879F, -1.1428F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1571F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 33, -1.0F, -0.5F, -3.1F, 1, 1, 3, -0.01F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.5F, 2.0879F, 0.7572F);
        this.head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 44, 27, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 50, 1, -2.0F, -1.25F, -1.05F, 3, 2, 1, -0.03F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 50, 1, -2.0F, -1.25F, -1.55F, 3, 2, 1, -0.04F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 5, -1.5F, 0.0F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5933F, 0.0F, -4.468F);
        this.Lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.073F, -0.1392F, -0.4851F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, 0.0F, -1.0F, 1.5F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5933F, 0.0F, -4.468F);
        this.Lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.073F, 0.1392F, 0.4851F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 2, 0.0F, -1.0F, 1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, -0.5F, -1.9F);
        this.Lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1571F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 48, 0.0F, 0.5F, -3.1F, 1, 1, 3, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.5F, -1.9F);
        this.Lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1571F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 48, -1.0F, 0.5F, -3.1F, 1, 1, 3, 0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
        public void renderStaticWall(float f) {
            this.Hips.rotateAngleY = (float) Math.toRadians(0);
            this.Hips.rotateAngleZ = (float) Math.toRadians(90);
            this.Hips.rotateAngleX = (float) Math.toRadians(90);
            this.Hips.offsetY = -0.19F;
            this.Hips.offsetX = 0.05F;
            this.Hips.offsetZ = -0.54F;
            this.Hips.render(0.01F);
            resetToDefaultPose();
        }
        public void renderStaticFloor(float f) {
            this.setRotateAngle(Tail4, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Neck6, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Neck4, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, 0.0F, 0.0F, 0.2182F);
            this.setRotateAngle(Lowerjaw, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(Bodymiddle, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0873F, -0.1745F);
            this.setRotateAngle(Leftfrontflipper1, 0.0F, -0.0873F, 0.2182F);
            this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Bodyfront, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Righthindflipper1, 0.0F, 0.0873F, 0.1745F);
            this.setRotateAngle(Lefthindflipper1, 0.0F, -0.0873F, -0.1745F);
            this.Hips.offsetY = -0.3F;
            this.Hips.render(0.01F);
            resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Tail4, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck6, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Neck4, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(Lowerjaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Rightfrontflipper1, 0.0F, 0.0873F, -0.1745F);
        this.setRotateAngle(Leftfrontflipper1, 0.0F, -0.0873F, 0.2182F);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Righthindflipper1, 0.0F, 0.0873F, 0.1745F);
        this.setRotateAngle(Lefthindflipper1, 0.0F, -0.0873F, -0.1745F);
        this.Hips.offsetY = -0.08F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraThalassiodracon ee = (EntityPrehistoricFloraThalassiodracon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraThalassiodracon entity = (EntityPrehistoricFloraThalassiodracon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(xx), Neck6.rotateAngleY + (float) Math.toRadians(yy), Neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)) + (((tickAnim - 10) / 3) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5))));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)) + (((tickAnim - 13) / 7) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * (25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)-(25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassiodracon entity = (EntityPrehistoricFloraThalassiodracon) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle);
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 5 + (((tickAnim - 0) / 20) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 20) / 20) * (5-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 5 + (((tickAnim - 40) / 120) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 20) / 20) * (-10-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 0) / 79) * (-5-(-5)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 79) / 21) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 100) / 20) * (-5-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 120) / 40) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 79) / 21) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 100) / 20) * (10-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 120) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 60) / 70) * (-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5) + (((tickAnim - 60) / 70) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 70) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 0) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 60) / 70) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 130) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 0) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10)));
            yy = 0 + (((tickAnim - 0) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(0));
            zz = 0 + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)) + (((tickAnim - 30) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 60) / 70) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)) + (((tickAnim - 60) / 70) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)) + (((tickAnim - 130) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        //this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        //this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 0) / 60) * (2.5-(2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 60) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 90) / 30) * (2.5-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 120) / 40) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 90) / 30) * (-7.5-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -2.5 + (((tickAnim - 120) / 20) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-2.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 140) / 20) * (-2.5-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(7.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 140) / 20) * (7.5-(7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-60))*1)), Neck2.rotateAngleY + (float) Math.toRadians(-10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-5)), Neck2.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-90))*-3)));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Neck4.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-1))), Neck4.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));


        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), Neck6.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2))), Neck6.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1)), head.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*5))), head.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 30) * (5.9862+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = 0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)) + (((tickAnim - 0) / 30) * (0.1218-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)))-(0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = 0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)) + (((tickAnim - 0) / 30) * (-0.9927-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)))-(0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.9862+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 30) / 20) * (5.966+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(5.9862+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = 0.1218-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)) + (((tickAnim - 30) / 20) * (0.2085-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)))-(0.1218-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = -0.9927-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)) + (((tickAnim - 30) / 20) * (-1.9891-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)))-(-0.9927-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 50 && tickAnim < 90) {
            xx = 5.966+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 50) / 40) * (5.76731-(5.966+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = 0.2085-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)) + (((tickAnim - 50) / 40) * (-0.398-(0.2085-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)))));
            zz = -1.9891-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)) + (((tickAnim - 50) / 40) * (-0.51563-(-1.9891-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)))));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 5.76731 + (((tickAnim - 90) / 10) * (5.97519-(5.76731)));
            yy = -0.398 + (((tickAnim - 90) / 10) * (-0.41305-(-0.398)));
            zz = -0.51563 + (((tickAnim - 90) / 10) * (-1.35824-(-0.51563)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 5.97519 + (((tickAnim - 100) / 60) * (6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(5.97519)));
            yy = -0.41305 + (((tickAnim - 100) / 60) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)))-(-0.41305));
            zz = -1.35824 + (((tickAnim - 100) / 60) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)))-(-1.35824));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassiodracon entity = (EntityPrehistoricFloraThalassiodracon) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-5)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-30)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-35)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-10)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-10)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*35)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3)));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3))));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3)));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*40)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-40)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10)));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1)), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*1)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-3)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*3)));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2)), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2.5)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5)));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassiodracon entity = (EntityPrehistoricFloraThalassiodracon) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-1.5));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*20)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*-20)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-15)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*-15)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*-10)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*20)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3)));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3)));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2)));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15)));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1)), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-180))*-1)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*3)));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-220))*3)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-1)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*3)));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck4);
        this.faceTarget(f3, f4, 8, Neck6);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraThalassiodracon ee = (EntityPrehistoricFloraThalassiodracon) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

