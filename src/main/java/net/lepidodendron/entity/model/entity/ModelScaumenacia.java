package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelScaumenacia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;

    public ModelScaumenacia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -12.0F, -8.0F, 5, 7, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 23, 0.0F, -13.75F, -5.0F, 0, 2, 8, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.4F, -7.0F, -7.7F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, -0.4363F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.pectoralfinR.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 11, -3.0F, -1.0F, 0.0F, 0, 3, 11, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.4F, -7.0F, -7.7F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.4363F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.pectoralfinL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 11, 3.0F, -1.0F, 0.0F, 0, 3, 11, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.0F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, -2.0F, -2.025F, -1.0F, 4, 5, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 29, 0.0F, -7.0F, -1.0F, 0, 5, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 27, -1.5F, 0.175F, -0.5F, 3, 2, 8, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.9F, 2.75F, 3.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, -0.1309F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.pelvicfinR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 8, -3.0F, -1.75F, 0.0F, 0, 3, 11, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.9F, 2.75F, 3.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.1309F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.pelvicfinL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 8, 3.0F, -1.75F, 0.0F, 0, 3, 11, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 30, 39, -1.0F, -1.5F, -1.0F, 2, 3, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 23, 0.0F, -7.5F, 0.0F, 0, 6, 9, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 30, 0.0F, -0.75F, -0.5F, 0, 3, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.body3.addChild(tail);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 0, -0.5F, -1.5F, -0.75F, 1, 1, 11, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 14, 0.0F, -0.5F, -0.75F, 0, 2, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.75F, 9.65F);
        this.tail.addChild(tail2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.75F, -9.65F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.5F, 10.25F, 0, 1, 6, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -8.0F, -8.0F);
        this.body.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 33, 22, -2.0F, -2.0F, -4.5F, 4, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, -4.5F);
        this.bodyfront.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 12, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.bodyfront.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 33, -1.5F, -1.05F, 4.55F, 3, 2, 4, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.5F, -1.0F, -4.0F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 19, -3.0F, -0.05F, -2.0F, 3, 1, 1, 0.03F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 7, -3.0F, -0.55F, -2.5F, 3, 2, 2, 0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 6, -3.0F, 1.1F, 0.65F, 3, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 0, -3.0F, 0.1F, -0.35F, 3, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 41, -3.0F, -1.0F, -4.0F, 3, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.5F, 2.0F, -0.3F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 0, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.33F);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.16F;
        this.body.offsetX = -0.04F;
        this.body.offsetZ = -0.25F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.5F, 0.0F);
        this.body.offsetY = -0.15F;
        this.body.render(0.01F);
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
        this.body.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(15), true, 0, -0.2F, f2, 1);
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
