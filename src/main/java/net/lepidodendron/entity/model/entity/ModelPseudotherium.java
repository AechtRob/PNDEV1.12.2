package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudotherium;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPseudotherium extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended footL;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended footR;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended armL;
    private final AdvancedModelRendererExtended armL2;
    private final AdvancedModelRendererExtended handL;
    private final AdvancedModelRendererExtended armR;
    private final AdvancedModelRendererExtended armR2;
    private final AdvancedModelRendererExtended handR;

    private ModelAnimator animator;

    public ModelPseudotherium() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 15.25F, 1.75F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -3.5F, -0.55F, -0.15F, 7, 6, 8, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(3.5F, 1.75F, 7.25F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, -1.1781F, -0.4363F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 18, 31, -2.0F, 0.0F, -1.75F, 3, 5, 4, 0.0F, false));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(-0.5F, 5.25F, -0.45F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 1.9199F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false));

        this.footL = new AdvancedModelRendererExtended(this);
        this.footL.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.legL2.addChild(footL);
        this.setRotateAngle(footL, -0.7418F, 0.0F, 0.0F);
        this.footL.cubeList.add(new ModelBox(footL, 34, 19, -1.5F, 0.0F, -4.25F, 3, 1, 5, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-3.5F, 1.75F, 7.25F);
        this.body2.addChild(legR);
        this.setRotateAngle(legR, -1.1781F, 0.4363F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 18, 31, -1.0F, 0.0F, -1.75F, 3, 5, 4, 0.0F, true));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(0.5F, 5.25F, -0.45F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 1.9199F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, true));

        this.footR = new AdvancedModelRendererExtended(this);
        this.footR.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.legR2.addChild(footR);
        this.setRotateAngle(footR, -0.7418F, 0.0F, 0.0F);
        this.footR.cubeList.add(new ModelBox(footR, 34, 19, -1.5F, 0.0F, -4.25F, 3, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 7.75F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.6109F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 9, -1.5F, -0.25F, -0.4F, 3, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 6.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3491F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 19, -1.0F, -0.5F, -0.9F, 2, 2, 10, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.body2.addChild(body);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 7.0F, -3.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.0F, -8.5F, -3.75F, 6, 6, 9, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -8.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 7.0F, 4.5F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, -2.0F, -6.2F, -9.75F, 4, 4, 5, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.5F, -3.25F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3491F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 7.5F, 7.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4538F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 19, -1.0F, -9.25F, -10.45F, 2, 1, 2, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 0, -1.0F, -9.575F, -12.05F, 2, 2, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 8.65F, 7.25F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 9, -1.5F, -10.25F, -12.7F, 3, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 8.65F, 7.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4974F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 39, -1.0F, -12.1F, -11.25F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 7.5F, 7.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 25, -2.5F, -8.25F, -5.85F, 5, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, -1.0F, -9.24F, -8.86F, 2, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 0, -2.5F, -11.25F, -8.85F, 5, 3, 6, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.75F, -1.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1047F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 4.75F, 9.0F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 37, -1.0F, -7.15F, -13.15F, 2, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 4.75F, 9.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4538F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -1.0F, -10.15F, -8.475F, 2, 2, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 31, -2.5F, -10.15F, -8.475F, 5, 3, 3, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, -1.0F, -8.25F, -12.2F, 2, 1, 4, 0.0F, false));

        this.armL = new AdvancedModelRendererExtended(this);
        this.armL.setRotationPoint(3.0F, 2.6F, -7.25F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 1.0908F, 0.3491F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 29, 37, -1.0F, 0.0F, -1.25F, 2, 4, 3, 0.0F, false));

        this.armL2 = new AdvancedModelRendererExtended(this);
        this.armL2.setRotationPoint(0.0F, 4.0F, 0.25F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -1.789F, -0.1309F, 0.2618F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 15, -1.0F, -0.75F, -1.5F, 2, 4, 2, -0.01F, false));

        this.handL = new AdvancedModelRendererExtended(this);
        this.handL.setRotationPoint(0.0F, 2.75F, -0.55F);
        this.armL2.addChild(handL);
        this.setRotateAngle(handL, 0.6981F, 0.0F, 0.0F);
        this.handL.cubeList.add(new ModelBox(handL, 37, 0, -1.0F, 0.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.armR = new AdvancedModelRendererExtended(this);
        this.armR.setRotationPoint(-3.0F, 2.6F, -7.25F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 1.0908F, -0.3491F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 29, 37, -1.0F, 0.0F, -1.25F, 2, 4, 3, 0.0F, true));

        this.armR2 = new AdvancedModelRendererExtended(this);
        this.armR2.setRotationPoint(0.0F, 4.0F, 0.25F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -1.789F, 0.1309F, -0.2618F);
        this.armR2.cubeList.add(new ModelBox(armR2, 0, 15, -1.0F, -0.75F, -1.5F, 2, 4, 2, -0.01F, true));

        this.handR = new AdvancedModelRendererExtended(this);
        this.handR.setRotationPoint(0.0F, 2.75F, -0.55F);
        this.armR2.addChild(handR);
        this.setRotateAngle(handR, 0.6981F, 0.0F, 0.0F);
        this.handR.cubeList.add(new ModelBox(handR, 37, 0, -1.0F, 0.0F, -3.0F, 2, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body2.render(f5 * 0.15f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body2.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.body2.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body2.offsetY = 1.28F;

        EntityPrehistoricFloraPseudotherium Pseudotherium = (EntityPrehistoricFloraPseudotherium) e;
        float masterSpeed = Pseudotherium.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2};

        if (Pseudotherium.getAnimation() == Pseudotherium.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if ((f3 == 0.0F || !Pseudotherium.getIsMoving())) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.05F, false, 0.5F,0.025F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 2.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (Pseudotherium.getIsFast()) {
            speed = speed * 1.5F;
        }


        float speedmodifier = 1;

        this.armL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 0, f2, 1.5F);;
        this.armR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 3, f2, 1.5F);;
        this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.walk(armL, speed * speedmodifier, 0.5F, false, 0, -0.20F, f2, 1F);
        this.walk(armR, speed * speedmodifier, 0.5F, false, 3, -0.20F, f2, 1F);
        this.flap(armL, speed * speedmodifier, -0.15F, false, 1, 0.05F, f2, 1F);
        this.flap(armR, speed * speedmodifier, 0.15F, false, 4, -0.05F, f2, 1F);

        this.walk(armL2, speed * speedmodifier, -0.25F, false, 3, 0.10F, f2, 1F);
        this.walk(armR2, speed * speedmodifier, -0.25F, false, 6, 0.10F, f2, 1F);
        this.flap(armL2, speed * speedmodifier, -0.15F, false, 3, 0.05F, f2, 1F);
        this.flap(armR2, speed * speedmodifier, 0.15F, false, 6, -0.05F, f2, 1F);

        this.walk(handL, speed * speedmodifier, 0.45F, false, 2, -0.08F, f2, 1F);
        this.walk(handR, speed * speedmodifier, 0.45F, false, 5, -0.08F, f2, 1F);


        this.walk(legL, speed * speedmodifier, 0.5F, true, 0, -0.20F, f2, 1F);
        this.walk(legR, speed * speedmodifier, 0.5F, true, 3, -0.20F, f2, 1F);
        this.flap(legL, speed * speedmodifier, 0.15F, true, 1, -0.05F, f2, 1F);
        this.flap(legR, speed * speedmodifier, -0.15F, true, 4, 0.05F, f2, 1F);

        this.walk(footL, speed * speedmodifier, 0.45F, true, 3, 0.18F, f2, 1F);
        this.walk(footR, speed * speedmodifier, 0.45F, true, 6, 0.18F, f2, 1F);

        this.bobExtended(body2, speed * 2F * speedmodifier, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(body2, speed * speedmodifier, 0.08F, false, 2.0F,0.04F, f2, 1.0F);
        this.flap(body, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);
        this.flap(tail, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);

        this.walk(body, speed * 2 * speedmodifier, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.20F, 6.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body2.offsetZ = this.moveBoxExtended(speed * 2 * speedmodifier, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPseudotherium e = (EntityPrehistoricFloraPseudotherium) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
