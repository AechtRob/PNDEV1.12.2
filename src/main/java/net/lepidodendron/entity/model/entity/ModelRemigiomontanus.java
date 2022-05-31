package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRemigiomontanus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRemigiomontanus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL1;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR1;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;
    private final AdvancedModelRendererExtended frontlegL;
    private final AdvancedModelRendererExtended frontlegL1;
    private final AdvancedModelRendererExtended frontlegL2;
    private final AdvancedModelRendererExtended frontlegL3;
    private final AdvancedModelRendererExtended frontlegR;
    private final AdvancedModelRendererExtended frontlegR1;
    private final AdvancedModelRendererExtended frontlegR2;
    private final AdvancedModelRendererExtended frontlegR3;

    private ModelAnimator animator;

    public ModelRemigiomontanus() {
        this.textureWidth = 84;
        this.textureHeight = 84;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 23.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 4, 0.0F, -26.75F, -0.25F, 0, 16, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 19, -3.5F, -12.25F, -0.5F, 7, 9, 15, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -10.75F, -0.25F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 50, 19, -2.0F, -1.0F, -5.0F, 4, 4, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 65, 25, 0.0F, -14.0F, -4.0F, 0, 14, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, -4.75F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -1.5F, -2.8F, -0.75F, 3, 3, 7, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 9, 34, -1.5F, -0.5F, -2.95F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 50, -1.5F, 0.5F, -4.75F, 3, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 7, -1.0F, 0.5F, -1.7F, 2, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, -4.75F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 0, 0.475F, 0.0F, 0.05F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -0.5F, -0.01F, 0.05F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 3, -1.475F, 0.0F, 0.05F, 1, 1, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 52, 43, -1.5F, 0.0F, -4.75F, 3, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 0, -1.0F, 0.05F, 0.175F, 2, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -9.0F, 13.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 31, 0.0F, -17.75F, 0.0F, 0, 16, 12, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, 1.25F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 0, -3.0F, -1.0F, -1.5F, 6, 8, 11, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 10.25F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -2.0F, -1.0F, -0.5F, 4, 6, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 9.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 43, -1.5F, -0.75F, -1.0F, 3, 4, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 47, -1.0F, -1.0F, -1.0F, 2, 3, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 6, -0.5F, -0.4F, 6.0F, 1, 1, 3, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 34, -0.5F, -0.9F, -1.0F, 1, 2, 7, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(2.5F, 3.5F, 7.75F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);


        this.hindlegL1 = new AdvancedModelRendererExtended(this);
        this.hindlegL1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.hindlegL.addChild(hindlegL1);
        this.setRotateAngle(hindlegL1, 0.0F, 0.0F, -1.2217F);
        this.hindlegL1.cubeList.add(new ModelBox(hindlegL1, 39, 43, 0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(1.5F, 4.0F, 0.0F);
        this.hindlegL1.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.2217F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 24, 43, -1.49F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, -0.6981F, 0.0F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 20, 56, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-2.5F, 3.5F, 7.75F);
        this.body2.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.3491F, 0.0F);


        this.hindlegR1 = new AdvancedModelRendererExtended(this);
        this.hindlegR1.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.hindlegR.addChild(hindlegR1);
        this.setRotateAngle(hindlegR1, 0.0F, 0.0F, 1.2217F);
        this.hindlegR1.cubeList.add(new ModelBox(hindlegR1, 28, 10, -2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(-1.5F, 4.0F, 0.0F);
        this.hindlegR1.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.0F, -1.2217F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 0, -0.51F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.0F, 0.6981F, 0.0F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 50, 29, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));

        this.frontlegL = new AdvancedModelRendererExtended(this);
        this.frontlegL.setRotationPoint(3.0F, -5.5F, 1.5F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, -0.6981F, 0.0F);


        this.frontlegL1 = new AdvancedModelRendererExtended(this);
        this.frontlegL1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.frontlegL.addChild(frontlegL1);
        this.setRotateAngle(frontlegL1, 0.0F, 0.0F, -1.2217F);
        this.frontlegL1.cubeList.add(new ModelBox(frontlegL1, 32, 59, 0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.frontlegL2 = new AdvancedModelRendererExtended(this);
        this.frontlegL2.setRotationPoint(1.5F, 4.0F, 0.0F);
        this.frontlegL1.addChild(frontlegL2);
        this.setRotateAngle(frontlegL2, 0.0F, 0.3491F, 1.2217F);
        this.frontlegL2.cubeList.add(new ModelBox(frontlegL2, 40, 59, -1.49F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.frontlegL3 = new AdvancedModelRendererExtended(this);
        this.frontlegL3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.frontlegL2.addChild(frontlegL3);
        this.frontlegL3.cubeList.add(new ModelBox(frontlegL3, 0, 59, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));

        this.frontlegR = new AdvancedModelRendererExtended(this);
        this.frontlegR.setRotationPoint(-3.0F, -5.5F, 1.5F);
        this.body.addChild(frontlegR);
        this.setRotateAngle(frontlegR, 0.0F, 0.6981F, 0.0F);


        this.frontlegR1 = new AdvancedModelRendererExtended(this);
        this.frontlegR1.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.frontlegR.addChild(frontlegR1);
        this.setRotateAngle(frontlegR1, 0.0F, 0.0F, 1.2217F);
        this.frontlegR1.cubeList.add(new ModelBox(frontlegR1, 14, 59, -2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.frontlegR2 = new AdvancedModelRendererExtended(this);
        this.frontlegR2.setRotationPoint(-1.5F, 4.0F, 0.0F);
        this.frontlegR1.addChild(frontlegR2);
        this.setRotateAngle(frontlegR2, 0.0F, -0.3491F, -1.2217F);
        this.frontlegR2.cubeList.add(new ModelBox(frontlegR2, 59, 0, -0.51F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.frontlegR3 = new AdvancedModelRendererExtended(this);
        this.frontlegR3.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.frontlegR2.addChild(frontlegR3);
        this.frontlegR3.cubeList.add(new ModelBox(frontlegR3, 57, 56, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.365f);
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
        this.body.offsetY = 0.95F;

        EntityPrehistoricFloraRemigiomontanus Remigiomontanus = (EntityPrehistoricFloraRemigiomontanus) e;
        float masterSpeed = Remigiomontanus.getTravelSpeed();

        this.faceTarget(f3, 0, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};

        if (Remigiomontanus.getAnimation() == Remigiomontanus.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.walk(neck, 0.5F * 2, 0.02F, false, 0.5F,-0.01F, f2, 0.8F);
            //this.walk(frontlegL1, 0.6F, 0.40F, true, 5, 0.30F, f2, 1F);
            //this.walk(frontlegR1, 0.6F, 0.40F, true, 8, 0.30F, f2, 1F);
            //this.walk(frontlegL2, 0.6F, 0.25F, true, 6, 0F, f2, 1F);
            //this.walk(frontlegR2, 0.6F, 0.25F, true, 9, 0F, f2, 1F);
            //this.walk(frontlegL3, 0.6F, 0.30F, true, 2, -0.10F, f2, 1F);
            //this.walk(frontlegR3, 0.6F, 0.30F, true, 5, -0.10F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Remigiomontanus.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.215F;
        if (Remigiomontanus.getIsFast()) {
            speed = speed * 1.8F;
        }

        this.frontlegL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 1, f2, 1.5F);;
        this.frontlegR1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.8), false, 4, f2, 1.5F);;
        this.hindlegL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.0), false, 4, f2, 1.5F);;
        this.hindlegR1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.0), false, 1, f2, 1.5F);;

        this.flap(frontlegL1, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(frontlegR1, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(hindlegL1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(hindlegR1, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(frontlegL1, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(frontlegR1, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(hindlegL1, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(hindlegR1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(frontlegL2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(frontlegR2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(hindlegL2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(hindlegR2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontlegL2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontlegR2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(hindlegL2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(hindlegR2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(frontlegL3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(frontlegR3, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(hindlegL3, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(hindlegR3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.1F, false, 2.5F,  f2, 1F);

        this.swing(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        //this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        //this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.9), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRemigiomontanus e = (EntityPrehistoricFloraRemigiomontanus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        //animator.rotate(this.neck, (float) Math.toRadians(12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.rotate(this.neck, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
