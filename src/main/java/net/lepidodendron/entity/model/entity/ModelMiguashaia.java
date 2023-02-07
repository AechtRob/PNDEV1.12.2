package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMiguashaia extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;

    public ModelMiguashaia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(-0.5F, 24.0F, 3.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -9.9F, -5.0F, 5, 9, 10, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, 0.5F, -14.4F, -2.0F, 0, 5, 8, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.5F, -6.0F, 5.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 29, 37, -1.5F, -3.75F, -1.0F, 3, 8, 5, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-0.75F, 4.25F, 0.5F);
        this.Body2.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.4363F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 29, 0.0F, 0.0F, -0.4F, 0, 4, 6, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(0.75F, 4.25F, 0.5F);
        this.Body2.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.4363F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 29, 0.0F, 0.0F, -0.4F, 0, 4, 6, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 12, 41, -0.5F, -2.75F, -1.0F, 2, 6, 4, 0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 20, 0.5F, 3.2F, 0.0F, 0, 4, 9, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 28, 23, 0.5F, -8.7F, 0.5F, 0, 6, 8, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 38, 43, 0.0F, -2.65F, -0.75F, 1, 1, 7, 0.01F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 5, 0.0F, -2.0F, 1.25F, 1, 2, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 47, 42, 0.0F, -1.75F, -0.75F, 1, 5, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 8, 0.5F, -4.7F, 1.0F, 0, 10, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -2.25F, 6.25F);
        this.Body4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -0.4F, -0.1F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.0F, 1.25F);
        this.Body4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9163F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 46, 0.0F, -1.9F, 0.5F, 1, 1, 5, -0.015F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 25, 0.0F, -1.0F, 0.0F, 1, 1, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -5.5F, -4.5F);
        this.Body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 19, -3.0F, -3.5F, -3.5F, 6, 8, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 45, 0, -2.5F, -0.5F, -10.0F, 5, 2, 2, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 40, -2.5F, 0.0F, -9.5F, 5, 1, 1, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.25F, -11.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6065F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 11, -2.0F, 0.0F, 0.3F, 5, 2, 6, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 3.0F, -3.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 11, -2.0F, -3.0F, -6.25F, 5, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 19, -2.0F, -2.0F, -8.25F, 5, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 3.0F, -3.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 0, -2.0F, -4.65F, -4.25F, 5, 6, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -4.0F, -0.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 31, -2.0F, -0.35F, -5.9F, 5, 3, 6, 0.015F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.25F, -7.75F);
        this.head.addChild(jaw);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, 4.25F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, -1.5F, 1.425F, -4.425F, 3, 1, 1, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 0, -1.5F, 1.425F, -7.925F, 3, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.75F, 4.25F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 32, -2.0F, 0.0F, -8.25F, 4, 1, 5, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-2.0F, -2.0F, -4.0F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, -0.3927F, -0.4363F, 0.0F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 40, 32, 0.0F, -1.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, -0.3927F, 0.4363F, 0.0F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 40, 32, 0.0F, -1.0F, 0.0F, 0, 4, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.rotateAngleX = (float) Math.toRadians(0);
        this.Body.offsetX = -0.027F;
        this.Body.offsetY = -0.15F;
        this.Body.offsetZ = 0.07F;
        this.Body.render(0.01F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(Body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(15), true, 0, -0.2F, f2, 1);
            this.walk(PectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PelvicfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PelvicfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Body.offsetY = -0.2F;
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
            }
        }
    }
}
