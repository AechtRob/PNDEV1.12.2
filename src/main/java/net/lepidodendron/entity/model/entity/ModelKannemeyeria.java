package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKannemeyeria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKannemeyeria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer backrightleg5;
    private final AdvancedModelRenderer backrightleg6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontrightleg4;
    private final AdvancedModelRenderer frontrightleg5;
    private final AdvancedModelRenderer frontrightleg6;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontleftleg7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;


    private ModelAnimator animator;

    public ModelKannemeyeria() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 19.5F, 7.0F);


        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -2.5F, -2.5F);
        this.hip.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.3054F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 24, -2.0F, -1.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(1.25F, 2.5F, 2.25F);
        this.lowerbody.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, 0.4363F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 24, 33, -0.4226F, -1.0F, -1.5937F, 4, 2, 3, 0.01F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.6095F, 0.5F, -0.8793F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.8727F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.01F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 3.25F, -0.5F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.5796F, -0.2711F, 0.3246F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 10, 33, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-1.25F, 2.5F, 2.25F);
        this.lowerbody.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, -0.4363F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 24, 33, -3.5774F, -1.0F, -1.5937F, 4, 2, 3, 0.01F, true));

        this.backrightleg5 = new AdvancedModelRenderer(this);
        this.backrightleg5.setRotationPoint(-2.6095F, 0.5F, -0.8793F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.8727F, 0.0F, 0.0F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.01F, true));

        this.backrightleg6 = new AdvancedModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.0F, 3.25F, -0.5F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, -0.5796F, 0.2711F, -0.3246F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 10, 33, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.lowerbody.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 14, -1.5F, -0.25F, -1.0F, 3, 4, 6, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -1.0F, -1.0F, -1.0F, 2, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1329F, 0.0F, 0.023F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 9, 0.0F, -0.99F, 0.0F, 1, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.51F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1855F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 24, -0.5F, -1.21F, -1.0F, 1, 1, 8, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.0F, -8.0F, 5, 6, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -2.0F, -1.0F, -5.0F, 4, 6, 5, -0.01F, false));

        this.frontrightleg4 = new AdvancedModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-1.4821F, 3.5F, -3.451F);
        this.body2.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, 0.5236F, 0.0F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 0, 25, -4.7321F, -1.0F, -1.134F, 5, 2, 2, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRenderer(this);
        this.frontrightleg5.setRotationPoint(-3.7321F, -0.5F, -0.134F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0F, 0.3927F);
        this.frontrightleg5.cubeList.add(new ModelBox(frontrightleg5, 10, 38, -1.0F, 0.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.frontrightleg6 = new AdvancedModelRenderer(this);
        this.frontrightleg6.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.0436F, -0.0038F, -0.3925F);
        this.frontrightleg6.cubeList.add(new ModelBox(frontrightleg6, 34, 34, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(1.4821F, 3.5F, -3.451F);
        this.body2.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, -0.5236F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 0, 25, -0.2679F, -1.0F, -1.134F, 5, 2, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(3.7321F, -0.5F, -0.134F);
        this.frontleftleg.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.0F, 0.0F, -0.3927F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 10, 38, -1.0F, 0.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.frontleftleg7 = new AdvancedModelRenderer(this);
        this.frontleftleg7.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.frontleftleg3.addChild(frontleftleg7);
        this.setRotateAngle(frontleftleg7, -0.0436F, 0.0038F, 0.3925F);
        this.frontleftleg7.cubeList.add(new ModelBox(frontleftleg7, 34, 34, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3981F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -1.0F, 0.0F, -2.0F, 3, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 37, -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0804F, -3.2299F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 17, -1.5F, 0.0804F, -2.5201F, 3, 2, 3, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.2304F, -6.2701F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 47, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 42, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.9008F, -6.3433F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 40, -0.5F, 0.0437F, -3.025F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0804F, -2.5201F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 0, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.45F, 1.0804F, -2.5201F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 53, 0.0F, 0.0067F, -1.9193F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.45F, 1.0804F, -2.5201F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 53, -1.0F, 0.0067F, -1.9193F, 1, 1, 2, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0551F, 0.4588F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 24, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 48, -0.5F, 0.0F, -9.0F, 1, 1, 6, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 40, -1.5F, -1.47F, -1.1F, 3, 2, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 40, -1.5F, -1.47F, -1.6F, 3, 2, 1, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, -2.25F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 9, -1.0F, -0.7275F, -0.2918F, 2, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5934F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 57, 0.1F, -0.5F, -1.95F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5934F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 57, -1.1F, -0.5F, -1.95F, 1, 1, 2, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.8304F, -1.3201F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 40, 52, 0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 40, 52, -1.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.30F;
        this.hip.offsetX = 1.2F;
        this.hip.rotateAngleY = (float)Math.toRadians(130);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 2.0F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraKannemeyeria entityKannemeyeria = (EntityPrehistoricFloraKannemeyeria) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};


        if (entityKannemeyeria.getAnimation() == entityKannemeyeria.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityKannemeyeria.isReallyInWater()) {

                if (f3 == 0.0F || !entityKannemeyeria.getIsMoving()) {
                    if (entityKannemeyeria.getAnimation() != entityKannemeyeria.EAT_ANIMATION
                            && entityKannemeyeria.getAnimation() != entityKannemeyeria.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityKannemeyeria.getIsFast()) { //Running


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
        EntityPrehistoricFloraKannemeyeria ee = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
//        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
//            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKannemeyeria e = (EntityPrehistoricFloraKannemeyeria) entity;
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
