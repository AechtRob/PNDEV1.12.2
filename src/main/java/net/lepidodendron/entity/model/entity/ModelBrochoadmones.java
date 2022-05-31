package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrochoadmones extends AdvancedModelBase {
    private final AdvancedModelRenderer Brochoadmones;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Ventral7L;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Ventral7L2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Ventral6L;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Ventral6L2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Ventral5L;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Ventral5L2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Ventral4L;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Ventral4L2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Ventral3L;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Ventral3L2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralL2;
    private final AdvancedModelRenderer Ventral2L;
    private final AdvancedModelRenderer Ventral2L2;
    private final AdvancedModelRenderer Ventral1L;
    private final AdvancedModelRenderer Ventral1R;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Jaw;

    public ModelBrochoadmones() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Brochoadmones = new AdvancedModelRenderer(this);
        this.Brochoadmones.setRotationPoint(0.0F, 15.0F, -11.0F);


        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Brochoadmones.addChild(Headbase);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 55, 28, -3.0F, -3.0F, 1.0F, 6, 6, 2, 0.0F, false));
        this.Headbase.cubeList.add(new ModelBox(Headbase, 55, 28, -2.5F, -3.0F, 2.0F, 5, 6, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Headbase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5934F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 20, -2.0F, -3.5954F, 0.029F, 4, 4, 2, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Headbase.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 23, 25, -3.0F, -6.0F, 0.0F, 6, 10, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 34, 0.0F, -12.0F, 0.4F, 0, 12, 8, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 42, -2.5F, -4.0F, 0.0F, 5, 10, 6, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 42, -2.5F, -4.0F, -1.0F, 5, 10, 6, -0.002F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 48, 0, -2.0F, -2.0F, 7.0F, 4, 8, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 31, -2.0F, -2.0F, 0.0F, 4, 10, 7, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 31, -2.0F, -2.0F, -1.0F, 4, 10, 7, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 0, 0.0F, -12.0F, 0.0F, 0, 12, 9, 0.0F, false));

        this.Ventral7L = new AdvancedModelRenderer(this);
        this.Ventral7L.setRotationPoint(1.6F, 8.0F, 5.6F);
        this.Body3.addChild(Ventral7L);
        this.setRotateAngle(Ventral7L, 0.3491F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral7L.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3715F, 0.3037F, -0.3586F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.Ventral7L2 = new AdvancedModelRenderer(this);
        this.Ventral7L2.setRotationPoint(-1.6F, 8.0F, 5.6F);
        this.Body3.addChild(Ventral7L2);
        this.setRotateAngle(Ventral7L2, 0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral7L2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3715F, -0.3037F, 0.3586F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, true));

        this.Ventral6L = new AdvancedModelRenderer(this);
        this.Ventral6L.setRotationPoint(1.7F, 8.0F, 3.1F);
        this.Body3.addChild(Ventral6L);
        this.setRotateAngle(Ventral6L, 0.4363F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral6L.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0739F, 0.4253F, -0.2399F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 61, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.Ventral6L2 = new AdvancedModelRenderer(this);
        this.Ventral6L2.setRotationPoint(-1.7F, 8.0F, 3.1F);
        this.Body3.addChild(Ventral6L2);
        this.setRotateAngle(Ventral6L2, 0.4363F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral6L2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0739F, -0.4253F, 0.2399F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 61, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, true));

        this.Ventral5L = new AdvancedModelRenderer(this);
        this.Ventral5L.setRotationPoint(1.5F, 8.0F, 1.0F);
        this.Body3.addChild(Ventral5L);
        this.setRotateAngle(Ventral5L, 0.5236F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral5L.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0457F, 0.4011F, -0.4287F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 62, 0.0F, 0.0F, -0.7F, 0, 5, 4, 0.0F, false));

        this.Ventral5L2 = new AdvancedModelRenderer(this);
        this.Ventral5L2.setRotationPoint(-1.5F, 8.0F, 1.0F);
        this.Body3.addChild(Ventral5L2);
        this.setRotateAngle(Ventral5L2, 0.5236F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral5L2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0457F, -0.4011F, 0.4287F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 62, 0.0F, 0.0F, -0.7F, 0, 5, 4, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0873F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 38, 61, 0.0F, 5.5F, -4.0F, 0, 6, 4, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 42, 16, -1.5F, -2.0F, -1.0F, 3, 5, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 49, 0.0F, -1.5F, 0.0F, 0, 13, 5, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body4.addChild(Body5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -4.0F, 0.0F, 0, 16, 14, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 52, -1.0F, -2.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Ventral4L = new AdvancedModelRenderer(this);
        this.Ventral4L.setRotationPoint(2.0F, 6.0F, 4.0F);
        this.Body2.addChild(Ventral4L);
        this.setRotateAngle(Ventral4L, 0.4363F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral4L.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0765F, 0.4205F, -0.2875F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 62, 0.0F, 0.0F, -0.3F, 0, 5, 4, 0.0F, false));

        this.Ventral4L2 = new AdvancedModelRenderer(this);
        this.Ventral4L2.setRotationPoint(-2.0F, 6.0F, 4.0F);
        this.Body2.addChild(Ventral4L2);
        this.setRotateAngle(Ventral4L2, 0.4363F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral4L2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0765F, -0.4205F, 0.2875F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 62, 0.0F, 0.0F, -0.3F, 0, 5, 4, 0.0F, true));

        this.Ventral3L = new AdvancedModelRenderer(this);
        this.Ventral3L.setRotationPoint(2.0F, 6.0F, 2.0F);
        this.Body2.addChild(Ventral3L);
        this.setRotateAngle(Ventral3L, 0.4363F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral3L.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0328F, 0.4205F, -0.2875F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 64, 0.3F, 0.0F, -1.5F, 0, 5, 4, 0.0F, false));

        this.Ventral3L2 = new AdvancedModelRenderer(this);
        this.Ventral3L2.setRotationPoint(-2.0F, 6.0F, 2.0F);
        this.Body2.addChild(Ventral3L2);
        this.setRotateAngle(Ventral3L2, 0.4363F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral3L2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0328F, -0.4205F, 0.2875F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 64, -0.3F, 0.0F, -1.5F, 0, 5, 4, 0.0F, true));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 0.0F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.1745F, 0.8727F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 39, 0, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.PectoralL2 = new AdvancedModelRenderer(this);
        this.PectoralL2.setRotationPoint(-3.0F, 0.0F, 1.0F);
        this.Body1.addChild(PectoralL2);
        this.setRotateAngle(PectoralL2, -0.1745F, -0.8727F, 0.0F);
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 39, 0, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, true));

        this.Ventral2L = new AdvancedModelRenderer(this);
        this.Ventral2L.setRotationPoint(2.0F, 4.0F, 3.5F);
        this.Body1.addChild(Ventral2L);
        this.setRotateAngle(Ventral2L, 0.4553F, 0.2038F, -0.261F);
        this.Ventral2L.cubeList.add(new ModelBox(Ventral2L, 65, 0, 0.1F, 0.0F, -0.3F, 0, 5, 4, 0.0F, false));

        this.Ventral2L2 = new AdvancedModelRenderer(this);
        this.Ventral2L2.setRotationPoint(-2.0F, 4.0F, 3.5F);
        this.Body1.addChild(Ventral2L2);
        this.setRotateAngle(Ventral2L2, 0.4553F, -0.2038F, 0.261F);
        this.Ventral2L2.cubeList.add(new ModelBox(Ventral2L2, 65, 0, -0.1F, 0.0F, -0.3F, 0, 5, 4, 0.0F, true));

        this.Ventral1L = new AdvancedModelRenderer(this);
        this.Ventral1L.setRotationPoint(2.0F, 4.0F, 0.0F);
        this.Body1.addChild(Ventral1L);
        this.setRotateAngle(Ventral1L, 0.4363F, 0.3054F, -0.3054F);
        this.Ventral1L.cubeList.add(new ModelBox(Ventral1L, 65, 64, -0.4F, 0.0F, 0.1F, 0, 5, 4, 0.0F, false));

        this.Ventral1R = new AdvancedModelRenderer(this);
        this.Ventral1R.setRotationPoint(-2.0F, 4.0F, 0.0F);
        this.Body1.addChild(Ventral1R);
        this.setRotateAngle(Ventral1R, 0.4363F, -0.3054F, 0.3054F);
        this.Ventral1R.cubeList.add(new ModelBox(Ventral1R, 65, 64, 0.4F, 0.0F, 0.1F, 0, 5, 4, 0.0F, true));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.4F, 0.9F);
        this.Headbase.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 15, 0, -2.5F, -1.4F, -4.9F, 5, 3, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, 1.6F, -2.9F);
        this.Cephalon.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 58, 50, -4.8F, -0.8F, -1.0F, 1, 1, 5, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 59, -0.2F, -0.8F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.4F, 0.1F);
        this.Cephalon.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 58, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.6F, -0.5F);
        this.Cephalon.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 37, -2.5F, -1.2148F, -0.0299F, 5, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.4F, 0.1F);
        this.Cephalon.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2443F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 55, -2.0F, 0.0F, -4.2F, 4, 1, 4, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.4F, 0.1F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2356F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 55, 13, -2.5F, 0.0F, -5.0F, 5, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Brochoadmones.render(f5 * 0.108F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Brochoadmones.rotateAngleY = (float) Math.toRadians(90);
        this.Brochoadmones.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Brochoadmones.offsetY = 1.25F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.28F;
        if (!e.isInWater()) {
            speed = 0.676F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.chainWave(fishTail, speed, 0.02F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.115F, -0.5, f2, 1);
            this.swing(Brochoadmones, speed, 0.11F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.35), 0.4F, true, 0, 0.4F, f2, 1);

            this.flap(Ventral7L2, speed * 0.7F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(Ventral7L, speed * 0.7F, -0.75F, false, 0F, 0.3F, f2, 1F);

            this.flap(PectoralL2, speed * 0.8F, 0.45F, false, 1F, -0.1F, f2, 1F);
            this.flap(PectoralL, speed * 0.8F, -0.45F, false, 1F, 0.1F, f2, 1F);
            this.swing(PectoralL2, speed * 0.8F, 0.45F, false, 1F, -0.2F, f2, 1F);
            this.swing(PectoralL, speed * 0.8F, -0.45F, false, 1F, 0.2F, f2, 1F);

            this.flap(Ventral1R, speed * 0.9F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(Ventral1L, speed * 0.9F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(Ventral1R, speed * 0.9F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(Ventral1L, speed * 0.9F, -0.65F, false, 0F, 0.2F, f2, 1F);

            this.flap(Ventral2L2, speed * 0.9F, 0.25F, false, 2.0F, -0.1F, f2, 1F);
            this.flap(Ventral2L, speed * 0.9F, -0.25F, false, 2.0F, 0.1F, f2, 1F);
            this.swing(Ventral2L2, speed * 0.9F, 0.65F, false, 2.0F, -0.2F, f2, 1F);
            this.swing(Ventral2L, speed * 0.9F, -0.65F, false, 2.0F, 0.2F, f2, 1F);

            this.flap(Ventral3L2, speed * 0.9F, 0.25F, false, 1.0F, -0.1F, f2, 1F);
            this.flap(Ventral3L, speed * 0.9F, -0.25F, false, 1.0F, 0.1F, f2, 1F);
            this.swing(Ventral3L2, speed * 0.9F, 0.65F, false, 1.0F, -0.2F, f2, 1F);
            this.swing(Ventral3L, speed * 0.9F, -0.65F, false, 1.0F, 0.2F, f2, 1F);

            this.flap(Ventral4L2, speed * 0.9F, 0.25F, false, 3.0F, -0.1F, f2, 1F);
            this.flap(Ventral4L, speed * 0.9F, -0.25F, false, 3.0F, 0.1F, f2, 1F);
            this.swing(Ventral4L2, speed * 0.9F, 0.65F, false, 3.0F, -0.2F, f2, 1F);
            this.swing(Ventral4L, speed * 0.9F, -0.65F, false, 3.0F, 0.2F, f2, 1F);

            this.flap(Ventral5L2, speed * 0.9F, 0.25F, false, 2.0F, -0.1F, f2, 1F);
            this.flap(Ventral5L, speed * 0.9F, -0.25F, false, 2.0F, 0.1F, f2, 1F);
            this.swing(Ventral5L2, speed * 0.9F, 0.65F, false, 2.0F, -0.2F, f2, 1F);
            this.swing(Ventral5L, speed * 0.9F, -0.65F, false, 2.0F, 0.2F, f2, 1F);

            this.flap(Ventral6L2, speed * 0.9F, 0.25F, false, 4.0F, -0.1F, f2, 1F);
            this.flap(Ventral6L, speed * 0.9F, -0.25F, false, 4.0F, 0.1F, f2, 1F);
            this.swing(Ventral6L2, speed * 0.9F, 0.65F, false, 4.0F, -0.2F, f2, 1F);
            this.swing(Ventral6L, speed * 0.9F, -0.65F, false, 4.0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.Brochoadmones.rotateAngleZ = (float) Math.toRadians(90);
                this.Brochoadmones.offsetY = 1.00F;
                this.bob(Brochoadmones, -speed, 5F, false, f2, 1);
            }
        }
    }
}
