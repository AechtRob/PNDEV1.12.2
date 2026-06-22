package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAdalatherium;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAdalatherium extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer chest2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer leftear;
    private final AdvancedModelRenderer rightear;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;


    private ModelAnimator animator;

    public ModelAdalatherium() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 16.7F, 8.3F);
        this.setRotateAngle(hip, -0.658F, 0.0F, 0.0F);
        this.hip.cubeList.add(new ModelBox(hip, 0, 34, -2.5F, -1.5F, -4.5F, 5, 6, 7, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9F, 2.2F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.2955F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 45, 21, -1.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2335F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 27, -0.5F, -0.3F, 0.0F, 1, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.475F, -4.25F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.5943F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 48, -3.5F, -0.1699F, -7.8702F, 7, 8, 8, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6301F, -7.3702F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3396F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 22, -3.0F, -1.5F, -6.5F, 6, 4, 7, 0.0F, true));

        this.chest2 = new AdvancedModelRenderer(this);
        this.chest2.setRotationPoint(-0.01F, 6.0F, -1.5F);
        this.chest.addChild(chest2);
        this.setRotateAngle(chest2, -0.4033F, 0.0F, 0.0F);
        this.chest2.cubeList.add(new ModelBox(chest2, 27, 0, -3.0F, -4.0F, -7.0F, 6, 4, 7, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -5.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3821F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 31, 52, -1.5F, -1.0F, -4.5F, 3, 4, 5, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.01F, 0.0F, -4.2F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4245F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 15, -1.5F, -1.0F, -2.5F, 3, 3, 3, 0.0F, true));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.0637F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 15, 4, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(-0.01F, -1.0F, -0.24F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.3183F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 0, 11, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, -0.3821F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 6, 0, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, 0.62F, -1.45F);
        this.head2.addChild(nose);
        this.setRotateAngle(nose, 0.2759F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 0, 4, -0.5F, -1.1635F, -0.5773F, 1, 1, 1, 0.0F, true));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(0.0F, 0.25F, -1.55F);
        this.head2.addChild(teeth);
        this.setRotateAngle(teeth, -0.3183F, 0.0F, 0.0F);
        this.teeth.cubeList.add(new ModelBox(teeth, 1, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 0.23F, -2.0F);
        this.head2.addChild(teeth2);
        this.setRotateAngle(teeth2, 0.3609F, 0.0F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 22, 7, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.02F, 1.5F, -0.51F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 0, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.01F, 0.7F, -1.82F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.2122F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 7, -1.0F, -1.0F, -1.91F, 2, 1, 2, 0.0F, true));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(-0.99F, -0.9F, -1.37F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.3183F, 0.0213F, 0.0213F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 10, 3, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(1.0F, -0.9F, -1.37F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.3183F, -0.0213F, -0.0213F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 5, 3, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(0.0F, -0.5F, -1.33F);
        this.jaw2.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.9128F, 0.0F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 0, 2, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.03F, 1.19F, -0.1F);
        this.jaw.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.2759F, 0.0F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 23, 2, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.03F, -0.08F, -2.12F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.1061F, 0.0F, 0.0424F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 8, 7, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.03F, -0.08F, -2.12F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, -0.1061F, 0.0F, -0.0424F);
        this.righteye.cubeList.add(new ModelBox(righteye, 13, 8, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.leftear = new AdvancedModelRenderer(this);
        this.leftear.setRotationPoint(-1.4F, -0.05F, -0.5F);
        this.head.addChild(leftear);
        this.setRotateAngle(leftear, 0.2759F, -0.2122F, -0.1698F);
        this.leftear.cubeList.add(new ModelBox(leftear, 7, 10, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightear = new AdvancedModelRenderer(this);
        this.rightear.setRotationPoint(1.4F, -0.05F, -0.5F);
        this.head.addChild(rightear);
        this.setRotateAngle(rightear, 0.2759F, 0.2122F, 0.1698F);
        this.rightear.cubeList.add(new ModelBox(rightear, 10, 10, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 2.94F, -5.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.4671F, 0.2972F, -0.2122F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 35, 24, -1.3F, -0.8F, -1.0F, 3, 5, 3, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 4.2F, 0.95F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2312F, -0.0637F, 0.2759F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 47, 14, -1.1F, -0.5F, -2.0F, 2, 4, 2, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.1F, 3.15F, -0.7F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4458F, -0.1485F, -0.1061F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 15, 10, -1.5F, -0.3F, -2.7F, 3, 1, 3, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 2.94F, -5.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4671F, -0.2972F, 0.2122F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 35, 24, -1.7F, -0.8F, -1.0F, 3, 5, 3, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 4.2F, 0.95F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2312F, 0.0637F, -0.2759F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 47, 14, -0.9F, -0.5F, -2.0F, 2, 4, 2, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.1F, 3.15F, -0.7F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4458F, 0.1485F, 0.1061F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 15, 10, -1.5F, -0.3F, -2.7F, 3, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.9F, 0.63F, 0.1F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2122F, 0.5308F, 0.5732F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 25, 41, -2.0F, -1.0F, -1.0F, 3, 6, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 4.5F, -0.3F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.4434F, -0.2546F, -0.5519F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 20, 21, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.48F, 0.6F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3396F, 0.1274F, -0.0424F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 13, 15, -1.5F, -0.2F, -3.5F, 3, 1, 4, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.9F, 0.63F, 0.1F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2122F, -0.5308F, -0.5732F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 23, 30, -1.0F, -1.0F, -1.0F, 3, 6, 4, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 4.5F, -0.3F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.4434F, 0.2546F, 0.5519F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 29, 19, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.48F, 0.6F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3396F, -0.1274F, 0.0424F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 24, 13, -1.5F, -0.2F, -3.5F, 3, 1, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -1.80F;
        this.hip.offsetX = .0F;
        this.hip.rotateAngleY = (float)Math.toRadians(250);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 3.F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hip.offsetY = 0.037F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraAdalatherium entityAdalatherium = (EntityPrehistoricFloraAdalatherium) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (entityAdalatherium.getAnimation() == entityAdalatherium.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAdalatherium.isReallyInWater()) {

                if (f3 == 0.0F || !entityAdalatherium.getIsMoving()) {
                    if (entityAdalatherium.getAnimation() != entityAdalatherium.EAT_ANIMATION
                        && entityAdalatherium.getAnimation() != entityAdalatherium.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAdalatherium.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAdalatherium ee = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The graze anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdalatherium entity = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 10) / 10) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 30.75 + (((tickAnim - 10) / 10) * (0-(30.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdalatherium entity = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 18.75 + (((tickAnim - 7) / 8) * (0-(18.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 20.75 + (((tickAnim - 7) / 8) * (0-(20.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 31 + (((tickAnim - 3) / 4) * (0-(31)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdalatherium entity = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -0.5 + (((tickAnim - 30) / 61) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -0.5 + (((tickAnim - 91) / 19) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -0.75 + (((tickAnim - 30) / 61) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -0.75 + (((tickAnim - 91) / 19) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -1.25 + (((tickAnim - 30) / 61) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -1.25 + (((tickAnim - 91) / 19) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = -10 + (((tickAnim - 30) / 11) * (-10-(-10)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 41) / 19) * (-16.3294-(-10)));
            yy = 0 + (((tickAnim - 41) / 19) * (-3.81969-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (2.38083-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -16.3294 + (((tickAnim - 60) / 10) * (-16.3294-(-16.3294)));
            yy = -3.81969 + (((tickAnim - 60) / 10) * (-3.81969-(-3.81969)));
            zz = 2.38083 + (((tickAnim - 60) / 10) * (2.38083-(2.38083)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -16.3294 + (((tickAnim - 70) / 10) * (-16.28195-(-16.3294)));
            yy = -3.81969 + (((tickAnim - 70) / 10) * (-5.33661-(-3.81969)));
            zz = 2.38083 + (((tickAnim - 70) / 10) * (1.66346-(2.38083)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = -16.28195 + (((tickAnim - 80) / 11) * (-16.28195-(-16.28195)));
            yy = -5.33661 + (((tickAnim - 80) / 11) * (-5.33661-(-5.33661)));
            zz = 1.66346 + (((tickAnim - 80) / 11) * (1.66346-(1.66346)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -16.28195 + (((tickAnim - 91) / 19) * (0-(-16.28195)));
            yy = -5.33661 + (((tickAnim - 91) / 19) * (0-(-5.33661)));
            zz = 1.66346 + (((tickAnim - 91) / 19) * (0-(1.66346)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 7.75 + (((tickAnim - 30) / 3) * (6.85-(7.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.85 + (((tickAnim - 33) / 2) * (7.75-(6.85)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 35) / 1) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 7.75 + (((tickAnim - 36) / 2) * (6.85-(7.75)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 6.85 + (((tickAnim - 38) / 3) * (7.75-(6.85)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 7.75 + (((tickAnim - 41) / 19) * (11.25-(7.75)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 11.25 + (((tickAnim - 60) / 10) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 11.25 + (((tickAnim - 70) / 10) * (0.57468-(11.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (-3.4559-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (-2.47522-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 82) {
            xx = 0.57468 + (((tickAnim - 80) / 2) * (0.57468-(0.57468)));
            yy = -3.4559 + (((tickAnim - 80) / 2) * (-3.4559-(-3.4559)));
            zz = -2.47522 + (((tickAnim - 80) / 2) * (-2.47522-(-2.47522)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = 0.57468 + (((tickAnim - 82) / 3) * (0.61171-(0.57468)));
            yy = -3.4559 + (((tickAnim - 82) / 3) * (-4.58959-(-3.4559)));
            zz = -2.47522 + (((tickAnim - 82) / 3) * (-3.00306-(-2.47522)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 0.61171 + (((tickAnim - 85) / 6) * (0.61171-(0.61171)));
            yy = -4.58959 + (((tickAnim - 85) / 6) * (-4.58959-(-4.58959)));
            zz = -3.00306 + (((tickAnim - 85) / 6) * (-3.00306-(-3.00306)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = 0.61171 + (((tickAnim - 91) / 19) * (0-(0.61171)));
            yy = -4.58959 + (((tickAnim - 91) / 19) * (0-(-4.58959)));
            zz = -3.00306 + (((tickAnim - 91) / 19) * (0-(-3.00306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 30) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 3) * (0.8525-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 33) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 3) * (1-(1)));
            zz = 0.8525 + (((tickAnim - 33) / 3) * (1-(0.8525)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 36) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 36) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 36) / 2) * (0.8525-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 38) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 3) * (1-(1)));
            zz = 0.8525 + (((tickAnim - 38) / 3) * (1-(0.8525)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 41) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 41) / 19) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 60) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 2) * (0.835-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 62) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 62) / 1) * (1-(1)));
            zz = 0.835 + (((tickAnim - 62) / 1) * (1-(0.835)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 63) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 63) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 63) / 2) * (0.835-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 1 + (((tickAnim - 65) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 2) * (1-(1)));
            zz = 0.835 + (((tickAnim - 65) / 2) * (1-(0.835)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nose.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 15) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 20) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 50) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 70) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 5) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 70) / 5) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 75) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 75) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 75) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 15) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 20) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 50) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 70) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 5) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 70) / 5) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 75) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 75) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 75) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-23.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 25.5 + (((tickAnim - 30) / 11) * (25.5-(25.5)));
            yy = -23.25 + (((tickAnim - 30) / 11) * (-23.25-(-23.25)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 25.5 + (((tickAnim - 41) / 10) * (20.56023-(25.5)));
            yy = -23.25 + (((tickAnim - 41) / 10) * (-12.70598-(-23.25)));
            zz = 0 + (((tickAnim - 41) / 10) * (9.77917-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 20.56023 + (((tickAnim - 51) / 9) * (16.18435-(20.56023)));
            yy = -12.70598 + (((tickAnim - 51) / 9) * (-45.23925-(-12.70598)));
            zz = 9.77917 + (((tickAnim - 51) / 9) * (9.56711-(9.77917)));
        }
        else if (tickAnim >= 60 && tickAnim < 91) {
            xx = 16.18435 + (((tickAnim - 60) / 31) * (16.18435-(16.18435)));
            yy = -45.23925 + (((tickAnim - 60) / 31) * (-45.23925-(-45.23925)));
            zz = 9.56711 + (((tickAnim - 60) / 31) * (9.56711-(9.56711)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = 16.18435 + (((tickAnim - 91) / 19) * (0-(16.18435)));
            yy = -45.23925 + (((tickAnim - 91) / 19) * (0-(-45.23925)));
            zz = 9.56711 + (((tickAnim - 91) / 19) * (0-(9.56711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(xx), leftear.rotateAngleY + (float) Math.toRadians(yy), leftear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (23.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 25.5 + (((tickAnim - 30) / 11) * (25.5-(25.5)));
            yy = 23.25 + (((tickAnim - 30) / 11) * (23.25-(23.25)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 25.5 + (((tickAnim - 41) / 10) * (20.56023-(25.5)));
            yy = 23.25 + (((tickAnim - 41) / 10) * (12.70598-(23.25)));
            zz = 0 + (((tickAnim - 41) / 10) * (-9.77917-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 20.56023 + (((tickAnim - 51) / 9) * (16.18435-(20.56023)));
            yy = 12.70598 + (((tickAnim - 51) / 9) * (45.23925-(12.70598)));
            zz = -9.77917 + (((tickAnim - 51) / 9) * (-9.56711-(-9.77917)));
        }
        else if (tickAnim >= 60 && tickAnim < 91) {
            xx = 16.18435 + (((tickAnim - 60) / 31) * (16.18435-(16.18435)));
            yy = 45.23925 + (((tickAnim - 60) / 31) * (45.23925-(45.23925)));
            zz = -9.56711 + (((tickAnim - 60) / 31) * (-9.56711-(-9.56711)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = 16.18435 + (((tickAnim - 91) / 19) * (0-(16.18435)));
            yy = 45.23925 + (((tickAnim - 91) / 19) * (0-(45.23925)));
            zz = -9.56711 + (((tickAnim - 91) / 19) * (0-(-9.56711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(xx), rightear.rotateAngleY + (float) Math.toRadians(yy), rightear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -1.5 + (((tickAnim - 30) / 61) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -1.5 + (((tickAnim - 91) / 19) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = 11 + (((tickAnim - 30) / 61) * (11-(11)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = 11 + (((tickAnim - 91) / 19) * (0-(11)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-4.75374-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.62471-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.65428-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -4.75374 + (((tickAnim - 30) / 61) * (-4.75374-(-4.75374)));
            yy = -0.62471 + (((tickAnim - 30) / 61) * (-0.62471-(-0.62471)));
            zz = 1.65428 + (((tickAnim - 30) / 61) * (1.65428-(1.65428)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -4.75374 + (((tickAnim - 91) / 19) * (0-(-4.75374)));
            yy = -0.62471 + (((tickAnim - 91) / 19) * (0-(-0.62471)));
            zz = 1.65428 + (((tickAnim - 91) / 19) * (0-(1.65428)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -1.5 + (((tickAnim - 30) / 61) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -1.5 + (((tickAnim - 91) / 19) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = 11 + (((tickAnim - 30) / 61) * (11-(11)));
            yy = 0 + (((tickAnim - 30) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 61) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = 11 + (((tickAnim - 91) / 19) * (0-(11)));
            yy = 0 + (((tickAnim - 91) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-4.75374-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.62471-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.65428-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 91) {
            xx = -4.75374 + (((tickAnim - 30) / 61) * (-4.75374-(-4.75374)));
            yy = -0.62471 + (((tickAnim - 30) / 61) * (-0.62471-(-0.62471)));
            zz = 1.65428 + (((tickAnim - 30) / 61) * (1.65428-(1.65428)));
        }
        else if (tickAnim >= 91 && tickAnim < 110) {
            xx = -4.75374 + (((tickAnim - 91) / 19) * (0-(-4.75374)));
            yy = -0.62471 + (((tickAnim - 91) / 19) * (0-(-0.62471)));
            zz = 1.65428 + (((tickAnim - 91) / 19) * (0-(1.65428)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdalatherium entity = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.75 + (((tickAnim - 0) / 4) * (31.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 31.5 + (((tickAnim - 4) / 7) * (-16.69914-(31.5)));
            yy = 0 + (((tickAnim - 4) / 7) * (-11.43557-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (-28.78194-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -16.69914 + (((tickAnim - 11) / 6) * (-31.64946-(-16.69914)));
            yy = -11.43557 + (((tickAnim - 11) / 6) * (-0.69704-(-11.43557)));
            zz = -28.78194 + (((tickAnim - 11) / 6) * (-16.95358-(-28.78194)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -31.64946 + (((tickAnim - 17) / 13) * (18.75-(-31.64946)));
            yy = -0.69704 + (((tickAnim - 17) / 13) * (0-(-0.69704)));
            zz = -16.95358 + (((tickAnim - 17) / 13) * (0-(-16.95358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 33.25 + (((tickAnim - 0) / 4) * (37.25-(33.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 37.25 + (((tickAnim - 4) / 7) * (-17.41714-(37.25)));
            yy = 0 + (((tickAnim - 4) / 7) * (0.40281-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (-14.27031-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -17.41714 + (((tickAnim - 11) / 6) * (7.5-(-17.41714)));
            yy = 0.40281 + (((tickAnim - 11) / 6) * (0-(0.40281)));
            zz = -14.27031 + (((tickAnim - 11) / 6) * (0-(-14.27031)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 17) / 13) * (33.25-(7.5)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.15 + (((tickAnim - 11) / 6) * (0-(0.15)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8.26249 + (((tickAnim - 0) / 4) * (43.26249-(8.26249)));
            yy = 12.09725 + (((tickAnim - 0) / 4) * (12.09725-(12.09725)));
            zz = 11.25227 + (((tickAnim - 0) / 4) * (11.25227-(11.25227)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 43.26249 + (((tickAnim - 4) / 7) * (90.84688-(43.26249)));
            yy = 12.09725 + (((tickAnim - 4) / 7) * (5.28981-(12.09725)));
            zz = 11.25227 + (((tickAnim - 4) / 7) * (8.77288-(11.25227)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 90.84688 + (((tickAnim - 11) / 6) * (17.31439-(90.84688)));
            yy = 5.28981 + (((tickAnim - 11) / 6) * (-0.15615-(5.28981)));
            zz = 8.77288 + (((tickAnim - 11) / 6) * (6.78936-(8.77288)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 17.31439 + (((tickAnim - 17) / 6) * (-15.96156-(17.31439)));
            yy = -0.15615 + (((tickAnim - 17) / 6) * (5.97055-(-0.15615)));
            zz = 6.78936 + (((tickAnim - 17) / 6) * (9.02082-(6.78936)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -15.96156 + (((tickAnim - 23) / 7) * (8.26249-(-15.96156)));
            yy = 5.97055 + (((tickAnim - 23) / 7) * (12.09725-(5.97055)));
            zz = 9.02082 + (((tickAnim - 23) / 7) * (11.25227-(9.02082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 4) * (0.375-(0.625)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.375-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 4) / 7) * (0.495-(0.375)));
            zz = -0.375 + (((tickAnim - 4) / 7) * (-0.695-(-0.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.495 + (((tickAnim - 11) / 6) * (0-(0.495)));
            zz = -0.695 + (((tickAnim - 11) / 6) * (0-(-0.695)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0.625-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -31.64946 + (((tickAnim - 0) / 17) * (31.5-(-31.64946)));
            yy = 0.69704 + (((tickAnim - 0) / 17) * (0-(0.69704)));
            zz = 16.95358 + (((tickAnim - 0) / 17) * (0-(16.95358)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 31.5 + (((tickAnim - 17) / 7) * (-16.69914-(31.5)));
            yy = 0 + (((tickAnim - 17) / 7) * (11.43557-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (28.78194-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -16.69914 + (((tickAnim - 24) / 6) * (-31.64946-(-16.69914)));
            yy = 11.43557 + (((tickAnim - 24) / 6) * (0.69704-(11.43557)));
            zz = 28.78194 + (((tickAnim - 24) / 6) * (16.95358-(28.78194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 7.5 + (((tickAnim - 0) / 17) * (37.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 37.25 + (((tickAnim - 17) / 7) * (-17.41714-(37.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0.40281-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (14.27031-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -17.41714 + (((tickAnim - 24) / 6) * (7.5-(-17.41714)));
            yy = 0.40281 + (((tickAnim - 24) / 6) * (0-(0.40281)));
            zz = 14.27031 + (((tickAnim - 24) / 6) * (0-(14.27031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.15 + (((tickAnim - 24) / 6) * (0-(0.15)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18.8175 + (((tickAnim - 0) / 7) * (-16.88987-(18.8175)));
            yy = 3.69411 + (((tickAnim - 0) / 7) * (-2.95488-(3.69411)));
            zz = -3.79295 + (((tickAnim - 0) / 7) * (-6.93372-(-3.79295)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -16.88987 + (((tickAnim - 7) / 10) * (43.26249-(-16.88987)));
            yy = -2.95488 + (((tickAnim - 7) / 10) * (-12.09725-(-2.95488)));
            zz = -6.93372 + (((tickAnim - 7) / 10) * (-11.25227-(-6.93372)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 43.26249 + (((tickAnim - 17) / 7) * (90.84688-(43.26249)));
            yy = -12.09725 + (((tickAnim - 17) / 7) * (-5.28981-(-12.09725)));
            zz = -11.25227 + (((tickAnim - 17) / 7) * (-8.77288-(-11.25227)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 90.84688 + (((tickAnim - 24) / 6) * (18.8175-(90.84688)));
            yy = -5.28981 + (((tickAnim - 24) / 6) * (3.69411-(-5.28981)));
            zz = -8.77288 + (((tickAnim - 24) / 6) * (-3.79295-(-8.77288)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.37-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0.03 + (((tickAnim - 7) / 10) * (0.375-(0.03)));
            zz = -0.37 + (((tickAnim - 7) / 10) * (-0.375-(-0.37)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 17) / 7) * (0.495-(0.375)));
            zz = -0.375 + (((tickAnim - 17) / 7) * (-0.695-(-0.375)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.495 + (((tickAnim - 24) / 6) * (0-(0.495)));
            zz = -0.695 + (((tickAnim - 24) / 6) * (0-(-0.695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 15.7 + (((tickAnim - 0) / 7) * (39-(15.7)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 39 + (((tickAnim - 7) / 7) * (69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95-(39)));
            yy = 0 + (((tickAnim - 7) / 7) * (-2.60748-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-15.58817-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95 + (((tickAnim - 14) / 4) * (-12.46624-(69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95)));
            yy = -2.60748 + (((tickAnim - 14) / 4) * (-3.69393-(-2.60748)));
            zz = -15.58817 + (((tickAnim - 14) / 4) * (-22.08324-(-15.58817)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.46624 + (((tickAnim - 18) / 12) * (15.7-(-12.46624)));
            yy = -3.69393 + (((tickAnim - 18) / 12) * (0-(-3.69393)));
            zz = -22.08324 + (((tickAnim - 18) / 12) * (0-(-22.08324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22 + (((tickAnim - 0) / 7) * (29.75-(22)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 29.75 + (((tickAnim - 7) / 7) * (-2.93967-(29.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (2.29923-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (19.60964-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.93967 + (((tickAnim - 14) / 4) * (-31.60203-(-2.93967)));
            yy = 2.29923 + (((tickAnim - 14) / 4) * (3.25724-(2.29923)));
            zz = 19.60964 + (((tickAnim - 14) / 4) * (27.78032-(19.60964)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -31.60203 + (((tickAnim - 18) / 12) * (22-(-31.60203)));
            yy = 3.25724 + (((tickAnim - 18) / 12) * (0-(3.25724)));
            zz = 27.78032 + (((tickAnim - 18) / 12) * (0-(27.78032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4 + (((tickAnim - 0) / 7) * (56.25-(4)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 56.25 + (((tickAnim - 7) / 1) * (87.0638-(56.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.13475-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.60696-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 87.0638 + (((tickAnim - 8) / 6) * (67.1328-(87.0638)));
            yy = -0.13475 + (((tickAnim - 8) / 6) * (-0.80848-(-0.13475)));
            zz = 0.60696 + (((tickAnim - 8) / 6) * (3.64177-(0.60696)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 67.1328 + (((tickAnim - 14) / 4) * (32.3548-(67.1328)));
            yy = -0.80848 + (((tickAnim - 14) / 4) * (-1.14535-(-0.80848)));
            zz = 3.64177 + (((tickAnim - 14) / 4) * (5.15917-(3.64177)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 32.3548 + (((tickAnim - 18) / 4) * (14.65065-(32.3548)));
            yy = -1.14535 + (((tickAnim - 18) / 4) * (-0.78366-(-1.14535)));
            zz = 5.15917 + (((tickAnim - 18) / 4) * (3.52996-(5.15917)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 14.65065 + (((tickAnim - 22) / 3) * (-5.73421-(14.65065)));
            yy = -0.78366 + (((tickAnim - 22) / 3) * (-0.48225-(-0.78366)));
            zz = 3.52996 + (((tickAnim - 22) / 3) * (2.17228-(3.52996)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -5.73421 + (((tickAnim - 25) / 5) * (4-(-5.73421)));
            yy = -0.48225 + (((tickAnim - 25) / 5) * (0-(-0.48225)));
            zz = 2.17228 + (((tickAnim - 25) / 5) * (0-(2.17228)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1.765-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 1.765 + (((tickAnim - 11) / 3) * (1.485-(1.765)));
            zz = 0.1 + (((tickAnim - 11) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.485 + (((tickAnim - 14) / 4) * (0.3-(1.485)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 4) * (0.51-(0.3)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.51 + (((tickAnim - 22) / 8) * (0-(0.51)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -22.46624 + (((tickAnim - 0) / 4) * (-9.21624-(-22.46624)));
            yy = 3.69393 + (((tickAnim - 0) / 4) * (3.69393-(3.69393)));
            zz = 22.08324 + (((tickAnim - 0) / 4) * (22.08324-(22.08324)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -9.21624 + (((tickAnim - 4) / 14) * (33.5-(-9.21624)));
            yy = 3.69393 + (((tickAnim - 4) / 14) * (0-(3.69393)));
            zz = 22.08324 + (((tickAnim - 4) / 14) * (0-(22.08324)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 33.5 + (((tickAnim - 18) / 12) * (-22.46624-(33.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (3.69393-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (22.08324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.35203 + (((tickAnim - 0) / 4) * (-37.10203-(-12.35203)));
            yy = -3.25724 + (((tickAnim - 0) / 4) * (-3.25724-(-3.25724)));
            zz = -27.78032 + (((tickAnim - 0) / 4) * (-27.78032-(-27.78032)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -37.10203 + (((tickAnim - 4) / 14) * (27-(-37.10203)));
            yy = -3.25724 + (((tickAnim - 4) / 14) * (0-(-3.25724)));
            zz = -27.78032 + (((tickAnim - 4) / 14) * (0-(-27.78032)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 27 + (((tickAnim - 18) / 12) * (-12.35203-(27)));
            yy = 0 + (((tickAnim - 18) / 12) * (-3.25724-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-27.78032-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0.375 + (((tickAnim - 0) / 18) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = -0.4 + (((tickAnim - 0) / 18) * (0-(-0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 56.28251 + (((tickAnim - 0) / 4) * (32.3548-(56.28251)));
            yy = 4.77175 + (((tickAnim - 0) / 4) * (1.14535-(4.77175)));
            zz = -9.10777 + (((tickAnim - 0) / 4) * (-5.15917-(-9.10777)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 32.3548 + (((tickAnim - 4) / 7) * (-8.6613-(32.3548)));
            yy = 1.14535 + (((tickAnim - 4) / 7) * (0.28634-(1.14535)));
            zz = -5.15917 + (((tickAnim - 4) / 7) * (-1.28979-(-5.15917)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -8.6613 + (((tickAnim - 11) / 7) * (56.25-(-8.6613)));
            yy = 0.28634 + (((tickAnim - 11) / 7) * (0-(0.28634)));
            zz = -1.28979 + (((tickAnim - 11) / 7) * (0-(-1.28979)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 56.25 + (((tickAnim - 18) / 2) * (84.00542-(56.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.79529-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-1.51796-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 84.00542 + (((tickAnim - 20) / 10) * (56.28251-(84.00542)));
            yy = 0.79529 + (((tickAnim - 20) / 10) * (4.77175-(0.79529)));
            zz = -1.51796 + (((tickAnim - 20) / 10) * (-9.10777-(-1.51796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 4) * (0.3-(1.325)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 4) / 7) * (1.02-(0.3)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.02 + (((tickAnim - 11) / 4) * (0.24-(1.02)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.24 + (((tickAnim - 15) / 3) * (0-(0.24)));
            zz = 0.325 + (((tickAnim - 15) / 3) * (0-(0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (1.285-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.285 + (((tickAnim - 25) / 5) * (1.325-(1.285)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+40))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*0.31);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*0.31);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*4), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*-4), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+40))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-160))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+40))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.nose.setScale((float)1,(float)1, (float) ((float)1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.03));


        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*4), leftear.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), leftear.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4));


        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*4), rightear.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), rightear.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdalatherium entity = (EntityPrehistoricFloraAdalatherium) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.75 + (((tickAnim - 0) / 2) * (31.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 31.5 + (((tickAnim - 2) / 3) * (-16.69914-(31.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (-11.43557-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (-28.78194-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.69914 + (((tickAnim - 5) / 3) * (-31.64946-(-16.69914)));
            yy = -11.43557 + (((tickAnim - 5) / 3) * (-0.69704-(-11.43557)));
            zz = -28.78194 + (((tickAnim - 5) / 3) * (-16.95358-(-28.78194)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -31.64946 + (((tickAnim - 8) / 7) * (18.75-(-31.64946)));
            yy = -0.69704 + (((tickAnim - 8) / 7) * (0-(-0.69704)));
            zz = -16.95358 + (((tickAnim - 8) / 7) * (0-(-16.95358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 33.25 + (((tickAnim - 0) / 2) * (37.25-(33.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 37.25 + (((tickAnim - 2) / 3) * (-17.41714-(37.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.40281-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (-14.27031-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.41714 + (((tickAnim - 5) / 3) * (7.5-(-17.41714)));
            yy = 0.40281 + (((tickAnim - 5) / 3) * (0-(0.40281)));
            zz = -14.27031 + (((tickAnim - 5) / 3) * (0-(-14.27031)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 8) / 7) * (33.25-(7.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 5) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.26249 + (((tickAnim - 0) / 2) * (43.26249-(8.26249)));
            yy = 12.09725 + (((tickAnim - 0) / 2) * (12.09725-(12.09725)));
            zz = 11.25227 + (((tickAnim - 0) / 2) * (11.25227-(11.25227)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 43.26249 + (((tickAnim - 2) / 3) * (90.84688-(43.26249)));
            yy = 12.09725 + (((tickAnim - 2) / 3) * (5.28981-(12.09725)));
            zz = 11.25227 + (((tickAnim - 2) / 3) * (8.77288-(11.25227)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 90.84688 + (((tickAnim - 5) / 3) * (17.31439-(90.84688)));
            yy = 5.28981 + (((tickAnim - 5) / 3) * (-0.15615-(5.28981)));
            zz = 8.77288 + (((tickAnim - 5) / 3) * (6.78936-(8.77288)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 17.31439 + (((tickAnim - 8) / 4) * (-15.96156-(17.31439)));
            yy = -0.15615 + (((tickAnim - 8) / 4) * (5.97055-(-0.15615)));
            zz = 6.78936 + (((tickAnim - 8) / 4) * (9.02082-(6.78936)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -15.96156 + (((tickAnim - 12) / 3) * (8.26249-(-15.96156)));
            yy = 5.97055 + (((tickAnim - 12) / 3) * (12.09725-(5.97055)));
            zz = 9.02082 + (((tickAnim - 12) / 3) * (11.25227-(9.02082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 2) * (0.375-(0.625)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.375-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 2) / 3) * (0.495-(0.375)));
            zz = -0.375 + (((tickAnim - 2) / 3) * (-0.695-(-0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.495 + (((tickAnim - 5) / 3) * (0-(0.495)));
            zz = -0.695 + (((tickAnim - 5) / 3) * (0-(-0.695)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -31.64946 + (((tickAnim - 0) / 8) * (31.5-(-31.64946)));
            yy = 0.69704 + (((tickAnim - 0) / 8) * (0-(0.69704)));
            zz = 16.95358 + (((tickAnim - 0) / 8) * (0-(16.95358)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 31.5 + (((tickAnim - 8) / 4) * (-16.69914-(31.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (11.43557-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (28.78194-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -16.69914 + (((tickAnim - 12) / 3) * (-31.64946-(-16.69914)));
            yy = 11.43557 + (((tickAnim - 12) / 3) * (0.69704-(11.43557)));
            zz = 28.78194 + (((tickAnim - 12) / 3) * (16.95358-(28.78194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 0) / 8) * (37.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 37.25 + (((tickAnim - 8) / 4) * (-17.41714-(37.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.40281-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (14.27031-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.41714 + (((tickAnim - 12) / 3) * (7.5-(-17.41714)));
            yy = 0.40281 + (((tickAnim - 12) / 3) * (0-(0.40281)));
            zz = 14.27031 + (((tickAnim - 12) / 3) * (0-(14.27031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.15-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 12) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.8175 + (((tickAnim - 0) / 3) * (-16.88987-(18.8175)));
            yy = 3.69411 + (((tickAnim - 0) / 3) * (-2.95488-(3.69411)));
            zz = -3.79295 + (((tickAnim - 0) / 3) * (-6.93372-(-3.79295)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -16.88987 + (((tickAnim - 3) / 5) * (43.26249-(-16.88987)));
            yy = -2.95488 + (((tickAnim - 3) / 5) * (-12.09725-(-2.95488)));
            zz = -6.93372 + (((tickAnim - 3) / 5) * (-11.25227-(-6.93372)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 43.26249 + (((tickAnim - 8) / 4) * (90.84688-(43.26249)));
            yy = -12.09725 + (((tickAnim - 8) / 4) * (-5.28981-(-12.09725)));
            zz = -11.25227 + (((tickAnim - 8) / 4) * (-8.77288-(-11.25227)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 90.84688 + (((tickAnim - 12) / 3) * (18.8175-(90.84688)));
            yy = -5.28981 + (((tickAnim - 12) / 3) * (3.69411-(-5.28981)));
            zz = -8.77288 + (((tickAnim - 12) / 3) * (-3.79295-(-8.77288)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.37-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.03 + (((tickAnim - 3) / 5) * (0.375-(0.03)));
            zz = -0.37 + (((tickAnim - 3) / 5) * (-0.375-(-0.37)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 4) * (0.495-(0.375)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.695-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.495 + (((tickAnim - 12) / 3) * (0-(0.495)));
            zz = -0.695 + (((tickAnim - 12) / 3) * (0-(-0.695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.7 + (((tickAnim - 0) / 3) * (39-(15.7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 39 + (((tickAnim - 3) / 4) * (69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95-(39)));
            yy = 0 + (((tickAnim - 3) / 4) * (-2.60748-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-15.58817-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95 + (((tickAnim - 7) / 2) * (-12.46624-(69.3003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-95)));
            yy = -2.60748 + (((tickAnim - 7) / 2) * (-3.69393-(-2.60748)));
            zz = -15.58817 + (((tickAnim - 7) / 2) * (-22.08324-(-15.58817)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -12.46624 + (((tickAnim - 9) / 6) * (15.7-(-12.46624)));
            yy = -3.69393 + (((tickAnim - 9) / 6) * (0-(-3.69393)));
            zz = -22.08324 + (((tickAnim - 9) / 6) * (0-(-22.08324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22 + (((tickAnim - 0) / 3) * (29.75-(22)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 29.75 + (((tickAnim - 3) / 4) * (-2.93967-(29.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (2.29923-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (19.60964-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -2.93967 + (((tickAnim - 7) / 2) * (-31.60203-(-2.93967)));
            yy = 2.29923 + (((tickAnim - 7) / 2) * (3.25724-(2.29923)));
            zz = 19.60964 + (((tickAnim - 7) / 2) * (27.78032-(19.60964)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -31.60203 + (((tickAnim - 9) / 6) * (22-(-31.60203)));
            yy = 3.25724 + (((tickAnim - 9) / 6) * (0-(3.25724)));
            zz = 27.78032 + (((tickAnim - 9) / 6) * (0-(27.78032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4 + (((tickAnim - 0) / 3) * (56.25-(4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 56.25 + (((tickAnim - 3) / 4) * (67.1328-(56.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (-0.80848-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (3.64177-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 67.1328 + (((tickAnim - 7) / 2) * (32.3548-(67.1328)));
            yy = -0.80848 + (((tickAnim - 7) / 2) * (-1.14535-(-0.80848)));
            zz = 3.64177 + (((tickAnim - 7) / 2) * (5.15917-(3.64177)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 32.3548 + (((tickAnim - 9) / 2) * (14.65065-(32.3548)));
            yy = -1.14535 + (((tickAnim - 9) / 2) * (-0.78366-(-1.14535)));
            zz = 5.15917 + (((tickAnim - 9) / 2) * (3.52996-(5.15917)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 14.65065 + (((tickAnim - 11) / 2) * (-5.73421-(14.65065)));
            yy = -0.78366 + (((tickAnim - 11) / 2) * (-0.48225-(-0.78366)));
            zz = 3.52996 + (((tickAnim - 11) / 2) * (2.17228-(3.52996)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.73421 + (((tickAnim - 13) / 2) * (4-(-5.73421)));
            yy = -0.48225 + (((tickAnim - 13) / 2) * (0-(-0.48225)));
            zz = 2.17228 + (((tickAnim - 13) / 2) * (0-(2.17228)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.765-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.765 + (((tickAnim - 5) / 2) * (1.485-(1.765)));
            zz = 0.1 + (((tickAnim - 5) / 2) * (0-(0.1)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 1.485 + (((tickAnim - 7) / 2) * (0.3-(1.485)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 9) / 2) * (0.51-(0.3)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.51 + (((tickAnim - 11) / 2) * (0.835-(0.51)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.835 + (((tickAnim - 13) / 2) * (0-(0.835)));
            zz = 0.175 + (((tickAnim - 13) / 2) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -22.46624 + (((tickAnim - 0) / 2) * (-9.21624-(-22.46624)));
            yy = 3.69393 + (((tickAnim - 0) / 2) * (3.69393-(3.69393)));
            zz = 22.08324 + (((tickAnim - 0) / 2) * (22.08324-(22.08324)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -9.21624 + (((tickAnim - 2) / 7) * (33.5-(-9.21624)));
            yy = 3.69393 + (((tickAnim - 2) / 7) * (0-(3.69393)));
            zz = 22.08324 + (((tickAnim - 2) / 7) * (0-(22.08324)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 33.5 + (((tickAnim - 9) / 6) * (-22.46624-(33.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (3.69393-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (22.08324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -12.35203 + (((tickAnim - 0) / 2) * (-37.10203-(-12.35203)));
            yy = -3.25724 + (((tickAnim - 0) / 2) * (-3.25724-(-3.25724)));
            zz = -27.78032 + (((tickAnim - 0) / 2) * (-27.78032-(-27.78032)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -37.10203 + (((tickAnim - 2) / 7) * (27-(-37.10203)));
            yy = -3.25724 + (((tickAnim - 2) / 7) * (0-(-3.25724)));
            zz = -27.78032 + (((tickAnim - 2) / 7) * (0-(-27.78032)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 27 + (((tickAnim - 9) / 6) * (-12.35203-(27)));
            yy = 0 + (((tickAnim - 9) / 6) * (-3.25724-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (-27.78032-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.375 + (((tickAnim - 0) / 9) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = -0.4 + (((tickAnim - 0) / 9) * (0-(-0.4)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (-0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 56.28251 + (((tickAnim - 0) / 2) * (32.3548-(56.28251)));
            yy = 4.77175 + (((tickAnim - 0) / 2) * (1.14535-(4.77175)));
            zz = -9.10777 + (((tickAnim - 0) / 2) * (-5.15917-(-9.10777)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 32.3548 + (((tickAnim - 2) / 3) * (-8.6613-(32.3548)));
            yy = 1.14535 + (((tickAnim - 2) / 3) * (0.28634-(1.14535)));
            zz = -5.15917 + (((tickAnim - 2) / 3) * (-1.28979-(-5.15917)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.6613 + (((tickAnim - 5) / 4) * (56.25-(-8.6613)));
            yy = 0.28634 + (((tickAnim - 5) / 4) * (0-(0.28634)));
            zz = -1.28979 + (((tickAnim - 5) / 4) * (0-(-1.28979)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 56.25 + (((tickAnim - 9) / 1) * (84.00542-(56.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0.79529-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (-1.51796-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 84.00542 + (((tickAnim - 10) / 5) * (56.28251-(84.00542)));
            yy = 0.79529 + (((tickAnim - 10) / 5) * (4.77175-(0.79529)));
            zz = -1.51796 + (((tickAnim - 10) / 5) * (-9.10777-(-1.51796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 2) * (0.3-(1.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 2) / 3) * (1.02-(0.3)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.02 + (((tickAnim - 5) / 3) * (0.24-(1.02)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.325-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.24 + (((tickAnim - 8) / 1) * (0-(0.24)));
            zz = 0.325 + (((tickAnim - 8) / 1) * (0-(0.325)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (1.285-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.285 + (((tickAnim - 13) / 2) * (1.325-(1.285)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-3), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+40))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+50))*0.7);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+50))*0.7);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*4), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-130))*-4), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+40))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-160))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+40))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.nose.setScale((float)1,(float)1, (float) ((float)1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.03));


        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*4), leftear.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), leftear.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4));


        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*4), rightear.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-2), rightear.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAdalatherium e = (EntityPrehistoricFloraAdalatherium) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
