package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelPalaeoJelly3 extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacleA;
    private final AdvancedModelRenderer tentacleB;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacleA2;
    private final AdvancedModelRenderer tentacleB2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacleA3;
    private final AdvancedModelRenderer tentacleB3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacleA4;
    private final AdvancedModelRenderer tentacleB4;

    public ModelPalaeoJelly3() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -3.0F, -12.0F, -3.0F, 6, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -10.0F, -4.0F, 8, 4, 8, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.body.addChild(tentacle1);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 24, 18, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleA = new AdvancedModelRenderer(this);
        this.tentacleA.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle1.addChild(tentacleA);
        this.tentacleA.cubeList.add(new ModelBox(tentacleA, 24, 6, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleB = new AdvancedModelRenderer(this);
        this.tentacleB.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA.addChild(tentacleB);
        this.tentacleB.cubeList.add(new ModelBox(tentacleB, 24, 4, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(4.0F, -6.0F, 0.0F);
        this.body.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, -1.5708F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 24, 2, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleA2 = new AdvancedModelRenderer(this);
        this.tentacleA2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle2.addChild(tentacleA2);
        this.tentacleA2.cubeList.add(new ModelBox(tentacleA2, 24, 0, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleB2 = new AdvancedModelRenderer(this);
        this.tentacleB2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA2.addChild(tentacleB2);
        this.tentacleB2.cubeList.add(new ModelBox(tentacleB2, 14, 23, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -6.0F, 4.0F);
        this.body.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 23, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleA3 = new AdvancedModelRenderer(this);
        this.tentacleA3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle3.addChild(tentacleA3);
        this.tentacleA3.cubeList.add(new ModelBox(tentacleA3, 14, 21, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleB3 = new AdvancedModelRenderer(this);
        this.tentacleB3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA3.addChild(tentacleB3);
        this.tentacleB3.cubeList.add(new ModelBox(tentacleB3, 0, 21, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-4.0F, -6.0F, 0.0F);
        this.body.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, -1.5708F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 18, 16, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleA4 = new AdvancedModelRenderer(this);
        this.tentacleA4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4.addChild(tentacleA4);
        this.tentacleA4.cubeList.add(new ModelBox(tentacleA4, 18, 14, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.tentacleB4 = new AdvancedModelRenderer(this);
        this.tentacleB4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA4.addChild(tentacleB4);
        this.tentacleB4.cubeList.add(new ModelBox(tentacleB4, 18, 12, -3.5F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

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

        AdvancedModelRenderer[] tentacle1 = {this.tentacle1, this.tentacleA, this.tentacleB};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2, this.tentacleA2, this.tentacleB2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3, this.tentacleA3, this.tentacleB3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4, this.tentacleA4, this.tentacleB4};

        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(body, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            this.walk(body, speed * 0.3F, 0.8F, true, 0, 0, f2, 1);
            this.flap(body, speed * 0.2F, 0.8F, true, 0, 0, f2, 1);
            this.chainWave(tentacle1, speed, 0.3F, -3.5, f2, 1);
            this.chainWave(tentacle2, speed, -0.3F, -3.5, f2, 1);
            this.chainWave(tentacle3, speed, 0.3F, -3.5, f2, 1);
            this.chainWave(tentacle4, speed, -0.3F, -3.5, f2, 1);
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
