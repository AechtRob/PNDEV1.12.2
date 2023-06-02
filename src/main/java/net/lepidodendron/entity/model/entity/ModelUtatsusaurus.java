package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCymbospondylus;
import net.lepidodendron.entity.EntityPrehistoricFloraMixosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraUtatsusaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelUtatsusaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;

    public ModelUtatsusaurus() {
        this.textureWidth = 75;
        this.textureHeight = 70;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(-0.5F, 20.5F, 11.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 30, -3.0F, -6.0F, -20.0F, 7, 7, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -20.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.288F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 45, -2.5F, -1.8F, -0.25F, 6, 2, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -2.0F, -14.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.25F, 0.0F, 6, 9, 8, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 3.0F, -6.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, -2.0F, 1.25F, 6.0F, 5, 1, 8, 0.0F, false));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body.addChild(hip);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 2.0F, 6.0F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4189F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 21, -1.5F, -3.95F, -6.75F, 4, 4, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 7.5F, -5.0F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 8, -2.0F, -11.8F, 4.0F, 5, 5, 9, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.85F, 1.5F, 7.25F);
        this.hip.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.3491F, 0.0F, 1.0472F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 33, -0.5F, -0.5F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, 0.0F, 0.75F, -1.75F, 0, 3, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.85F, 1.5F, 7.25F);
        this.hip.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.3491F, 0.0F, -1.0472F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 33, -0.5F, -0.5F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, 0.0F, 0.75F, -1.75F, 0, 3, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.5F, 8.25F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 46, 37, -1.5F, -2.15F, -0.5F, 3, 4, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0F, 7.5F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 0, -1.0F, -0.75F, -8.0F, 2, 1, 8, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 49, -1.0F, -1.9F, -0.5F, 2, 4, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, 0.01F, -1.55F, 2.7F, 0, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 7.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3054F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -7.05F, -1.05F, 0, 7, 23, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 30, -0.5F, -1.4F, -0.5F, 1, 3, 12, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 12.0F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 0, 0.0F, -0.5F, -0.75F, 1, 2, 12, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.5F, -3.25F, -20.0F);
        this.base.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 53, -3.0F, -2.5F, -3.0F, 6, 5, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 2.25F, -3.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 47, 14, -2.0F, -1.0F, 0.1F, 5, 2, 4, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.0F, 2.75F, -1.75F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2618F, 0.0F, 0.8727F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 24, 44, -0.5F, -0.5F, -1.0F, 1, 2, 2, 0.01F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0873F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 44, -0.5F, -0.75F, -1.0F, 1, 3, 2, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 0, 0.0F, -0.25F, -1.0F, 0, 5, 3, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.0F, 2.75F, -1.75F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.2618F, 0.0F, -0.8727F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 24, 44, -0.5F, -0.5F, -1.0F, 1, 2, 2, 0.01F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0873F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 44, -0.5F, -0.75F, -1.0F, 1, 3, 2, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 0, 0.0F, -0.25F, -1.0F, 0, 5, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 20, 0, -2.5F, -2.0F, -3.0F, 5, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 2.0F, -3.0F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -1.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.15F, -2.75F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 21, 30, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 14, -2.0F, -1.5F, -2.975F, 4, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 53, -1.0F, -1.0F, -5.5F, 2, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 44, -0.5F, -1.0F, -9.0F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.0F, -5.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4058F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.5F, 0.1F, 0.725F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -5.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 30, -1.0F, -0.025F, 0.0F, 2, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0698F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 0, -2.0F, 0.0F, -3.0F, 4, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 35, -2.0F, -1.5F, -2.0F, 4, 2, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 8, -1.0F, 0.0F, -5.5F, 2, 1, 3, -0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 34, -0.5F, 0.0F, -9.0F, 1, 1, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 4, -2.5F, 0.15F, -0.5F, 3, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.offsetY = -0.0F;
        this.chest.offsetX = -0.0F;
        this.chest.offsetZ = 0.25F;
        this.chest.rotateAngleY = (float) Math.toRadians(0);
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(hip, 0.0F, 0.09F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(neck, -0.2F, 0.0F, -0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, -0.0F);
        this.base.offsetY = -0.3F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hip, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.1F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Mixosaurus.offsetY = 1F;
        //this.Mixosaurus.offsetZ = 1.0F;
        if(e.isInWater()) {

            //this.Mixosaurus.offsetY = -0.2F;

        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckHead = {this.neck, this.head};


        float speed = 0.24F;
        EntityPrehistoricFloraUtatsusaurus ee = (EntityPrehistoricFloraUtatsusaurus) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        ((EntityPrehistoricFloraUtatsusaurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        //if (e.isInWater()) {

         if(!e.isInWater()) {

             this.bob(base, -speed, 1.5F, false, f2, 1);

         }

         /*   if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            */
        //Animation values need tweaking
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(neckHead, speed * still, 0.15F, 0, f2, 0.5F *still);
        }

        //this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(leftarm, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftarm, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightarm, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightarm, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        this.flap(leftleg, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(leftleg, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(rightleg, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(rightleg, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        //}

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

