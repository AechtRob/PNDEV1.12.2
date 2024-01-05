package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSemionotus extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;

    public ModelSemionotus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 8, -2.5F, -11.45F, -4.75F, 3, 3, 5, 0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 0, -1.5F, -7.25F, -8.0F, 3, 3, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 20, -1.5F, -4.25F, -12.0F, 3, 4, 7, 0.0F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-2.5F, -6.25F, -8.0F);
        this.head.addChild(gillR);
        this.setRotateAngle(gillR, 0.0F, -0.1745F, 0.0F);
        this.gillR.cubeList.add(new ModelBox(gillR, 0, 0, 0.0F, -1.5F, -0.75F, 1, 5, 4, 0.0F, false));

        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(0.5F, -6.25F, -8.0F);
        this.head.addChild(gillL);
        this.setRotateAngle(gillL, 0.0F, 0.1745F, 0.0F);
        this.gillL.cubeList.add(new ModelBox(gillL, 14, 40, -1.0F, -1.5F, -0.75F, 1, 5, 4, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-1.0F, -6.5F, -8.25F);
        this.head.addChild(upperjaw);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 26, -1.5F, -2.25F, -14.65F, 3, 1, 3, 0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 41, -2.5F, -13.75F, -5.25F, 3, 2, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -2.5F, -9.45F, -7.75F, 3, 1, 3, 0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -2.52F, -10.95F, -7.25F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 1, 0.52F, -10.95F, -7.25F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 38, -2.5F, -11.45F, -8.75F, 3, 2, 4, 0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(-1.0F, -4.25F, -11.15F);
        this.head.addChild(lowerjaw);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.25F, 11.4F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 22, -1.5F, -1.25F, -14.9F, 3, 1, 3, 0.015F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(-1.0F, -6.0F, -5.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -2.0F, -4.5F, 0.25F, 4, 9, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.0F, 5.0F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 9, -1.5F, -10.9F, -3.875F, 3, 1, 10, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, 3.25F, 1.0F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.829F, 0.2618F, -0.3491F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 32, 28, 0.0F, -1.75F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, 3.25F, 1.0F);
        this.body1.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.829F, -0.2618F, 0.3491F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 31, 13, 0.0F, -1.75F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.0F, 3.5F, 7.5F);
        this.body1.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.6981F, 0.1745F, -0.0436F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 34, 10, 0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.0F, 3.5F, 7.5F);
        this.body1.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.6981F, -0.1745F, 0.0436F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 31, 17, 0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 10.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 30, -1.5F, -2.25F, -0.75F, 3, 5, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 28, 0.0F, -7.25F, 0.25F, 0, 5, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 6.25F, -5.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 23, -0.01F, -9.25F, 5.75F, 0, 4, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.25F, -5.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 0, -1.0F, -11.425F, 0.75F, 2, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.25F, -5.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3403F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 0, -1.0F, -1.9F, 4.8F, 2, 2, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 32, 25, -1.0F, -1.75F, -0.75F, 2, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 52, 0.0F, 1.625F, 2.25F, 0, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 5.25F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, 0.0F, -5.25F, -1.0F, 0, 11, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.0F, -15.25F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 39, -0.5F, -0.5F, 15.25F, 1, 2, 5, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 40, -0.5F, 1.5F, 15.25F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.128F * 1.4F);
    }
    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetY = -0.18F;
        this.head.offsetX = -0.05F;
        this.head.offsetZ = -0.43F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2F, 0.0F);
        this.head.offsetY = -0.03F;
        this.head.render(0.01F);
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
        this.resetToDefaultPose();
        this.head.offsetY = 1.2F;

        this.swing(gillL, 0.12F, -0.12F, true, -0.12F, 0, f2, 1);
        this.swing(gillR, 0.12F, 0.12F, true, 0.12F, 0, f2, 1);

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.tail};
        float speed = 0.46F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(head, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.35), 0.5F, true, 0, 0, f2, 1);

            this.flap(pelvicfinR, speed * 0.8F, 0.75F, true, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinL, speed * 0.8F, -0.75F, true, 0F, 0.3F, f2, 1F);
            this.flap(pectoralfinR, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(pectoralfinL, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinR, speed * 0.8F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinL, speed * 0.8F, -0.65F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 1.20F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
