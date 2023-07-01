package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelVetulicola extends AdvancedModelBase {
    private final AdvancedModelRenderer Vetulicola;
    private final AdvancedModelRenderer JawUpper;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer JawLower;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelVetulicola() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Vetulicola = new AdvancedModelRenderer(this);
        this.Vetulicola.setRotationPoint(0.0F, 19.0F, -2.5F);
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 0, -1.5F, -2.0F, -3.5F, 3, 4, 7, 0.01F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 9, 12, 0.0F, -3.0F, 2.5F, 0, 1, 1, 0.0F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 12, 0.0F, -2.5F, -3.5F, 0, 5, 8, 0.0F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 0, -1.0F, -1.7F, -4.5F, 2, 3, 1, 0.0F, false));

        this.JawUpper = new AdvancedModelRenderer(this);
        this.JawUpper.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.Vetulicola.addChild(JawUpper);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawUpper.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.0472F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.JawLower = new AdvancedModelRenderer(this);
        this.JawLower.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.Vetulicola.addChild(JawLower);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.JawLower.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.Vetulicola.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 14, 0, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.01F, 2.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 9, 13, -1.0F, -1.01F, -0.01F, 2, 2, 2, -0.01F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.01F, 1.98F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 17, 15, -0.5F, -1.5F, 0.0F, 1, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.5F, 0.02F);
        this.Tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 12, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, 0.02F);
        this.Tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 6, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Vetulicola.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Vetulicola.render(0.01F);
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
        //this.Vetulicola.offsetY = 1.1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.8F);
            this.swing(Vetulicola, speed, 0.25F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Vetulicola.rotateAngleZ = (float) Math.toRadians(90);
                //this.Vetulicola.offsetY = 1.1F;
                this.bob(Vetulicola, -speed, 5F, false, f2, 1);
            }
        }
    }
}
