package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKururubatrachus;
import net.lepidodendron.entity.EntityPrehistoricFloraKururubatrachus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKururubatrachus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tongue;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer leftarm4;
    private final AdvancedModelRenderer leftarm5;
    private final AdvancedModelRenderer leftarm6;
    private final AdvancedModelRenderer Belly;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;

    private ModelAnimator animator;

    public ModelKururubatrachus() {
        this.textureWidth = 36;
        this.textureHeight = 32;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 23.75F, -2.0F);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 12, -1.5F, -1.9F, 0.05F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 6, -1.0F, -1.75F, -4.5F, 2, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 6, -1.5F, -2.025F, -3.5F, 3, 2, 4, -0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -2.55F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 0, -2.0F, -0.85F, -2.2F, 4, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -2.25F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 8, 22, -0.75F, -0.5F, -2.45F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 22, -0.25F, -0.5F, -2.45F, 1, 1, 3, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.5F, -2.625F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 26, -1.125F, -1.0F, 1.8F, 2, 1, 1, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, 0.5F, -2.45F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 20, -1.975F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.75F, 0.5F, -2.45F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6545F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 20, -0.025F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.5F, -2.625F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0436F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 26, -0.875F, -1.0F, 1.8F, 2, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.75F, -0.5F, -2.45F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 2, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 2, -1.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.775F, -1.55F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 17, -1.0F, -0.025F, 0.0F, 2, 1, 2, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.4F, -0.9F, -1.45F);
        this.head.addChild(righteye);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.righteye.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, -0.3491F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 4, -0.275F, -0.05F, -0.25F, 1, 1, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.4F, -0.9F, -1.45F);
        this.head.addChild(lefteye);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lefteye.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.3491F, -0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 4, -0.725F, -0.05F, -0.25F, 1, 1, 1, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.55F, -0.15F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 22, -0.75F, -0.45F, -2.25F, 1, 1, 3, -0.015F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 22, -0.25F, -0.45F, -2.25F, 1, 1, 3, -0.015F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.975F, 0.55F, -2.4F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -1.125F, -1.0F, 1.775F, 2, 1, 1, -0.03F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, 0.55F, -2.25F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 22, -1.975F, -1.0F, 0.0F, 2, 1, 2, -0.02F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.75F, 0.55F, -2.25F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6109F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 22, -0.025F, -1.0F, 0.0F, 2, 1, 2, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.975F, 0.55F, -2.4F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0436F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 28, -0.875F, -1.0F, 1.775F, 2, 1, 1, -0.03F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, -0.15F, 0.2F);
        this.lowerjaw.addChild(tongue);
        this.tongue.cubeList.add(new ModelBox(tongue, 26, 6, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.625F, -1.25F);
        this.lowerjaw.addChild(throat);
        this.setRotateAngle(throat, -0.2793F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 16, 25, -1.0F, -1.025F, -0.25F, 2, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.025F, 1.75F);
        this.throat.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 23, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.5F, -0.6F, -2.95F);
        this.body.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0262F, 0.9599F, -0.3665F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 26, -2.0F, -0.5F, -1.0F, 3, 1, 1, 0.01F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-2.0F, 0.0F, -0.5F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.0262F, -1.933F, 0.2182F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 8, 26, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-1.75F, 0.25F, 0.25F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.1745F, -0.4363F, 0.1745F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 17, -2.5F, 0.0F, -1.6F, 3, 0, 3, 0.0F, false));
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 12, 17, -2.5F, 0.05F, -1.6F, 3, 0, 3, 0.0F, false));

        this.leftarm4 = new AdvancedModelRenderer(this);
        this.leftarm4.setRotationPoint(1.5F, -0.6F, -2.95F);
        this.body.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.0262F, -0.9599F, 0.3665F);
        this.leftarm4.cubeList.add(new ModelBox(leftarm4, 0, 26, -1.0F, -0.5F, -1.0F, 3, 1, 1, 0.01F, true));

        this.leftarm5 = new AdvancedModelRenderer(this);
        this.leftarm5.setRotationPoint(2.0F, 0.0F, -0.5F);
        this.leftarm4.addChild(leftarm5);
        this.setRotateAngle(leftarm5, -0.0262F, 1.933F, -0.2182F);
        this.leftarm5.cubeList.add(new ModelBox(leftarm5, 8, 26, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftarm6 = new AdvancedModelRenderer(this);
        this.leftarm6.setRotationPoint(1.75F, 0.25F, 0.25F);
        this.leftarm5.addChild(leftarm6);
        this.setRotateAngle(leftarm6, 0.1745F, 0.4363F, -0.1745F);
        this.leftarm6.cubeList.add(new ModelBox(leftarm6, 0, 17, -0.5F, 0.0F, -1.6F, 3, 0, 3, 0.0F, true));
        this.leftarm6.cubeList.add(new ModelBox(leftarm6, 12, 17, -0.5F, 0.05F, -1.6F, 3, 0, 3, 0.0F, true));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.body.addChild(Belly);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 0, -2.0F, -1.5F, -0.5F, 4, 2, 4, 0.01F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.0F, -0.75F, 3.6F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, -0.7854F, -0.1134F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 16, 4, -3.75F, -1.0F, -1.0F, 5, 1, 1, 0.01F, false));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 12, 20, -3.75F, -1.0F, -0.25F, 5, 1, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-3.35F, 0.05F, 0.35F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 2.6616F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 20, -4.5F, -1.0F, -0.5F, 5, 1, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-4.5F, 0.025F, 0.0F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.1309F, -2.7053F, 0.0349F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 26, 9, -2.0003F, -0.952F, -0.502F, 2, 1, 1, -0.01F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-1.7503F, -0.202F, -0.002F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0F, 0.3491F, 0.0175F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 14, 11, -4.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 14, 14, -4.0F, 0.1F, -1.0F, 4, 0, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.0F, -0.75F, 3.6F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, 0.7854F, 0.1134F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 16, 4, -1.25F, -1.0F, -1.0F, 5, 1, 1, 0.01F, true));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 12, 20, -1.25F, -1.0F, -0.25F, 5, 1, 1, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(3.35F, 0.05F, 0.35F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -2.6616F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 20, -0.5F, -1.0F, -0.5F, 5, 1, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(4.5F, 0.025F, 0.0F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.1309F, 2.7053F, -0.0349F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 26, 9, 0.0003F, -0.952F, -0.502F, 2, 1, 1, -0.01F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(1.7503F, -0.202F, -0.002F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0F, -0.3491F, -0.0175F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 14, 11, 0.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, true));
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 14, 14, 0.0F, 0.1F, -1.0F, 4, 0, 3, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.8F;
        this.hips.offsetX = -0.138F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(48);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 2.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);


        EntityPrehistoricFloraKururubatrachus entitySilesaurus = (EntityPrehistoricFloraKururubatrachus) e;
        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraKururubatrachus ee = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.JUMP_ANIMATION && ee.isWalking && ee.onGround) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animTongue(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            //animCroak(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-10), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.11883 + (((tickAnim - 0) / 5) * (4.38789-(4.11883)));
            yy = 115.3637 + (((tickAnim - 0) / 5) * (102.86137-(115.3637)));
            zz = 4.09069 + (((tickAnim - 0) / 5) * (4.39996-(4.09069)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.38789 + (((tickAnim - 5) / 5) * (5.78673-(4.38789)));
            yy = 102.86137 + (((tickAnim - 5) / 5) * (72.21784-(102.86137)));
            zz = 4.39996 + (((tickAnim - 5) / 5) * (16.80273-(4.39996)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.78673 + (((tickAnim - 10) / 5) * (-2.01352-(5.78673)));
            yy = 72.21784 + (((tickAnim - 10) / 5) * (3.84373-(72.21784)));
            zz = 16.80273 + (((tickAnim - 10) / 5) * (22.08714-(16.80273)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.01352 + (((tickAnim - 15) / 5) * (0-(-2.01352)));
            yy = 3.84373 + (((tickAnim - 15) / 5) * (-10-(3.84373)));
            zz = 22.08714 + (((tickAnim - 15) / 5) * (0-(22.08714)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-4.79151-(0)));
            yy = -10 + (((tickAnim - 20) / 5) * (15.53573-(-10)));
            zz = 0 + (((tickAnim - 20) / 5) * (5.47366-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -4.79151 + (((tickAnim - 25) / 5) * (3.36162-(-4.79151)));
            yy = 15.53573 + (((tickAnim - 25) / 5) * (37.87424-(15.53573)));
            zz = 5.47366 + (((tickAnim - 25) / 5) * (5.18783-(5.47366)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 3.36162 + (((tickAnim - 30) / 2) * (3.88632-(3.36162)));
            yy = 37.87424 + (((tickAnim - 30) / 2) * (50.3195-(37.87424)));
            zz = 5.18783 + (((tickAnim - 30) / 2) * (7.9408-(5.18783)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 3.88632 + (((tickAnim - 32) / 3) * (3.55593-(3.88632)));
            yy = 50.3195 + (((tickAnim - 32) / 3) * (82.8694-(50.3195)));
            zz = 7.9408 + (((tickAnim - 32) / 3) * (5.8311-(7.9408)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.55593 + (((tickAnim - 35) / 5) * (4.11883-(3.55593)));
            yy = 82.8694 + (((tickAnim - 35) / 5) * (115.3637-(82.8694)));
            zz = 5.8311 + (((tickAnim - 35) / 5) * (4.09069-(5.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 0) / 5) * (0-(5)));
            yy = -87.5 + (((tickAnim - 0) / 5) * (-90-(-87.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = -90 + (((tickAnim - 5) / 5) * (-12.5-(-90)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
            yy = -12.5 + (((tickAnim - 10) / 5) * (20-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 5) * (-32.5-(20)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -32.5 + (((tickAnim - 20) / 5) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-13.89476-(0)));
            yy = -32.5 + (((tickAnim - 25) / 5) * (-42.80468-(-32.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (-14.11351-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -13.89476 + (((tickAnim - 30) / 5) * (0.92225-(-13.89476)));
            yy = -42.80468 + (((tickAnim - 30) / 5) * (-75.03205-(-42.80468)));
            zz = -14.11351 + (((tickAnim - 30) / 5) * (0.15503-(-14.11351)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.92225 + (((tickAnim - 35) / 5) * (5-(0.92225)));
            yy = -75.03205 + (((tickAnim - 35) / 5) * (-87.5-(-75.03205)));
            zz = 0.15503 + (((tickAnim - 35) / 5) * (0-(0.15503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.55275 + (((tickAnim - 0) / 5) * (-11.55275-(-11.55275)));
            yy = 69.41279 + (((tickAnim - 0) / 5) * (64.41279-(69.41279)));
            zz = 9.19372 + (((tickAnim - 0) / 5) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.55275 + (((tickAnim - 5) / 5) * (-29.05275-(-11.55275)));
            yy = 64.41279 + (((tickAnim - 5) / 5) * (26.91279-(64.41279)));
            zz = 9.19372 + (((tickAnim - 5) / 5) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -29.05275 + (((tickAnim - 10) / 5) * (-93.67336-(-29.05275)));
            yy = 26.91279 + (((tickAnim - 10) / 5) * (77.84516-(26.91279)));
            zz = 9.19372 + (((tickAnim - 10) / 5) * (89.18181-(9.19372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -93.67336 + (((tickAnim - 15) / 5) * (-21.58948-(-93.67336)));
            yy = 77.84516 + (((tickAnim - 15) / 5) * (15.96195-(77.84516)));
            zz = 89.18181 + (((tickAnim - 15) / 5) * (20.80651-(89.18181)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -21.58948 + (((tickAnim - 20) / 5) * (-21.58948-(-21.58948)));
            yy = 15.96195 + (((tickAnim - 20) / 5) * (15.96195-(15.96195)));
            zz = 20.80651 + (((tickAnim - 20) / 5) * (20.80651-(20.80651)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -21.58948 + (((tickAnim - 25) / 5) * (-16.55275-(-21.58948)));
            yy = 15.96195 + (((tickAnim - 25) / 5) * (51.91279-(15.96195)));
            zz = 20.80651 + (((tickAnim - 25) / 5) * (11.69372-(20.80651)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -16.55275 + (((tickAnim - 30) / 5) * (-11.55275-(-16.55275)));
            yy = 51.91279 + (((tickAnim - 30) / 5) * (94.41279-(51.91279)));
            zz = 11.69372 + (((tickAnim - 30) / 5) * (9.19372-(11.69372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.55275 + (((tickAnim - 35) / 5) * (-11.55275-(-11.55275)));
            yy = 94.41279 + (((tickAnim - 35) / 5) * (69.41279-(94.41279)));
            zz = 9.19372 + (((tickAnim - 35) / 5) * (9.19372-(9.19372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.96072 + (((tickAnim - 0) / 5) * (1.7329-(-6.96072)));
            yy = -54.61005 + (((tickAnim - 0) / 5) * (-12.42612-(-54.61005)));
            zz = 6.74718 + (((tickAnim - 0) / 5) * (-0.63439-(6.74718)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.7329 + (((tickAnim - 5) / 5) * (1.95834-(1.7329)));
            yy = -12.42612 + (((tickAnim - 5) / 5) * (-39.92098-(-12.42612)));
            zz = -0.63439 + (((tickAnim - 5) / 5) * (-1.0267-(-0.63439)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.95834 + (((tickAnim - 10) / 5) * (3.24288-(1.95834)));
            yy = -39.92098 + (((tickAnim - 10) / 5) * (-62.39977-(-39.92098)));
            zz = -1.0267 + (((tickAnim - 10) / 5) * (-2.64418-(-1.0267)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 3.24288 + (((tickAnim - 15) / 3) * (-0.27568-(3.24288)));
            yy = -62.39977 + (((tickAnim - 15) / 3) * (-24.6683-(-62.39977)));
            zz = -2.64418 + (((tickAnim - 15) / 3) * (19.18533-(-2.64418)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.27568 + (((tickAnim - 18) / 2) * (0-(-0.27568)));
            yy = -24.6683 + (((tickAnim - 18) / 2) * (0-(-24.6683)));
            zz = 19.18533 + (((tickAnim - 18) / 2) * (5-(19.18533)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-0.78795-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-17.48281-(0)));
            zz = 5 + (((tickAnim - 20) / 5) * (7.62116-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -0.78795 + (((tickAnim - 25) / 2) * (-1.54904-(-0.78795)));
            yy = -17.48281 + (((tickAnim - 25) / 2) * (-27.43821-(-17.48281)));
            zz = 7.62116 + (((tickAnim - 25) / 2) * (10.24474-(7.62116)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -1.54904 + (((tickAnim - 27) / 3) * (-1.03031-(-1.54904)));
            yy = -27.43821 + (((tickAnim - 27) / 3) * (-47.41602-(-27.43821)));
            zz = 10.24474 + (((tickAnim - 27) / 3) * (-1.40438-(10.24474)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.03031 + (((tickAnim - 30) / 5) * (-5.95629-(-1.03031)));
            yy = -47.41602 + (((tickAnim - 30) / 5) * (-57.39565-(-47.41602)));
            zz = -1.40438 + (((tickAnim - 30) / 5) * (7.32524-(-1.40438)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.95629 + (((tickAnim - 35) / 5) * (-6.96072-(-5.95629)));
            yy = -57.39565 + (((tickAnim - 35) / 5) * (-54.61005-(-57.39565)));
            zz = 7.32524 + (((tickAnim - 35) / 5) * (6.74718-(7.32524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.55-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.575-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 20) / 5) * (0.475-(0.575)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0.475 + (((tickAnim - 25) / 10) * (0.175-(0.475)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 35) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-1), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*3), lowerjaw.rotateAngleY + (float) Math.toRadians(0), lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.5 + (((tickAnim - 0) / 5) * (-2.60943-(17.5)));
            yy = -70 + (((tickAnim - 0) / 5) * (-27.49763-(-70)));
            zz = -15 + (((tickAnim - 0) / 5) * (-10.01192-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.60943 + (((tickAnim - 5) / 5) * (2.31162-(-2.60943)));
            yy = -27.49763 + (((tickAnim - 5) / 5) * (-4.82577-(-27.49763)));
            zz = -10.01192 + (((tickAnim - 5) / 5) * (12.2656-(-10.01192)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2.31162 + (((tickAnim - 10) / 5) * (2.13902-(2.31162)));
            yy = -4.82577 + (((tickAnim - 10) / 5) * (10.10542-(-4.82577)));
            zz = 12.2656 + (((tickAnim - 10) / 5) * (9.16506-(12.2656)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.13902 + (((tickAnim - 15) / 5) * (6.79289-(2.13902)));
            yy = 10.10542 + (((tickAnim - 15) / 5) * (22.38822-(10.10542)));
            zz = 9.16506 + (((tickAnim - 15) / 5) * (21.10165-(9.16506)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 6.79289 + (((tickAnim - 20) / 5) * (-2.6229-(6.79289)));
            yy = 22.38822 + (((tickAnim - 20) / 5) * (25.00232-(22.38822)));
            zz = 21.10165 + (((tickAnim - 20) / 5) * (9.94087-(21.10165)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.6229 + (((tickAnim - 25) / 5) * (17.3771-(-2.6229)));
            yy = 25.00232 + (((tickAnim - 25) / 5) * (10.00232-(25.00232)));
            zz = 9.94087 + (((tickAnim - 25) / 5) * (24.94087-(9.94087)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 17.3771 + (((tickAnim - 30) / 5) * (7.3771-(17.3771)));
            yy = 10.00232 + (((tickAnim - 30) / 5) * (-14.99768-(10.00232)));
            zz = 24.94087 + (((tickAnim - 30) / 5) * (24.94087-(24.94087)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.3771 + (((tickAnim - 35) / 5) * (17.5-(7.3771)));
            yy = -14.99768 + (((tickAnim - 35) / 5) * (-70-(-14.99768)));
            zz = 24.94087 + (((tickAnim - 35) / 5) * (-15-(24.94087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 20) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 25) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 30) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 35) / 5) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.16293 + (((tickAnim - 0) / 5) * (-13.49905-(-3.16293)));
            yy = 74.28587 + (((tickAnim - 0) / 5) * (49.69195-(74.28587)));
            zz = 9.71104 + (((tickAnim - 0) / 5) * (27.63836-(9.71104)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.49905 + (((tickAnim - 5) / 5) * (7.5-(-13.49905)));
            yy = 49.69195 + (((tickAnim - 5) / 5) * (27.53834-(49.69195)));
            zz = 27.63836 + (((tickAnim - 5) / 5) * (-7.5-(27.63836)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (5-(7.5)));
            yy = 27.53834 + (((tickAnim - 10) / 5) * (27.53834-(27.53834)));
            zz = -7.5 + (((tickAnim - 10) / 5) * (-5-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (45-(5)));
            yy = 27.53834 + (((tickAnim - 15) / 5) * (32.53834-(27.53834)));
            zz = -5 + (((tickAnim - 15) / 5) * (-55-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45 + (((tickAnim - 20) / 3) * (22.5-(45)));
            yy = 32.53834 + (((tickAnim - 20) / 3) * (41.29-(32.53834)));
            zz = -55 + (((tickAnim - 20) / 3) * (-31.25-(-55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 23) / 2) * (0-(22.5)));
            yy = 41.29 + (((tickAnim - 23) / 2) * (60.03834-(41.29)));
            zz = -31.25 + (((tickAnim - 23) / 2) * (-12.5-(-31.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-22.5-(0)));
            yy = 60.03834 + (((tickAnim - 25) / 5) * (62.53834-(60.03834)));
            zz = -12.5 + (((tickAnim - 25) / 5) * (-10-(-12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -22.5 + (((tickAnim - 30) / 5) * (-22.5-(-22.5)));
            yy = 62.53834 + (((tickAnim - 30) / 5) * (35.03834-(62.53834)));
            zz = -10 + (((tickAnim - 30) / 5) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 35) / 5) * (-3.16293-(-22.5)));
            yy = 35.03834 + (((tickAnim - 35) / 5) * (74.28587-(35.03834)));
            zz = -10 + (((tickAnim - 35) / 5) * (9.71104-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.75 + (((tickAnim - 0) / 5) * (-9.10569-(1.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.153-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.28429-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.10569 + (((tickAnim - 5) / 5) * (-15.03435-(-9.10569)));
            yy = -0.153 + (((tickAnim - 5) / 5) * (-7.37384-(-0.153)));
            zz = -9.28429 + (((tickAnim - 5) / 5) * (7.6171-(-9.28429)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.03435 + (((tickAnim - 10) / 5) * (-19.03435-(-15.03435)));
            yy = -7.37384 + (((tickAnim - 10) / 5) * (-29.87384-(-7.37384)));
            zz = 7.6171 + (((tickAnim - 10) / 5) * (15.1171-(7.6171)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -19.03435 + (((tickAnim - 15) / 5) * (18.2574-(-19.03435)));
            yy = -29.87384 + (((tickAnim - 15) / 5) * (-16.95197-(-29.87384)));
            zz = 15.1171 + (((tickAnim - 15) / 5) * (-13.67284-(15.1171)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 18.2574 + (((tickAnim - 20) / 3) * (-5.53179-(18.2574)));
            yy = -16.95197 + (((tickAnim - 20) / 3) * (-6.69222-(-16.95197)));
            zz = -13.67284 + (((tickAnim - 20) / 3) * (-6.26177-(-13.67284)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -5.53179 + (((tickAnim - 23) / 2) * (-5.53179-(-5.53179)));
            yy = -6.69222 + (((tickAnim - 23) / 2) * (-6.69222-(-6.69222)));
            zz = -6.26177 + (((tickAnim - 23) / 2) * (-6.26177-(-6.26177)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -5.53179 + (((tickAnim - 25) / 5) * (-13.28435-(-5.53179)));
            yy = -6.69222 + (((tickAnim - 25) / 5) * (-14.87384-(-6.69222)));
            zz = -6.26177 + (((tickAnim - 25) / 5) * (30.1171-(-6.26177)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -13.28435 + (((tickAnim - 30) / 5) * (-13.28435-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 30) / 5) * (-14.87384-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 30) / 5) * (30.1171-(30.1171)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -13.28435 + (((tickAnim - 35) / 5) * (1.75-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 35) / 5) * (0-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 35) / 5) * (0-(30.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 5) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 10) / 5) * (0.25-(0.175)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 15) / 5) * (0-(0.25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0.275-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.1229 + (((tickAnim - 0) / 5) * (-2.6229-(-16.1229)));
            yy = -22.50232 + (((tickAnim - 0) / 5) * (-25.00232-(-22.50232)));
            zz = -9.94087 + (((tickAnim - 0) / 5) * (-9.94087-(-9.94087)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.6229 + (((tickAnim - 5) / 5) * (17.3771-(-2.6229)));
            yy = -25.00232 + (((tickAnim - 5) / 5) * (-10.00232-(-25.00232)));
            zz = -9.94087 + (((tickAnim - 5) / 5) * (-24.94087-(-9.94087)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.3771 + (((tickAnim - 10) / 5) * (7.3771-(17.3771)));
            yy = -10.00232 + (((tickAnim - 10) / 5) * (14.99768-(-10.00232)));
            zz = -24.94087 + (((tickAnim - 10) / 5) * (-24.94087-(-24.94087)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.3771 + (((tickAnim - 15) / 5) * (17.5-(7.3771)));
            yy = 14.99768 + (((tickAnim - 15) / 5) * (70-(14.99768)));
            zz = -24.94087 + (((tickAnim - 15) / 5) * (15-(-24.94087)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 20) / 5) * (-1.31553-(17.5)));
            yy = 70 + (((tickAnim - 20) / 5) * (27.00546-(70)));
            zz = 15 + (((tickAnim - 20) / 5) * (0.437-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -1.31553 + (((tickAnim - 25) / 5) * (-15.1229-(-1.31553)));
            yy = 27.00546 + (((tickAnim - 25) / 5) * (4.99768-(27.00546)));
            zz = 0.437 + (((tickAnim - 25) / 5) * (-2.44087-(0.437)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.1229 + (((tickAnim - 30) / 5) * (-9.6229-(-15.1229)));
            yy = 4.99768 + (((tickAnim - 30) / 5) * (-10.00232-(4.99768)));
            zz = -2.44087 + (((tickAnim - 30) / 5) * (-2.44087-(-2.44087)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -9.6229 + (((tickAnim - 35) / 5) * (-16.1229-(-9.6229)));
            yy = -10.00232 + (((tickAnim - 35) / 5) * (-22.50232-(-10.00232)));
            zz = -2.44087 + (((tickAnim - 35) / 5) * (-9.94087-(-2.44087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm4, leftarm4.rotateAngleX + (float) Math.toRadians(xx), leftarm4.rotateAngleY + (float) Math.toRadians(yy), leftarm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 5) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 10) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 5) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 35) / 5) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm4.rotationPointX = this.leftarm4.rotationPointX + (float)(xx);
        this.leftarm4.rotationPointY = this.leftarm4.rotationPointY - (float)(yy);
        this.leftarm4.rotationPointZ = this.leftarm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 0) / 3) * (22.5-(45)));
            yy = -32.53834 + (((tickAnim - 0) / 3) * (-41.29-(-32.53834)));
            zz = 55 + (((tickAnim - 0) / 3) * (31.25-(55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.5 + (((tickAnim - 3) / 2) * (0-(22.5)));
            yy = -41.29 + (((tickAnim - 3) / 2) * (-60.03834-(-41.29)));
            zz = 31.25 + (((tickAnim - 3) / 2) * (12.5-(31.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-22.5-(0)));
            yy = -60.03834 + (((tickAnim - 5) / 5) * (-62.53834-(-60.03834)));
            zz = 12.5 + (((tickAnim - 5) / 5) * (10-(12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (-22.5-(-22.5)));
            yy = -62.53834 + (((tickAnim - 10) / 5) * (-35.03834-(-62.53834)));
            zz = 10 + (((tickAnim - 10) / 5) * (10-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 15) / 5) * (-3.16293-(-22.5)));
            yy = -35.03834 + (((tickAnim - 15) / 5) * (-74.28587-(-35.03834)));
            zz = 10 + (((tickAnim - 15) / 5) * (-9.71104-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.16293 + (((tickAnim - 20) / 5) * (-3.34402-(-3.16293)));
            yy = -74.28587 + (((tickAnim - 20) / 5) * (-46.37968-(-74.28587)));
            zz = -9.71104 + (((tickAnim - 20) / 5) * (-3.42928-(-9.71104)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.34402 + (((tickAnim - 25) / 5) * (7.5-(-3.34402)));
            yy = -46.37968 + (((tickAnim - 25) / 5) * (-27.53834-(-46.37968)));
            zz = -3.42928 + (((tickAnim - 25) / 5) * (7.5-(-3.42928)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 30) / 5) * (5-(7.5)));
            yy = -27.53834 + (((tickAnim - 30) / 5) * (-27.53834-(-27.53834)));
            zz = 7.5 + (((tickAnim - 30) / 5) * (5-(7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 35) / 5) * (45-(5)));
            yy = -27.53834 + (((tickAnim - 35) / 5) * (-32.53834-(-27.53834)));
            zz = 5 + (((tickAnim - 35) / 5) * (55-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.49041 + (((tickAnim - 0) / 3) * (2.88012-(25.49041)));
            yy = 9.30677 + (((tickAnim - 0) / 3) * (1.17698-(9.30677)));
            zz = 27.46617 + (((tickAnim - 0) / 3) * (20.98546-(27.46617)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.88012 + (((tickAnim - 3) / 2) * (-0.21779-(2.88012)));
            yy = 1.17698 + (((tickAnim - 3) / 2) * (2.4066-(1.17698)));
            zz = 20.98546 + (((tickAnim - 3) / 2) * (14.11961-(20.98546)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.21779 + (((tickAnim - 5) / 5) * (-13.28435-(-0.21779)));
            yy = 2.4066 + (((tickAnim - 5) / 5) * (14.87384-(2.4066)));
            zz = 14.11961 + (((tickAnim - 5) / 5) * (-30.1171-(14.11961)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.28435 + (((tickAnim - 10) / 5) * (-13.28435-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 10) / 5) * (14.87384-(14.87384)));
            zz = -30.1171 + (((tickAnim - 10) / 5) * (-30.1171-(-30.1171)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.28435 + (((tickAnim - 15) / 5) * (1.75-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 15) / 5) * (0-(14.87384)));
            zz = -30.1171 + (((tickAnim - 15) / 5) * (0-(-30.1171)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1.75 + (((tickAnim - 20) / 5) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.75 + (((tickAnim - 25) / 5) * (-2.27897-(1.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (-7.14981-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (25.50667-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.27897 + (((tickAnim - 30) / 5) * (-5.33624-(-2.27897)));
            yy = -7.14981 + (((tickAnim - 30) / 5) * (-6.14954-(-7.14981)));
            zz = 25.50667 + (((tickAnim - 30) / 5) * (15.81694-(25.50667)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.33624 + (((tickAnim - 35) / 5) * (25.49041-(-5.33624)));
            yy = -6.14954 + (((tickAnim - 35) / 5) * (9.30677-(-6.14954)));
            zz = 15.81694 + (((tickAnim - 35) / 5) * (27.46617-(15.81694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 20) / 5) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 25) / 5) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 30) / 5) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 35) / 5) * (0-(0.275)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm6.rotationPointX = this.leftarm6.rotationPointX + (float)(xx);
        this.leftarm6.rotationPointY = this.leftarm6.rotationPointY - (float)(yy);
        this.leftarm6.rotationPointZ = this.leftarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.79151-(0)));
            yy = 10 + (((tickAnim - 0) / 5) * (-15.53573-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.47366-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.79151 + (((tickAnim - 5) / 5) * (3.36162-(-4.79151)));
            yy = -15.53573 + (((tickAnim - 5) / 5) * (-37.87424-(-15.53573)));
            zz = -5.47366 + (((tickAnim - 5) / 5) * (-5.18783-(-5.47366)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.36162 + (((tickAnim - 10) / 2) * (3.88632-(3.36162)));
            yy = -37.87424 + (((tickAnim - 10) / 2) * (-50.3195-(-37.87424)));
            zz = -5.18783 + (((tickAnim - 10) / 2) * (-7.9408-(-5.18783)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.88632 + (((tickAnim - 12) / 3) * (3.55593-(3.88632)));
            yy = -50.3195 + (((tickAnim - 12) / 3) * (-82.8694-(-50.3195)));
            zz = -7.9408 + (((tickAnim - 12) / 3) * (-5.8311-(-7.9408)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.55593 + (((tickAnim - 15) / 5) * (4.11883-(3.55593)));
            yy = -82.8694 + (((tickAnim - 15) / 5) * (-115.3637-(-82.8694)));
            zz = -5.8311 + (((tickAnim - 15) / 5) * (-4.09069-(-5.8311)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.11883 + (((tickAnim - 20) / 5) * (4.38789-(4.11883)));
            yy = -115.3637 + (((tickAnim - 20) / 5) * (-102.86137-(-115.3637)));
            zz = -4.09069 + (((tickAnim - 20) / 5) * (-4.39996-(-4.09069)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.38789 + (((tickAnim - 25) / 5) * (5.78673-(4.38789)));
            yy = -102.86137 + (((tickAnim - 25) / 5) * (-72.21784-(-102.86137)));
            zz = -4.39996 + (((tickAnim - 25) / 5) * (-16.80273-(-4.39996)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 5.78673 + (((tickAnim - 30) / 5) * (-2.01352-(5.78673)));
            yy = -72.21784 + (((tickAnim - 30) / 5) * (-3.84373-(-72.21784)));
            zz = -16.80273 + (((tickAnim - 30) / 5) * (-22.08714-(-16.80273)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.01352 + (((tickAnim - 35) / 5) * (0-(-2.01352)));
            yy = -3.84373 + (((tickAnim - 35) / 5) * (10-(-3.84373)));
            zz = -22.08714 + (((tickAnim - 35) / 5) * (0-(-22.08714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-13.89476-(0)));
            yy = 32.5 + (((tickAnim - 5) / 5) * (42.80468-(32.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (14.11351-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.89476 + (((tickAnim - 10) / 5) * (-2.28888-(-13.89476)));
            yy = 42.80468 + (((tickAnim - 10) / 5) * (75.04995-(42.80468)));
            zz = 14.11351 + (((tickAnim - 10) / 5) * (3.38905-(14.11351)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.28888 + (((tickAnim - 15) / 5) * (5-(-2.28888)));
            yy = 75.04995 + (((tickAnim - 15) / 5) * (87.5-(75.04995)));
            zz = 3.38905 + (((tickAnim - 15) / 5) * (0-(3.38905)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 20) / 5) * (0-(5)));
            yy = 87.5 + (((tickAnim - 20) / 5) * (90-(87.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-5-(0)));
            yy = 90 + (((tickAnim - 25) / 5) * (12.5-(90)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (0-(-5)));
            yy = 12.5 + (((tickAnim - 30) / 5) * (-20-(12.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -20 + (((tickAnim - 35) / 5) * (32.5-(-20)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -21.58948 + (((tickAnim - 0) / 5) * (-21.58948-(-21.58948)));
            yy = -15.96195 + (((tickAnim - 0) / 5) * (-15.96195-(-15.96195)));
            zz = -20.80651 + (((tickAnim - 0) / 5) * (-20.80651-(-20.80651)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.58948 + (((tickAnim - 5) / 5) * (-16.55275-(-21.58948)));
            yy = -15.96195 + (((tickAnim - 5) / 5) * (-51.91279-(-15.96195)));
            zz = -20.80651 + (((tickAnim - 5) / 5) * (-11.69372-(-20.80651)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.55275 + (((tickAnim - 10) / 5) * (-11.55275-(-16.55275)));
            yy = -51.91279 + (((tickAnim - 10) / 5) * (-94.41279-(-51.91279)));
            zz = -11.69372 + (((tickAnim - 10) / 5) * (-9.19372-(-11.69372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.55275 + (((tickAnim - 15) / 5) * (-11.55275-(-11.55275)));
            yy = -94.41279 + (((tickAnim - 15) / 5) * (-69.41279-(-94.41279)));
            zz = -9.19372 + (((tickAnim - 15) / 5) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.55275 + (((tickAnim - 20) / 5) * (-11.55275-(-11.55275)));
            yy = -69.41279 + (((tickAnim - 20) / 5) * (-64.41279-(-69.41279)));
            zz = -9.19372 + (((tickAnim - 20) / 5) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.55275 + (((tickAnim - 25) / 5) * (-29.05275-(-11.55275)));
            yy = -64.41279 + (((tickAnim - 25) / 5) * (-26.91279-(-64.41279)));
            zz = -9.19372 + (((tickAnim - 25) / 5) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -29.05275 + (((tickAnim - 30) / 5) * (111.59527-(-29.05275)));
            yy = -26.91279 + (((tickAnim - 30) / 5) * (-62.6741-(-26.91279)));
            zz = -9.19372 + (((tickAnim - 30) / 5) * (65.1293-(-9.19372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 111.59527 + (((tickAnim - 35) / 5) * (-21.58948-(111.59527)));
            yy = -62.6741 + (((tickAnim - 35) / 5) * (-15.96195-(-62.6741)));
            zz = 65.1293 + (((tickAnim - 35) / 5) * (-20.80651-(65.1293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.15619-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (17.81549-(0)));
            zz = -10 + (((tickAnim - 0) / 5) * (-16.14657-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.15619 + (((tickAnim - 5) / 2) * (-1.54904-(0.15619)));
            yy = 17.81549 + (((tickAnim - 5) / 2) * (27.43821-(17.81549)));
            zz = -16.14657 + (((tickAnim - 5) / 2) * (-10.24474-(-16.14657)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.54904 + (((tickAnim - 7) / 3) * (4.71969-(-1.54904)));
            yy = 27.43821 + (((tickAnim - 7) / 3) * (47.41602-(27.43821)));
            zz = -10.24474 + (((tickAnim - 7) / 3) * (1.40438-(-10.24474)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.71969 + (((tickAnim - 10) / 5) * (2.78873-(4.71969)));
            yy = 47.41602 + (((tickAnim - 10) / 5) * (57.40665-(47.41602)));
            zz = 1.40438 + (((tickAnim - 10) / 5) * (2.11976-(1.40438)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.78873 + (((tickAnim - 15) / 5) * (-6.96072-(2.78873)));
            yy = 57.40665 + (((tickAnim - 15) / 5) * (54.61005-(57.40665)));
            zz = 2.11976 + (((tickAnim - 15) / 5) * (-6.74718-(2.11976)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -6.96072 + (((tickAnim - 20) / 5) * (1.7329-(-6.96072)));
            yy = 54.61005 + (((tickAnim - 20) / 5) * (12.42612-(54.61005)));
            zz = -6.74718 + (((tickAnim - 20) / 5) * (0.63439-(-6.74718)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.7329 + (((tickAnim - 25) / 5) * (1.95834-(1.7329)));
            yy = 12.42612 + (((tickAnim - 25) / 5) * (39.92098-(12.42612)));
            zz = 0.63439 + (((tickAnim - 25) / 5) * (1.0267-(0.63439)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.95834 + (((tickAnim - 30) / 5) * (-48.47651-(1.95834)));
            yy = 39.92098 + (((tickAnim - 30) / 5) * (47.0898-(39.92098)));
            zz = 1.0267 + (((tickAnim - 30) / 5) * (-30.88696-(1.0267)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -48.47651 + (((tickAnim - 35) / 5) * (0-(-48.47651)));
            yy = 47.0898 + (((tickAnim - 35) / 5) * (0-(47.0898)));
            zz = -30.88696 + (((tickAnim - 35) / 5) * (-10-(-30.88696)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(0);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(0.45);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(0);
        
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(-5.7897+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), rightleg.rotateAngleY + (float) Math.toRadians(48.5313+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*50), rightleg.rotateAngleZ + (float) Math.toRadians(-3.0893+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-10));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*70), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*30), rightleg3.rotateAngleY + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*50), rightleg3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10));

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0.65 + (((tickAnim - 0) / 13) * (-0.225-(0.65)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.55 + (((tickAnim - 13) / 10) * (0.48-(-0.55)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = -0.225 + (((tickAnim - 13) / 10) * (0.145-(-0.225)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.48 + (((tickAnim - 23) / 10) * (-0.55-(0.48)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0.145 + (((tickAnim - 23) / 10) * (-0.225-(0.145)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.55 + (((tickAnim - 33) / 7) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = -0.225 + (((tickAnim - 33) / 7) * (0.65-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(43.25), rightleg4.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*30), rightleg4.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-40));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-4);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), lowerjaw.rotateAngleY + (float) Math.toRadians(0), lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(87.19171), rightarm.rotateAngleY + (float) Math.toRadians(13.6814+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*5), rightarm.rotateAngleZ + (float) Math.toRadians(10.5964+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*5));
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(-0.5);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(0.5);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(5), rightarm2.rotateAngleY + (float) Math.toRadians(65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), rightarm2.rotateAngleZ + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*5));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(-10), rightarm3.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5), rightarm3.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5));


        this.setRotateAngle(Belly, Belly.rotateAngleX + (float) Math.toRadians(0), Belly.rotateAngleY + (float) Math.toRadians(0), Belly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3));
        this.Belly.rotationPointX = this.Belly.rotationPointX + (float)(0);
        this.Belly.rotationPointY = this.Belly.rotationPointY - (float)(0);
        this.Belly.rotationPointZ = this.Belly.rotationPointZ + (float)(-0.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.1);


        this.setRotateAngle(leftarm4, leftarm4.rotateAngleX + (float) Math.toRadians(88.89872), leftarm4.rotateAngleY + (float) Math.toRadians(-17.9509+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*5), leftarm4.rotateAngleZ + (float) Math.toRadians(-12.2008+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-5));
        this.leftarm4.rotationPointX = this.leftarm4.rotationPointX + (float)(0.5);
        this.leftarm4.rotationPointY = this.leftarm4.rotationPointY - (float)(0.5);
        this.leftarm4.rotationPointZ = this.leftarm4.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(5), leftarm5.rotateAngleY + (float) Math.toRadians(-65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), leftarm5.rotateAngleZ + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*5));


        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(-10), leftarm6.rotateAngleY + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5), leftarm6.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(-5.7897+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), leftleg.rotateAngleY + (float) Math.toRadians(-48.5313+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-50), leftleg.rotateAngleZ + (float) Math.toRadians(3.0893+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-70), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*30), leftleg3.rotateAngleY + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*-50), leftleg3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10));

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0.65 + (((tickAnim - 0) / 13) * (-0.225-(0.65)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.55 + (((tickAnim - 13) / 10) * (0.48-(-0.55)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = -0.225 + (((tickAnim - 13) / 10) * (0.145-(-0.225)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.48 + (((tickAnim - 23) / 10) * (-0.55-(0.48)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0.145 + (((tickAnim - 23) / 10) * (-0.225-(0.145)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.55 + (((tickAnim - 33) / 7) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = -0.225 + (((tickAnim - 33) / 7) * (0.65-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(43.25), leftleg4.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-30), leftleg4.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*40));
    
    
    }
    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (0.8921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (-20.7765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.13719-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.8921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20 + (((tickAnim - 5) / 5) * (12.42066-(0.8921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20)));
            yy = -20.7765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100 + (((tickAnim - 5) / 5) * (80.2564-(-20.7765+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100)));
            zz = 3.13719 + (((tickAnim - 5) / 5) * (-9.38864-(3.13719)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 12.42066 + (((tickAnim - 10) / 8) * (0-(12.42066)));
            yy = 80.2564 + (((tickAnim - 10) / 8) * (0-(80.2564)));
            zz = -9.38864 + (((tickAnim - 10) / 8) * (0-(-9.38864)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80 + (((tickAnim - 5) / 5) * (-80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -80 + (((tickAnim - 10) / 8) * (0-(-80)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120 + (((tickAnim - 5) / 5) * (120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 120 + (((tickAnim - 10) / 8) * (0-(120)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.225 + (((tickAnim - 5) / 5) * (0.225-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 10) / 8) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.87885 + (((tickAnim - 0) / 5) * (-29.88531-(-0.87885)));
            yy = -0.8139+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-19.8749-(-0.8139+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = -0.61051 + (((tickAnim - 0) / 5) * (33.58405-(-0.61051)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -29.88531 + (((tickAnim - 5) / 5) * (0-(-29.88531)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-19.8749 + (((tickAnim - 5) / 5) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-19.8749)));
            zz = 33.58405 + (((tickAnim - 5) / 5) * (0-(33.58405)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 8) * (0-(-20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 1) * (-1.11-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -1.11 + (((tickAnim - 1) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30-(-1.11)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30 + (((tickAnim - 5) / 5) * (-3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20 + (((tickAnim - 10) / 5) * (57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35-(-3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35 + (((tickAnim - 15) / 3) * (0-(57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 1) / 2) * (0.485-(0.475)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 3) / 2) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10-(0.485)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10 + (((tickAnim - 5) / 5) * (9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20 + (((tickAnim - 10) / 5) * (5.07-(9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 5.07 + (((tickAnim - 15) / 3) * (0-(5.07)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 5) / 5) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 10) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40 + (((tickAnim - 5) / 5) * (40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (2.06864-(10)));
            yy = 40 + (((tickAnim - 10) / 5) * (-36.49981-(40)));
            zz = 10 + (((tickAnim - 10) / 5) * (1.2821-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.06864 + (((tickAnim - 15) / 3) * (0-(2.06864)));
            yy = -36.49981 + (((tickAnim - 15) / 3) * (0-(-36.49981)));
            zz = 1.2821 + (((tickAnim - 15) / 3) * (0-(1.2821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100 + (((tickAnim - 5) / 5) * (100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 100 + (((tickAnim - 10) / 8) * (0-(100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30 + (((tickAnim - 5) / 5) * (30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 30 + (((tickAnim - 10) / 8) * (0-(30)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40 + (((tickAnim - 5) / 5) * (-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10 + (((tickAnim - 5) / 5) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (2.06864-(10)));
            yy = -40 + (((tickAnim - 10) / 5) * (36.49981-(-40)));
            zz = -10 + (((tickAnim - 10) / 5) * (1.2821-(-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.06864 + (((tickAnim - 15) / 3) * (0-(2.06864)));
            yy = 36.49981 + (((tickAnim - 15) / 3) * (0-(36.49981)));
            zz = 1.2821 + (((tickAnim - 15) / 3) * (0-(1.2821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm4, leftarm4.rotateAngleX + (float) Math.toRadians(xx), leftarm4.rotateAngleY + (float) Math.toRadians(yy), leftarm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100 + (((tickAnim - 5) / 5) * (-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -100 + (((tickAnim - 10) / 8) * (0-(-100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30 + (((tickAnim - 5) / 5) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -30 + (((tickAnim - 10) / 8) * (0-(-30)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (0.72+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-72.8271-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.68107-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.72+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20 + (((tickAnim - 5) / 5) * (13.123-(0.72+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-72.8271 + (((tickAnim - 5) / 5) * (-83.42609-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-72.8271)));
            zz = -3.68107 + (((tickAnim - 5) / 5) * (8.38417-(-3.68107)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 13.123 + (((tickAnim - 10) / 8) * (0-(13.123)));
            yy = -83.42609 + (((tickAnim - 10) / 8) * (0-(-83.42609)));
            zz = 8.38417 + (((tickAnim - 10) / 8) * (0-(8.38417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80 + (((tickAnim - 5) / 5) * (80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 80 + (((tickAnim - 10) / 8) * (0-(80)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120 + (((tickAnim - 5) / 5) * (-120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -120 + (((tickAnim - 10) / 8) * (0-(-120)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 5) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0.2 + (((tickAnim - 10) / 8) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.81745 + (((tickAnim - 0) / 5) * (-25.78719-(-0.81745)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-49.0153 + (((tickAnim - 0) / 5) * (0.3829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-49.0153)));
            zz = -1.58837 + (((tickAnim - 0) / 5) * (-28.93824-(-1.58837)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.78719 + (((tickAnim - 5) / 5) * (0-(-25.78719)));
            yy = 0.3829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20 + (((tickAnim - 5) / 5) * (20-(0.3829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20)));
            zz = -28.93824 + (((tickAnim - 5) / 5) * (0-(-28.93824)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 8) * (0-(20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0.275 + (((tickAnim - 8) / 6) * (0-(0.275)));
            yy = -0.475 + (((tickAnim - 8) / 6) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righteye.rotationPointX = this.righteye.rotationPointX + (float)(xx);
        this.righteye.rotationPointY = this.righteye.rotationPointY - (float)(yy);
        this.righteye.rotationPointZ = this.righteye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 8) / 6) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 8) / 6) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 8) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -0.275 + (((tickAnim - 8) / 6) * (0-(-0.275)));
            yy = -0.475 + (((tickAnim - 8) / 6) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefteye.rotationPointX = this.lefteye.rotationPointX + (float)(xx);
        this.lefteye.rotationPointY = this.lefteye.rotationPointY - (float)(yy);
        this.lefteye.rotationPointZ = this.lefteye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 8) / 6) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 8) / 6) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 8) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animTongue(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 5) / 7) * (10-(10)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 12) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 5) / 5) * (40-(40)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40 + (((tickAnim - 10) / 5) * (0-(40)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.5 + (((tickAnim - 8) / 4) * (-20-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 12) / 3) * (0-(-20)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 4) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 3) * (0.5-(1)));
            zz = 1 + (((tickAnim - 5) / 3) * (3-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (1-(1)));
            yy = 0.5 + (((tickAnim - 8) / 4) * (1-(0.5)));
            zz = 3 + (((tickAnim - 8) / 4) * (1-(3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tongue.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 5) / 5) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animCroak(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKururubatrachus entity = (EntityPrehistoricFloraKururubatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 10) / 10) * (0-(-11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1.2625-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.2 + (((tickAnim - 10) / 10) * (1-(1.2)));
            yy = 1.2625 + (((tickAnim - 10) / 10) * (1-(1.2625)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 10) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Belly.rotationPointX = this.Belly.rotationPointX + (float)(xx);
        this.Belly.rotationPointY = this.Belly.rotationPointY - (float)(yy);
        this.Belly.rotationPointZ = this.Belly.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            yy = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            zz = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Belly.setScale((float)xx, (float)yy, (float)zz);
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKururubatrachus e = (EntityPrehistoricFloraKururubatrachus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
    }
}
