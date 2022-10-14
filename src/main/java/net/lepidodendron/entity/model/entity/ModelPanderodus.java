package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPanderodus extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer toothR;
    private final AdvancedModelRenderer toothR2;
    private final AdvancedModelRenderer toothR3;
    private final AdvancedModelRenderer toothR4;
    private final AdvancedModelRenderer toothR5;
    private final AdvancedModelRenderer toothL;
    private final AdvancedModelRenderer toothL2;
    private final AdvancedModelRenderer toothL3;
    private final AdvancedModelRenderer toothL4;
    private final AdvancedModelRenderer toothL5;
    private final AdvancedModelRenderer gill;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;

    public ModelPanderodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 14, 0, -1.5F, -4.0F, -7.0F, 3, 3, 4, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, 0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 28, 17, -0.25F, -1.25F, -1.25F, 2, 2, 2, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 28, 17, 1.76F, -0.75F, -0.75F, 0, 1, 1, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 28, 17, -1.76F, -0.75F, -0.75F, 0, 1, 1, 0.0F, true));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 28, 17, -1.75F, -1.25F, -1.25F, 2, 2, 2, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -1.65F, -5.1F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, -0.2182F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 18, 17, -1.5F, 0.05F, -2.0F, 3, 1, 4, 0.01F, false));

        this.toothR = new AdvancedModelRenderer(this);
        this.toothR.setRotationPoint(-1.0F, 1.0F, -1.5F);
        this.mouth.addChild(toothR);
        this.setRotateAngle(toothR, 0.0F, 0.0F, 0.5672F);
        this.toothR.cubeList.add(new ModelBox(toothR, 0, 5, -0.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.toothR2 = new AdvancedModelRenderer(this);
        this.toothR2.setRotationPoint(-1.0F, 1.0F, -0.75F);
        this.mouth.addChild(toothR2);
        this.setRotateAngle(toothR2, 0.0F, 0.0F, 0.5672F);
        this.toothR2.cubeList.add(new ModelBox(toothR2, 0, 5, -0.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.toothR3 = new AdvancedModelRenderer(this);
        this.toothR3.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.mouth.addChild(toothR3);
        this.setRotateAngle(toothR3, 0.0F, 0.0F, 0.5672F);
        this.toothR3.cubeList.add(new ModelBox(toothR3, 0, 5, -0.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.toothR4 = new AdvancedModelRenderer(this);
        this.toothR4.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.mouth.addChild(toothR4);
        this.setRotateAngle(toothR4, 0.0F, 0.0F, 0.5672F);
        this.toothR4.cubeList.add(new ModelBox(toothR4, 0, 5, -0.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.toothR5 = new AdvancedModelRenderer(this);
        this.toothR5.setRotationPoint(-1.0F, 1.0F, 1.5F);
        this.mouth.addChild(toothR5);
        this.setRotateAngle(toothR5, 0.0F, 0.0F, 0.5672F);
        this.toothR5.cubeList.add(new ModelBox(toothR5, 0, 5, -0.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.toothL = new AdvancedModelRenderer(this);
        this.toothL.setRotationPoint(1.0F, 1.0F, -1.5F);
        this.mouth.addChild(toothL);
        this.setRotateAngle(toothL, 0.0F, 0.0F, -0.5672F);
        this.toothL.cubeList.add(new ModelBox(toothL, 0, 5, -1.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.toothL2 = new AdvancedModelRenderer(this);
        this.toothL2.setRotationPoint(1.0F, 1.0F, -0.75F);
        this.mouth.addChild(toothL2);
        this.setRotateAngle(toothL2, 0.0F, 0.0F, -0.5672F);
        this.toothL2.cubeList.add(new ModelBox(toothL2, 0, 5, -1.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.toothL3 = new AdvancedModelRenderer(this);
        this.toothL3.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.mouth.addChild(toothL3);
        this.setRotateAngle(toothL3, 0.0F, 0.0F, -0.5672F);
        this.toothL3.cubeList.add(new ModelBox(toothL3, 0, 5, -1.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.toothL4 = new AdvancedModelRenderer(this);
        this.toothL4.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.mouth.addChild(toothL4);
        this.setRotateAngle(toothL4, 0.0F, 0.0F, -0.5672F);
        this.toothL4.cubeList.add(new ModelBox(toothL4, 0, 5, -1.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.toothL5 = new AdvancedModelRenderer(this);
        this.toothL5.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.mouth.addChild(toothL5);
        this.setRotateAngle(toothL5, 0.0F, 0.0F, -0.5672F);
        this.toothL5.cubeList.add(new ModelBox(toothL5, 0, 5, -1.49F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.gill = new AdvancedModelRenderer(this);
        this.gill.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.head.addChild(gill);
        this.gill.cubeList.add(new ModelBox(gill, 0, 13, -1.5F, -2.01F, 0.0F, 3, 4, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.gill.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.51F, 0.0F, 3, 5, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 18, 0.0F, -3.01F, 4.0F, 0, 6, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 7, -1.0F, -1.51F, 0.0F, 2, 4, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, 0.0F, -2.51F, 0.0F, 0, 6, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 3, -0.5F, -1.01F, 0.0F, 1, 3, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 24, 0.0F, -2.51F, 0.0F, 0, 6, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -0.5F, -0.51F, 0.0F, 1, 2, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 18, 0.0F, -2.01F, 0.0F, 0, 5, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.08F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.09F;
        this.head.offsetY = -0.24F;
        this.head.render(0.01F);
        GlStateManager.enableCull();
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
        this.head.offsetY = 1.25F;
        this.head.offsetZ = -0.1F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4};
        AdvancedModelRenderer[] leftTeeth = {this.toothL, this.toothL2, this.toothL3, this.toothL4, this.toothL5};
        AdvancedModelRenderer[] rightTeeth = {this.toothR, this.toothR2, this.toothR3, this.toothR4, this.toothR5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(toothL, speed*0.7F, (float)Math.toRadians(32.5), false, 0, 0, f2, 1);
            this.flap(toothR, speed*0.7F, (float)Math.toRadians(32.5), true, 0, 0, f2, 1);
            this.flap(toothL2, speed*0.7F, (float)Math.toRadians(32.5), false, 0.5F, 0, f2, 1);
            this.flap(toothR2, speed*0.7F, (float)Math.toRadians(32.5), true, 0.5F, 0, f2, 1);
            this.flap(toothL3, speed*0.7F, (float)Math.toRadians(32.5), false, 1F, 0, f2, 1);
            this.flap(toothR3, speed*0.7F, (float)Math.toRadians(32.5), true, 1F, 0, f2, 1);
            this.flap(toothL4, speed*0.7F, (float)Math.toRadians(32.5), false, 1.5F, 0, f2, 1);
            this.flap(toothR4, speed*0.7F, (float)Math.toRadians(32.5), true, 1.5F, 0, f2, 1);
            this.flap(toothL5, speed*0.7F, (float)Math.toRadians(32.5), false, 2F, 0, f2, 1);
            this.flap(toothR5, speed*0.7F, (float)Math.toRadians(32.5), true, 2F, 0, f2, 1);

            this.chainSwing(fishTail, speed, (float)Math.toRadians(12.5), -3, f2, 0.7F);
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 1.1F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
