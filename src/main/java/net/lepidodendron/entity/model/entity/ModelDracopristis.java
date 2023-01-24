package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDracopristis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer gill;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer fin2L;
    private final AdvancedModelRenderer fin2R;
    private final AdvancedModelRenderer fin1L;
    private final AdvancedModelRenderer fin1R;

    private ModelAnimator animator;

    public ModelDracopristis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 78, -2.01F, -0.55F, -2.4F, 4, 3, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 0, -2.0F, -5.75F, -7.4F, 4, 2, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.5F, 0.15F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 63, -2.49F, -1.9F, -7.95F, 5, 1, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.175F, -0.25F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 92, -1.5F, -1.25F, -7.1F, 3, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 85, -2.0F, -1.25F, -6.75F, 4, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5F, 0.15F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 37, -2.5F, -3.65F, -7.1F, 5, 2, 7, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.175F, -0.25F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0873F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 92, -1.5F, -0.45F, -6.65F, 3, 1, 0, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 40, 0, -2.0F, 0.0F, -7.0F, 4, 1, 7, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 85, -2.0F, -0.5F, -6.25F, 4, 1, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 28, -1.5F, 0.15F, -6.95F, 3, 1, 7, 0.0F, false));

        this.gill = new AdvancedModelRenderer(this);
        this.gill.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head.addChild(gill);
        this.gill.cubeList.add(new ModelBox(gill, 46, 46, -2.5F, -3.0F, 0.0F, 5, 6, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.gill.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 14, -2.0F, -0.35F, 0.05F, 4, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.gill.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -2.6F, -5.0F, 0.15F, 1, 4, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.gill.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 54, 1.6F, -5.0F, 0.15F, 1, 4, 4, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.gill.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 16, 16, -2.5F, -3.0F, -0.25F, 5, 7, 12, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 31, 0.0F, -7.8F, 3.2F, 0, 5, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.3963F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -0.49F, -19.0F, -8.2F, 1, 5, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0472F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 55, -0.5F, -16.0F, -2.9F, 1, 9, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 11.75F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 44, -2.0F, -3.0F, 0.0F, 4, 6, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.75F, -15.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 9, -1.5F, 0.5F, 15.0F, 3, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 28, -2.0F, -2.75F, 0.0F, 4, 5, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 27, 0.0F, -11.25F, 1.25F, 0, 9, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.75F, -19.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 20, -1.5F, 0.75F, 19.0F, 3, 1, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.0F, -19.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5F, -18.75F, 18.25F, 1, 9, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 30, 46, -1.5F, -2.25F, 0.0F, 3, 3, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 23, 0, 0.0F, 0.25F, 2.25F, 0, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.0F, -26.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 36, -1.0F, -1.1F, 26.0F, 2, 1, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 2, 47, -1.0F, -1.99F, 0.0F, 2, 3, 3, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -0.5F, 2.25F);
        this.body5.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 20, 54, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F, false));
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 0, 0.0F, -7.75F, 0.0F, 0, 14, 14, 0.0F, false));

        this.fin2L = new AdvancedModelRenderer(this);
        this.fin2L.setRotationPoint(2.0F, 1.75F, 2.0F);
        this.body3.addChild(fin2L);
        this.setRotateAngle(fin2L, 0.0F, 0.0F, 0.7854F);
        this.fin2L.cubeList.add(new ModelBox(fin2L, 30, 19, 0.0F, 0.0F, -2.0F, 6, 0, 8, 0.0F, false));

        this.fin2R = new AdvancedModelRenderer(this);
        this.fin2R.setRotationPoint(-2.0F, 1.75F, 2.0F);
        this.body3.addChild(fin2R);
        this.setRotateAngle(fin2R, 0.0F, 0.0F, -0.7854F);
        this.fin2R.cubeList.add(new ModelBox(fin2R, 30, 11, -6.0F, 0.0F, -2.0F, 6, 0, 8, 0.0F, false));

        this.fin1L = new AdvancedModelRenderer(this);
        this.fin1L.setRotationPoint(2.5F, 3.0F, 1.75F);
        this.body1.addChild(fin1L);
        this.setRotateAngle(fin1L, 0.0F, 0.0F, 0.7854F);
        this.fin1L.cubeList.add(new ModelBox(fin1L, 0, 7, 0.0F, 0.0F, -2.0F, 8, 0, 7, 0.0F, false));

        this.fin1R = new AdvancedModelRenderer(this);
        this.fin1R.setRotationPoint(-2.5F, 3.0F, 1.75F);
        this.body1.addChild(fin1R);
        this.setRotateAngle(fin1R, 0.0F, 0.0F, -0.7854F);
        this.fin1R.cubeList.add(new ModelBox(fin1R, 0, 0, -8.0F, 0.0F, -2.0F, 8, 0, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(tailfin, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(fin2L, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(fin2R, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(fin1L, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(fin1R, 0.0F, 0.0F, -0.3054F);
        this.body.offsetY = -0.5F;
        this.body.offsetX = -0.12F;
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(tailfin, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(fin2L, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(fin2R, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(fin1L, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(fin1R, 0.0F, 0.0F, -0.3054F);
        this.body.offsetX = -0.12F;
        this.body.offsetY = 0.04F;
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.body.offsetY = 0.F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.21F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.5F * still, -0.85, f2, 0.6F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(fin1L, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(fin1L, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(fin1R, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(fin1R, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(fin2L, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(fin2L, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(fin2R, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(fin2R, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

