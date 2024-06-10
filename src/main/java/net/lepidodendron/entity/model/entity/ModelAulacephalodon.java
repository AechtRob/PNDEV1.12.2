package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAulacephalodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAulacephalodon extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended aulacephalodon;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended leftfrontleg;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended leftfrontleg2;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended leftfrontleg3;
    private final AdvancedModelRendererExtended rightfrontleg4;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended rightfrontleg5;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended rightfrontleg6;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended leftBackLeg4;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended leftBackLeg5;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended leftBackLeg6;
    private final AdvancedModelRendererExtended rightBackLeg2;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended rightBackLeg3;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended rightBackLeg7;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;

    private ModelAnimator animator;

    public ModelAulacephalodon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.aulacephalodon = new AdvancedModelRendererExtended(this);
        this.aulacephalodon.setRotationPoint(0.5F, 26.0F, 0.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.aulacephalodon.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.5F, -19.0F, -5.0F, 12, 13, 16, 0.0F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, -12.75F, -5.0F);
        this.body.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 47, -5.5F, -6.0F, -6.0F, 10, 12, 7, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.5F, -2.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 30, -4.0F, -3.25F, -4.0F, 8, 8, 9, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -4.75F, -4.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 41, 1, -5.0F, -0.7614F, -5.5115F, 9, 5, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 20, -4.5F, 3.4886F, -4.0115F, 8, 3, 5, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 0, 3.0F, 0.7386F, -5.5115F, 1, 1, 1, 0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 10, 0, -5.0F, 0.7386F, -5.5115F, 1, 1, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.5F, 3.0576F, -8.4177F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -2.0F, -1.5F, -1.5F, 4, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-0.5F, 1.6697F, -8.4351F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 48, -2.0F, -1.25F, -1.0F, 4, 2, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.9886F, -5.7615F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.5F, 2.0F, -2.25F, 1, 2, 1, -0.02F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 1.5F, 2.0F, -2.25F, 1, 2, 1, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 0, -3.0F, 1.75F, -2.25F, 6, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 59, -3.0F, -1.75F, -2.25F, 6, 4, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.0114F, -5.0115F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 48, -2.5F, 0.0F, -2.5F, 5, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-4.0F, 2.2038F, -3.981F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1355F, -0.2595F, -0.035F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 88, 17, -0.5F, -2.1958F, -3.9872F, 1, 4, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(3.0F, 2.2038F, -3.981F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1355F, 0.2595F, 0.035F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 88, 17, -0.5F, -2.1958F, -3.9872F, 1, 4, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.5114F, 0.4885F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 85, 9, -3.5F, -0.0434F, -5.9962F, 7, 1, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(-0.5F, 4.7654F, -3.0263F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.8758F, -1.7499F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 29, -2.5F, -3.5F, 0.0F, 5, 3, 4, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -2.0F, -1.0F, -2.0F, 4, 2, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.8758F, -1.7499F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 11, -3.0F, -1.0F, -1.25F, 6, 2, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9926F, -3.41F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 68, -1.5F, -1.0F, -3.0F, 3, 2, 3, -0.01F, false));

        this.leftfrontleg = new AdvancedModelRendererExtended(this);
        this.leftfrontleg.setRotationPoint(2.5F, 4.0F, -3.0F);
        this.upperbody.addChild(leftfrontleg);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.1702F, -0.5763F, 0.0F);
        this.leftfrontleg.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.054F, -0.3892F, 0.5779F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 64, -0.4054F, -1.988F, -2.4437F, 6, 3, 5, 0.01F, false));

        this.leftfrontleg2 = new AdvancedModelRendererExtended(this);
        this.leftfrontleg2.setRotationPoint(3.6379F, 1.7977F, 2.0F);
        this.leftfrontleg.addChild(leftfrontleg2);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.8621F, 1.9523F, -1.0F);
        this.leftfrontleg2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, -0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 66, -1.75F, -2.75F, -1.5F, 3, 5, 4, 0.0F, false));

        this.leftfrontleg3 = new AdvancedModelRendererExtended(this);
        this.leftfrontleg3.setRotationPoint(0.8621F, 3.9523F, -1.0F);
        this.leftfrontleg2.addChild(leftfrontleg3);
        this.leftfrontleg3.cubeList.add(new ModelBox(leftfrontleg3, 62, 28, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.rightfrontleg4 = new AdvancedModelRendererExtended(this);
        this.rightfrontleg4.setRotationPoint(-3.5F, 4.0F, -3.0F);
        this.upperbody.addChild(rightfrontleg4);


        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-0.1702F, -0.5763F, 0.0F);
        this.rightfrontleg4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.054F, 0.3892F, -0.5779F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 51, 64, -5.5946F, -1.988F, -2.4437F, 6, 3, 5, 0.01F, true));

        this.rightfrontleg5 = new AdvancedModelRendererExtended(this);
        this.rightfrontleg5.setRotationPoint(-3.6379F, 1.7977F, 2.0F);
        this.rightfrontleg4.addChild(rightfrontleg5);


        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-0.8621F, 1.9523F, -1.0F);
        this.rightfrontleg5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 66, -1.25F, -2.75F, -1.5F, 3, 5, 4, 0.0F, true));

        this.rightfrontleg6 = new AdvancedModelRendererExtended(this);
        this.rightfrontleg6.setRotationPoint(-0.8621F, 3.9523F, -1.0F);
        this.rightfrontleg5.addChild(rightfrontleg6);
        this.rightfrontleg6.cubeList.add(new ModelBox(rightfrontleg6, 62, 28, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(-0.5F, -12.5F, 12.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 36, 29, -4.5F, -5.5F, -2.0F, 9, 11, 8, 0.0F, false));

        this.leftBackLeg4 = new AdvancedModelRendererExtended(this);
        this.leftBackLeg4.setRotationPoint(3.75F, 2.75F, 2.5F);
        this.body2.addChild(leftBackLeg4);


        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.9074F, -0.3366F, -0.5F);
        this.leftBackLeg4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.4363F, 0.9163F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 11, -2.5F, -2.25F, -2.5F, 7, 4, 5, 0.01F, false));

        this.leftBackLeg5 = new AdvancedModelRendererExtended(this);
        this.leftBackLeg5.setRotationPoint(2.5F, 1.25F, -1.5F);
        this.leftBackLeg4.addChild(leftBackLeg5);


        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.25F, 3.0F, 0.25F);
        this.leftBackLeg5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.0F, -3.0F, -2.0F, 3, 6, 4, 0.01F, false));

        this.leftBackLeg6 = new AdvancedModelRendererExtended(this);
        this.leftBackLeg6.setRotationPoint(0.583F, 5.449F, 0.25F);
        this.leftBackLeg5.addChild(leftBackLeg6);
        this.leftBackLeg6.cubeList.add(new ModelBox(leftBackLeg6, 34, 48, -2.083F, 0.051F, -5.5F, 5, 2, 8, 0.01F, false));

        this.rightBackLeg2 = new AdvancedModelRendererExtended(this);
        this.rightBackLeg2.setRotationPoint(-3.75F, 2.75F, 2.5F);
        this.body2.addChild(rightBackLeg2);


        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(-0.9074F, -0.3366F, -0.5F);
        this.rightBackLeg2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.4363F, -0.9163F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 11, -4.5F, -2.25F, -2.5F, 7, 4, 5, 0.01F, true));

        this.rightBackLeg3 = new AdvancedModelRendererExtended(this);
        this.rightBackLeg3.setRotationPoint(-2.5F, 1.25F, -1.5F);
        this.rightBackLeg2.addChild(rightBackLeg3);


        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-0.25F, 3.0F, 0.25F);
        this.rightBackLeg3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -2.0F, -3.0F, -2.0F, 3, 6, 4, 0.01F, true));

        this.rightBackLeg7 = new AdvancedModelRendererExtended(this);
        this.rightBackLeg7.setRotationPoint(-0.583F, 5.449F, 0.25F);
        this.rightBackLeg3.addChild(rightBackLeg7);
        this.rightBackLeg7.cubeList.add(new ModelBox(rightBackLeg7, 34, 48, -2.917F, 0.051F, -5.5F, 5, 2, 8, 0.01F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.5F, -1.4884F, 5.8443F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 54, 52, -3.0F, -2.698F, -1.2134F, 5, 6, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.052F, 4.7866F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 66, -1.5F, -1.9239F, -1.8827F, 2, 3, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.aulacephalodon.render(f5 * 0.42f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.aulacephalodon.offsetZ = -0.6F;
        this.aulacephalodon.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.aulacephalodon.offsetY = 0.875F;

        EntityPrehistoricFloraAulacephalodon Aulacephalodon = (EntityPrehistoricFloraAulacephalodon) e;
        float masterSpeed = Aulacephalodon.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2};

        // || (Aulacephalodon.moveStrafing == 0 && Aulacephalodon.moveVertical == 0 && Aulacephalodon.moveForward == 0)

        if (Aulacephalodon.getAnimation() == Aulacephalodon.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Aulacephalodon.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Aulacephalodon.getIsFast()) {
            speed = speed * 2;
        }

        this.leftfrontleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 1, f2, 1.5F);;
        this.rightfrontleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 4, f2, 1.5F);;
        this.leftBackLeg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 4, f2, 1.5F);;
        this.rightBackLeg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 1, f2, 1.5F);;

        this.flap(leftfrontleg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(rightfrontleg4, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(leftBackLeg4, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(rightBackLeg2, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftfrontleg, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(rightfrontleg4, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(leftBackLeg4, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(rightBackLeg2, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(leftfrontleg2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(rightfrontleg5, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leftBackLeg5, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(rightBackLeg3, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(leftfrontleg2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(rightfrontleg5, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leftBackLeg5, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(rightBackLeg3, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(leftfrontleg3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(rightfrontleg6, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(leftBackLeg6, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(rightBackLeg7, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(aulacephalodon, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

        this.flap(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(aulacephalodon, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperbody, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(upperbody, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.aulacephalodon.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAulacephalodon e = (EntityPrehistoricFloraAulacephalodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
