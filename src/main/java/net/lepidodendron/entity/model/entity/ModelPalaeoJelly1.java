package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelPalaeoJelly1 extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle1_1;
    private final AdvancedModelRenderer tentacle1_2;
    private final AdvancedModelRenderer tentacle1_3;
    private final AdvancedModelRenderer tentacle1_4;
    private final AdvancedModelRenderer tentacle1_5;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle4_1;
    private final AdvancedModelRenderer tentacle4_2;
    private final AdvancedModelRenderer tentacle4_3;
    private final AdvancedModelRenderer tentacle4_4;
    private final AdvancedModelRenderer tentacle4_5;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle3_1;
    private final AdvancedModelRenderer tentacle3_2;
    private final AdvancedModelRenderer tentacle3_3;
    private final AdvancedModelRenderer tentacle3_4;
    private final AdvancedModelRenderer tentacle3_5;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle2_1;
    private final AdvancedModelRenderer tentacle2_2;
    private final AdvancedModelRenderer tentacle2_3;
    private final AdvancedModelRenderer tentacle2_4;
    private final AdvancedModelRenderer tentacle2_5;

    public ModelPalaeoJelly1() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -12.0F, -4.0F, 8, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -4.0F, -8.0F, -4.0F, 8, 1, 8, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(1.5F, -12.0F, 0.0F);
        this.body.addChild(tentacle1);
        this.setRotateAngle(tentacle1, 0.0F, 0.0F, -0.1745F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 4, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tentacle1_1 = new AdvancedModelRenderer(this);
        this.tentacle1_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_1);
        this.tentacle1_1.cubeList.add(new ModelBox(tentacle1_1, 4, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.tentacle1_2 = new AdvancedModelRenderer(this);
        this.tentacle1_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle1_1.addChild(tentacle1_2);
        this.tentacle1_2.cubeList.add(new ModelBox(tentacle1_2, 0, 4, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.tentacle1_3 = new AdvancedModelRenderer(this);
        this.tentacle1_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle1_2.addChild(tentacle1_3);
        this.tentacle1_3.cubeList.add(new ModelBox(tentacle1_3, 0, 4, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.tentacle1_4 = new AdvancedModelRenderer(this);
        this.tentacle1_4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle1_3.addChild(tentacle1_4);
        this.tentacle1_4.cubeList.add(new ModelBox(tentacle1_4, 6, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tentacle1_5 = new AdvancedModelRenderer(this);
        this.tentacle1_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle1_4.addChild(tentacle1_5);
        this.tentacle1_5.cubeList.add(new ModelBox(tentacle1_5, 6, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.0F, -12.0F, -1.5F);
        this.body.addChild(tentacle4);
        this.setRotateAngle(tentacle4, -0.1745F, 0.0F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 8, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle4_1 = new AdvancedModelRenderer(this);
        this.tentacle4_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle4.addChild(tentacle4_1);
        this.tentacle4_1.cubeList.add(new ModelBox(tentacle4_1, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle4_2 = new AdvancedModelRenderer(this);
        this.tentacle4_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4_1.addChild(tentacle4_2);
        this.tentacle4_2.cubeList.add(new ModelBox(tentacle4_2, 4, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle4_3 = new AdvancedModelRenderer(this);
        this.tentacle4_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4_2.addChild(tentacle4_3);
        this.tentacle4_3.cubeList.add(new ModelBox(tentacle4_3, 4, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle4_4 = new AdvancedModelRenderer(this);
        this.tentacle4_4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4_3.addChild(tentacle4_4);
        this.tentacle4_4.cubeList.add(new ModelBox(tentacle4_4, 10, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle4_5 = new AdvancedModelRenderer(this);
        this.tentacle4_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle4_4.addChild(tentacle4_5);
        this.tentacle4_5.cubeList.add(new ModelBox(tentacle4_5, 10, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -12.0F, 1.5F);
        this.body.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.1745F, 0.0F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 8, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle3_1 = new AdvancedModelRenderer(this);
        this.tentacle3_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle3.addChild(tentacle3_1);
        this.tentacle3_1.cubeList.add(new ModelBox(tentacle3_1, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle3_2 = new AdvancedModelRenderer(this);
        this.tentacle3_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle3_1.addChild(tentacle3_2);
        this.tentacle3_2.cubeList.add(new ModelBox(tentacle3_2, 4, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle3_3 = new AdvancedModelRenderer(this);
        this.tentacle3_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle3_2.addChild(tentacle3_3);
        this.tentacle3_3.cubeList.add(new ModelBox(tentacle3_3, 4, 0, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tentacle3_4 = new AdvancedModelRenderer(this);
        this.tentacle3_4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle3_3.addChild(tentacle3_4);
        this.tentacle3_4.cubeList.add(new ModelBox(tentacle3_4, 10, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle3_5 = new AdvancedModelRenderer(this);
        this.tentacle3_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle3_4.addChild(tentacle3_5);
        this.tentacle3_5.cubeList.add(new ModelBox(tentacle3_5, 10, 12, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-1.5F, -12.0F, 0.0F);
        this.body.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, 0.0F, 0.1745F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 4, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tentacle2_1 = new AdvancedModelRenderer(this);
        this.tentacle2_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle2.addChild(tentacle2_1);
        this.tentacle2_1.cubeList.add(new ModelBox(tentacle2_1, 4, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tentacle2_2 = new AdvancedModelRenderer(this);
        this.tentacle2_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle2_1.addChild(tentacle2_2);
        this.tentacle2_2.cubeList.add(new ModelBox(tentacle2_2, 0, 4, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tentacle2_3 = new AdvancedModelRenderer(this);
        this.tentacle2_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle2_2.addChild(tentacle2_3);
        this.tentacle2_3.cubeList.add(new ModelBox(tentacle2_3, 0, 4, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tentacle2_4 = new AdvancedModelRenderer(this);
        this.tentacle2_4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle2_3.addChild(tentacle2_4);
        this.tentacle2_4.cubeList.add(new ModelBox(tentacle2_4, 6, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tentacle2_5 = new AdvancedModelRenderer(this);
        this.tentacle2_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tentacle2_4.addChild(tentacle2_5);
        this.tentacle2_5.cubeList.add(new ModelBox(tentacle2_5, 6, 11, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.93F);

        this.body.render(f5 * 0.5F);
        GlStateManager.disableBlend();

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
        this.body.setScaleX(1.0F);
        this.body.setScaleZ(1.0F);
        this.body.scaleChildren = false;
        this.body.offsetY = 0.8F;

        AdvancedModelRenderer[] tentacle1 = {this.tentacle1_1, this.tentacle1_2, this.tentacle1_3, this.tentacle1_4, this.tentacle1_5};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2_1, this.tentacle2_2, this.tentacle2_3, this.tentacle2_4, this.tentacle2_5};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3_1, this.tentacle3_2, this.tentacle3_3, this.tentacle3_4, this.tentacle3_5};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4_1, this.tentacle4_2, this.tentacle4_3, this.tentacle4_4, this.tentacle4_5};

        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(body, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            this.walk(body, speed * 0.3F, 0.8F, true, 0, 0, f2, 1);
            this.flap(body, speed * 0.2F, 0.8F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, 0.2F, -3, f2, 1);
            this.chainFlap(tentacle2, speed, -0.2F, -3, f2, 1);
            this.chainWave(tentacle3, speed, 0.2F, -3, f2, 1);
            this.chainWave(tentacle4, speed, -0.2F, -3, f2, 1);
            this.bob(body, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.74F;
                this.body.scaleChildren = true;
                this.body.setScaleX(0.2F);
                this.body.setScaleZ(1.2F);
            }
        }
    }
}
