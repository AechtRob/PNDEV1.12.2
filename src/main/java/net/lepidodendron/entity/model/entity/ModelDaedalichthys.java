package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDaedalichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pectoralfinL;

    public ModelDaedalichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.95F, -4.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 22, -1.5F, -9.5F, -5.75F, 3, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.125F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4451F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 28, -1.0F, -10.75F, -4.25F, 2, 2, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.125F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -4.15F, -9.15F, 2, 1, 1, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -6.1F, -4.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 20, 16, -1.0F, 0.05F, -3.0F, 2, 1, 4, -0.02F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 25, 0, -1.5F, -2.0F, 0.0F, 3, 4, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.0F, 2.0F, 3, 5, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 7.0F, 4.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4189F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -1.5F, -3.9F, -5.5F, 3, 1, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.05F, 11.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 15, 0, -1.0F, -1.25F, -1.0F, 2, 2, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.0F, -7.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.2654F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -15.25F, -6.6F, 0, 6, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 6.0F, -7.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -1.0F, -10.5F, 4.0F, 2, 2, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.0F, -7.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 9, -1.0F, -4.85F, 7.5F, 2, 2, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 6.0F, -7.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.3526F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 18, 0.0F, -12.75F, -2.6F, 0, 6, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 28, 16, -0.5F, -1.15F, -0.25F, 1, 2, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.0F, -12.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 5, 0.0F, -4.35F, 13.0F, 0, 7, 9, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 15, -0.5F, -4.35F, 14.0F, 1, 1, 6, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 28, -0.5F, -3.35F, 14.0F, 1, 1, 3, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.5F, 2.05F, 1.5F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.5236F, -0.0873F, 0.2618F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 15, 0, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 2.8F, 6.0F);
        this.body.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.3491F, 0.0F, 0.0873F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 9, 20, 0.0F, -0.5F, -0.5F, 0, 3, 2, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 2.8F, 6.0F);
        this.body.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.3491F, 0.0F, -0.0873F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 20, 14, 0.0F, -0.5F, -0.5F, 0, 3, 2, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.5F, 2.05F, 1.5F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.5236F, 0.0873F, -0.2618F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 19, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.128F * 1.4F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.render(0.01F);
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
        this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.46F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(head, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.35), 0.5F, true, 0, 0, f2, 1);

            this.flap(pelvicfinR, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinL, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
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
