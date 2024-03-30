package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelRotaciurca extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer squish;
    private final AdvancedModelRenderer cone;
    private final AdvancedModelRenderer uppercap;
    private final AdvancedModelRenderer uppercap3;
    private final AdvancedModelRenderer uppercap2;
    private final AdvancedModelRenderer uppercap4;

    public ModelRotaciurca() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.squish = new AdvancedModelRenderer(this);
        this.squish.setRotationPoint(-1.5F, -0.925F, 0.5F);
        this.main.addChild(squish);
        this.squish.cubeList.add(new ModelBox(squish, 0, 0, -0.5F, -1.0F, -2.5F, 4, 2, 4, 0.0F, false));

        this.cone = new AdvancedModelRenderer(this);
        this.cone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cone);
        this.cone.cubeList.add(new ModelBox(cone, 0, 13, -1.5F, -7.0F, -1.5F, 3, 4, 3, 0.0F, false));
        this.cone.cubeList.add(new ModelBox(cone, 0, 7, -2.0F, -3.0F, -2.0F, 4, 1, 4, 0.001F, false));
        this.cone.cubeList.add(new ModelBox(cone, 13, 14, -1.0F, -12.0F, -1.0F, 2, 5, 2, 0.0F, false));
        this.cone.cubeList.add(new ModelBox(cone, 0, 21, -0.5F, -16.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.uppercap = new AdvancedModelRenderer(this);
        this.uppercap.setRotationPoint(2.0F, -2.0F, 0.0F);
        this.cone.addChild(uppercap);
        this.setRotateAngle(uppercap, 0.0F, 0.0F, 0.7418F);
        this.uppercap.cubeList.add(new ModelBox(uppercap, 13, 9, 0.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.uppercap3 = new AdvancedModelRenderer(this);
        this.uppercap3.setRotationPoint(-2.0F, -2.0F, 0.0F);
        this.cone.addChild(uppercap3);
        this.setRotateAngle(uppercap3, 0.0F, 0.0F, -0.7418F);
        this.uppercap3.cubeList.add(new ModelBox(uppercap3, 13, 3, -2.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.uppercap2 = new AdvancedModelRenderer(this);
        this.uppercap2.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.cone.addChild(uppercap2);
        this.setRotateAngle(uppercap2, -0.7418F, 0.0F, 0.0F);
        this.uppercap2.cubeList.add(new ModelBox(uppercap2, 20, 20, -2.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.uppercap4 = new AdvancedModelRenderer(this);
        this.uppercap4.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.cone.addChild(uppercap4);
        this.setRotateAngle(uppercap4, 0.7418F, 0.0F, 0.0F);
        this.uppercap4.cubeList.add(new ModelBox(uppercap4, 13, 0, -2.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
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

        this.main.offsetY = -0.2F;
        //this.main.setScaleX(1.0F);
        //this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;
        AdvancedModelRenderer[] tentacle1 = {this.uppercap};
        AdvancedModelRenderer[] tentacle2 = {this.uppercap2};
        AdvancedModelRenderer[] tentacle3 = {this.uppercap3};
        AdvancedModelRenderer[] tentacle4 = {this.uppercap4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.swing(main, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            //this.walk(main, speed * 0.3F, 0.8F, true, 0, 0, f2, 1);
            //this.flap(main, speed * 0.2F, 0.8F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, -0.4F, 0, f2, 1);
            this.chainWave(tentacle2, speed, -0.4F, 2, f2, 1);
            this.chainFlap(tentacle3, speed, 0.4F, 0, f2, 1);
            this.chainWave(tentacle4, speed, 0.4F, 2, f2, 1);
            this.bob(main, -speed * 0.5F, -1.5F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.15F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
