package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDendrocystites extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelDendrocystites() {
        this.textureWidth = 20;
        this.textureHeight = 16;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.main.cubeList.add(new ModelBox(main, 6, 12, 1.25F, -1.0F, -4.175F, 1, 1, 2, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 7, 6, -0.75F, -1.0F, -6.225F, 2, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.556F, -1.0F, -4.8142F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6414F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 0.0F, -2.5F, 2, 1, 5, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.7199F, -1.0F, -2.4134F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2662F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 6, -1.0315F, 0.0F, -4.9642F, 1, 1, 5, 0.002F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(0.25F, -0.5F, -7.0F);
        this.main.addChild(arm);
        this.arm.cubeList.add(new ModelBox(arm, 0, 8, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.arm.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 7, 6, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.001F, false));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.arm2.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 6, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.arm3.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 3, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.001F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 3, 2, 0.0F, -0.5F, -2.0F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.75F, -0.5F, -2.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 9, 3, -1.0F, -0.5F, 0.0F, 2, 1, 1, -0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 11, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.main.offsetZ = -0.08F;
        this.main.render(0.021F);
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
        //this.body.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] appendage = {this.arm, this.arm2, this.arm3, this.arm4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                this.main.offsetY = -0;
                return;
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 1.2F;
                //this.bob(main, -speed, 5F, false, f2, 1);
            }
            this.main.offsetY = -0.15F;
            this.chainWave(fishTail, speed * 5, 0.1F, -3, f2, 1);
            this.chainSwing(fishTail, speed*5, 0.2F, -3, f2, 1);
            this.chainSwing(appendage, speed/5, 0.4F, 0, f2, 1);



            this.swing(main, speed, 0.06F, true, 0, 0, f2, 1);

        }
    }
}
