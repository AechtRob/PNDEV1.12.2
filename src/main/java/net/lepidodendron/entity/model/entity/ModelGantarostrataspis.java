package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGantarostrataspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Gantarostrataspis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer cube_r16;

    public ModelGantarostrataspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Gantarostrataspis = new AdvancedModelRenderer(this);
        this.Gantarostrataspis.setRotationPoint(0.0F, 21.75F, 0.0F);
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 0, 14, -3.5F, -2.0F, -9.0F, 7, 4, 9, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 0, 16, -1.0F, 2.01F, -9.0F, 2, 0, 2, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 0, 46, -0.5F, -0.95F, -19.25F, 1, 1, 9, 0.001F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 40, 10, 0.25F, -0.95F, -19.25F, 1, 1, 9, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 39, 30, -1.25F, -0.95F, -19.25F, 1, 1, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.2F, -9.1F);
        this.Gantarostrataspis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -1.4F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.Gantarostrataspis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 30, -2.5F, 2.7F, -7.75F, 6, 1, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.95F, -9.0F);
        this.Gantarostrataspis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.5F, -0.8F, -2.0F, 2, 0, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.Gantarostrataspis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -3.5F, -3.7F, -7.75F, 6, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.75F, 0.1F, -8.05F);
        this.Gantarostrataspis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 20, -1.8F, -1.05F, -4.9F, 2, 1, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.75F, 0.1F, -8.05F);
        this.Gantarostrataspis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 0, -0.2F, -1.05F, -4.9F, 2, 1, 5, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.2F, -9.1F);
        this.Gantarostrataspis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 40, -1.5F, -1.35F, -3.15F, 3, 1, 4, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.95F, -9.0F);
        this.Gantarostrataspis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 49, -1.5F, -0.8F, -3.0F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.4F, 1.75F, -0.3F);
        this.Gantarostrataspis.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 49, -1.75F, -2.7F, -19.0F, 1, 1, 5, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4F, 1.75F, -0.3F);
        this.Gantarostrataspis.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 21, 0.75F, -2.7F, -19.0F, 1, 1, 5, -0.001F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Gantarostrataspis.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, -3.0F, -2.0F, -2.0F, 6, 4, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -2.05F, 8.75F);
        this.Tail1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 0, -1.5F, 3.0F, -10.0F, 5, 1, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 2.05F, 8.75F);
        this.Tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, -1.5F, -4.0F, -10.0F, 5, 1, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 22, 17, -2.0F, -1.25F, -2.0F, 4, 3, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.75F, 12.0F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 39, -1.0F, -1.2F, -13.0F, 3, 1, 9, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.Tail2.addChild(Tail3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.Tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 40, 0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.Tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 41, -1.0F, 4.0F, -2.0F, 2, 2, 8, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, -1.0F, 6.5F);
        this.Tail3.addChild(Tailfin);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.5F, -6.0F);
        this.Tailfin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 3, 0.0F, -3.0F, 6.0F, 0, 6, 7, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        this.Gantarostrataspis.render(f5 * 0.21F);

    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Gantarostrataspis.rotateAngleY = (float) Math.toRadians(90);
        this.Gantarostrataspis.offsetX = -0.02F;
        this.Gantarostrataspis.offsetY = 0F;
        this.Gantarostrataspis.offsetZ = 0.02F;
        this.Gantarostrataspis.render(0.01F);
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
        this.Gantarostrataspis.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tailfin};
        float speed = 0.6F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * 0.5F, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.8F);
            this.swing(Gantarostrataspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Gantarostrataspis.offsetY = 1.2F;
                this.bob(Gantarostrataspis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
