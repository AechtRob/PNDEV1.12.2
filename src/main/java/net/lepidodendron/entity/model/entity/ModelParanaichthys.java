package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParanaichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer Paranaichthys;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer Mouth_upper_r1;
    private final AdvancedModelRenderer Foreheadtop_r1;
    private final AdvancedModelRenderer Forehead_r1;
    private final AdvancedModelRenderer Belly_start_r1;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralR_r1;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralL_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Jaw_r1;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Bellyslope_large_r1;
    private final AdvancedModelRenderer Back_r1;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer VentralR_r1;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer VentralL_r1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Backslope_start_r1;
    private final AdvancedModelRenderer Bellyslope_short_r1;
    private final AdvancedModelRenderer Back_horizontal_r1;
    private final AdvancedModelRenderer Back_peak_r1;
    private final AdvancedModelRenderer Bellytail_start_r1;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Dorsalfin_r1;
    private final AdvancedModelRenderer Analfin_r1;
    private final AdvancedModelRenderer Backslope_long_r1;
    private final AdvancedModelRenderer Bellytail_long_r1;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Bellytail_end_r1;
    private final AdvancedModelRenderer Backslope_end_r1;
    private final AdvancedModelRenderer Body5;

    public ModelParanaichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Paranaichthys = new AdvancedModelRenderer(this);
        this.Paranaichthys.setRotationPoint(-0.2F, 18.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.06F, 1.0F, 0.3F);
        this.Paranaichthys.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 0, -0.56F, -3.52F, -2.61F, 2, 6, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 23, 36, -0.56F, -1.096F, -3.926F, 2, 1, 1, 0.0F, false));

        this.Mouth_upper_r1 = new AdvancedModelRenderer(this);
        this.Mouth_upper_r1.setRotationPoint(0.43F, 1.08F, -5.2F);
        this.Cephalon.addChild(Mouth_upper_r1);
        this.setRotateAngle(Mouth_upper_r1, -0.2531F, 0.0F, 0.0F);
        this.Mouth_upper_r1.cubeList.add(new ModelBox(Mouth_upper_r1, 35, 6, -0.49F, -1.351F, -0.392F, 1, 1, 4, 0.01F, false));

        this.Foreheadtop_r1 = new AdvancedModelRenderer(this);
        this.Foreheadtop_r1.setRotationPoint(0.43F, -3.33F, -2.26F);
        this.Cephalon.addChild(Foreheadtop_r1);
        this.setRotateAngle(Foreheadtop_r1, -1.0297F, 0.0F, 0.0F);
        this.Foreheadtop_r1.cubeList.add(new ModelBox(Foreheadtop_r1, 21, 0, -0.49F, -3.4477F, -0.8149F, 1, 4, 2, -0.01F, false));

        this.Forehead_r1 = new AdvancedModelRenderer(this);
        this.Forehead_r1.setRotationPoint(0.43F, -0.39F, -5.2F);
        this.Cephalon.addChild(Forehead_r1);
        this.setRotateAngle(Forehead_r1, -0.5411F, 0.0F, 0.0F);
        this.Forehead_r1.cubeList.add(new ModelBox(Forehead_r1, 0, 36, -0.49F, -3.93F, 0.0F, 1, 4, 3, 0.0F, false));

        this.Belly_start_r1 = new AdvancedModelRenderer(this);
        this.Belly_start_r1.setRotationPoint(-0.06F, 2.55F, -2.26F);
        this.Cephalon.addChild(Belly_start_r1);
        this.setRotateAngle(Belly_start_r1, -0.384F, 0.0F, 0.0F);
        this.Belly_start_r1.cubeList.add(new ModelBox(Belly_start_r1, 40, 32, 0.0F, -1.004F, -0.294F, 1, 1, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-0.637F, 2.55F, -0.3F);
        this.Cephalon.addChild(PectoralR);


        this.PectoralR_r1 = new AdvancedModelRenderer(this);
        this.PectoralR_r1.setRotationPoint(-0.06F, 0.0F, 0.0F);
        this.PectoralR.addChild(PectoralR_r1);
        this.setRotateAngle(PectoralR_r1, -1.2893F, -0.7981F, 0.5876F);
        this.PectoralR_r1.cubeList.add(new ModelBox(PectoralR_r1, 43, 9, 0.0F, -1.02F, -0.49F, 0, 2, 3, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.617F, 2.55F, -0.3F);
        this.Cephalon.addChild(PectoralL);


        this.PectoralL_r1 = new AdvancedModelRenderer(this);
        this.PectoralL_r1.setRotationPoint(-0.06F, 0.0F, 0.0F);
        this.PectoralL.addChild(PectoralL_r1);
        this.setRotateAngle(PectoralL_r1, -1.2893F, 0.7981F, -0.5876F);
        this.PectoralL_r1.cubeList.add(new ModelBox(PectoralL_r1, 13, 42, 0.0F, -1.02F, -0.49F, 0, 2, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.215F, -2.5F);
        this.Cephalon.addChild(Jaw);


        this.Jaw_r1 = new AdvancedModelRenderer(this);
        this.Jaw_r1.setRotationPoint(0.44F, 0.041F, 0.02F);
        this.Jaw.addChild(Jaw_r1);
        this.setRotateAngle(Jaw_r1, -0.2182F, 0.0F, 0.0F);
        this.Jaw_r1.cubeList.add(new ModelBox(Jaw_r1, 41, 22, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.Cephalon.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 22, 22, -0.56F, -4.97F, 0.09F, 2, 9, 4, 0.01F, false));

        this.Bellyslope_large_r1 = new AdvancedModelRenderer(this);
        this.Bellyslope_large_r1.setRotationPoint(0.63F, 4.03F, 0.09F);
        this.Body1.addChild(Bellyslope_large_r1);
        this.setRotateAngle(Bellyslope_large_r1, -0.3142F, 0.0F, 0.0F);
        this.Bellyslope_large_r1.cubeList.add(new ModelBox(Bellyslope_large_r1, 7, 0, -0.69F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Back_r1 = new AdvancedModelRenderer(this);
        this.Back_r1.setRotationPoint(-0.06F, -4.79F, 0.09F);
        this.Body1.addChild(Back_r1);
        this.setRotateAngle(Back_r1, 0.3316F, 0.0F, 0.0F);
        this.Back_r1.cubeList.add(new ModelBox(Back_r1, 31, 18, 0.0F, -0.483F, 0.0F, 1, 2, 4, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-0.49F, 4.03F, 3.52F);
        this.Body1.addChild(VentralR);


        this.VentralR_r1 = new AdvancedModelRenderer(this);
        this.VentralR_r1.setRotationPoint(-0.06F, 0.0F, 0.0F);
        this.VentralR.addChild(VentralR_r1);
        this.setRotateAngle(VentralR_r1, 0.0F, 0.0F, 0.6545F);
        this.VentralR_r1.cubeList.add(new ModelBox(VentralR_r1, 9, 37, 0.0F, -0.08F, -1.96F, 0, 4, 3, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(1.47F, 4.03F, 3.52F);
        this.Body1.addChild(VentralL);


        this.VentralL_r1 = new AdvancedModelRenderer(this);
        this.VentralL_r1.setRotationPoint(-0.06F, 0.0F, 0.0F);
        this.VentralL.addChild(VentralL_r1);
        this.setRotateAngle(VentralL_r1, 0.0F, 0.0F, -0.6545F);
        this.VentralL_r1.cubeList.add(new ModelBox(VentralL_r1, 19, 36, 0.0F, -0.08F, -1.96F, 0, 4, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.49F, -0.87F, 4.01F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 9, 22, -1.05F, -4.61F, 0.0F, 2, 10, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -0.55F, 4.5127F, 2.7314F, 1, 2, 1, -0.01F, false));

        this.Backslope_start_r1 = new AdvancedModelRenderer(this);
        this.Backslope_start_r1.setRotationPoint(-0.06F, -5.39F, 3.92F);
        this.Body2.addChild(Backslope_start_r1);
        this.setRotateAngle(Backslope_start_r1, -0.9425F, 0.0F, 0.0F);
        this.Backslope_start_r1.cubeList.add(new ModelBox(Backslope_start_r1, 28, 18, -0.49F, -0.222F, -0.881F, 1, 1, 2, 0.0F, false));

        this.Bellyslope_short_r1 = new AdvancedModelRenderer(this);
        this.Bellyslope_short_r1.setRotationPoint(0.21F, 6.37F, 0.0F);
        this.Body2.addChild(Bellyslope_short_r1);
        this.setRotateAngle(Bellyslope_short_r1, -0.1222F, 0.0F, 0.0F);
        this.Bellyslope_short_r1.cubeList.add(new ModelBox(Bellyslope_short_r1, 39, 0, -0.76F, -2.196F, -0.245F, 1, 2, 3, 0.0F, false));

        this.Back_horizontal_r1 = new AdvancedModelRenderer(this);
        this.Back_horizontal_r1.setRotationPoint(-0.06F, -4.41F, 2.94F);
        this.Body2.addChild(Back_horizontal_r1);
        this.setRotateAngle(Back_horizontal_r1, -0.0698F, 0.0F, 0.0F);
        this.Back_horizontal_r1.cubeList.add(new ModelBox(Back_horizontal_r1, 14, 0, -0.49F, -1.8075F, -0.4343F, 1, 2, 1, -0.01F, false));

        this.Back_peak_r1 = new AdvancedModelRenderer(this);
        this.Back_peak_r1.setRotationPoint(-0.06F, -4.41F, 0.0F);
        this.Body2.addChild(Back_peak_r1);
        this.setRotateAngle(Back_peak_r1, 0.1745F, 0.0F, 0.0F);
        this.Back_peak_r1.cubeList.add(new ModelBox(Back_peak_r1, 26, 40, -0.49F, -1.316F, -0.098F, 1, 2, 3, 0.0F, false));

        this.Bellytail_start_r1 = new AdvancedModelRenderer(this);
        this.Bellytail_start_r1.setRotationPoint(0.14F, 6.37F, 3.92F);
        this.Body2.addChild(Bellytail_start_r1);
        this.setRotateAngle(Bellytail_start_r1, 0.8727F, 0.0F, 0.0F);
        this.Bellytail_start_r1.cubeList.add(new ModelBox(Bellytail_start_r1, 36, 0, -0.69F, -1.049F, -0.196F, 1, 1, 1, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.92F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 26, -0.55F, -2.18F, 0.0F, 1, 6, 3, 0.02F, false));

        this.Dorsalfin_r1 = new AdvancedModelRenderer(this);
        this.Dorsalfin_r1.setRotationPoint(-0.06F, -5.88F, 0.0F);
        this.Body3.addChild(Dorsalfin_r1);
        this.setRotateAngle(Dorsalfin_r1, -1.0036F, 0.0F, 0.0F);
        this.Dorsalfin_r1.cubeList.add(new ModelBox(Dorsalfin_r1, 31, 32, 0.01F, -2.9F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Analfin_r1 = new AdvancedModelRenderer(this);
        this.Analfin_r1.setRotationPoint(-0.06F, 6.37F, 0.0F);
        this.Body3.addChild(Analfin_r1);
        this.setRotateAngle(Analfin_r1, 0.3927F, 0.0F, 0.0F);
        this.Analfin_r1.cubeList.add(new ModelBox(Analfin_r1, 0, 0, 0.01F, -4.3F, 0.0F, 0, 19, 6, 0.0F, false));

        this.Backslope_long_r1 = new AdvancedModelRenderer(this);
        this.Backslope_long_r1.setRotationPoint(-0.06F, -4.165F, 0.0F);
        this.Body3.addChild(Backslope_long_r1);
        this.setRotateAngle(Backslope_long_r1, -0.8639F, 0.0F, 0.0F);
        this.Backslope_long_r1.cubeList.add(new ModelBox(Backslope_long_r1, 28, 10, -0.49F, -0.9071F, -0.5726F, 1, 3, 4, 0.01F, false));

        this.Bellytail_long_r1 = new AdvancedModelRenderer(this);
        this.Bellytail_long_r1.setRotationPoint(0.14F, 5.145F, 0.49F);
        this.Body3.addChild(Bellytail_long_r1);
        this.setRotateAngle(Bellytail_long_r1, 0.6545F, 0.0F, 0.0F);
        this.Bellytail_long_r1.cubeList.add(new ModelBox(Bellytail_long_r1, 38, 15, -0.69F, -1.5369F, -0.4474F, 1, 2, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.98F, 3.05F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 35, 25, -0.55F, -1.53F, -0.6F, 1, 3, 3, 0.0F, false));

        this.Bellytail_end_r1 = new AdvancedModelRenderer(this);
        this.Bellytail_end_r1.setRotationPoint(-0.06F, 2.94F, -0.6F);
        this.Body4.addChild(Bellytail_end_r1);
        this.setRotateAngle(Bellytail_end_r1, 0.7854F, 0.0F, 0.0F);
        this.Bellytail_end_r1.cubeList.add(new ModelBox(Bellytail_end_r1, 18, 22, -0.49F, -0.853F, 0.329F, 1, 1, 2, -0.01F, false));

        this.Backslope_end_r1 = new AdvancedModelRenderer(this);
        this.Backslope_end_r1.setRotationPoint(-0.06F, -3.43F, -0.6F);
        this.Body4.addChild(Backslope_end_r1);
        this.setRotateAngle(Backslope_end_r1, -0.7418F, 0.0F, 0.0F);
        this.Backslope_end_r1.cubeList.add(new ModelBox(Backslope_end_r1, 37, 37, -0.49F, -0.13F, 0.2F, 1, 2, 3, -0.01F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.49F, 2.35F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 35, 43, -0.55F, -1.03F, 0.0F, 1, 2, 2, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 13, 0, -0.05F, -6.16F, 0.97F, 0, 14, 7, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Paranaichthys.render(f5 * 0.2F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Paranaichthys.rotateAngleY = (float) Math.toRadians(90);
        this.Paranaichthys.offsetX = -0.09F;
        this.Paranaichthys.offsetY = -0.24F;
        this.Paranaichthys.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.Paranaichthys.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3,this.Body4,this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.15F, -1.5, f2, 1);
            this.swing(Paranaichthys, speed, 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 1);
            this.flap(PectoralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.flap(PectoralR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 1);
            this.flap(VentralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.flap(VentralR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 1);
            this.swing(VentralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.swing(VentralR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            if (!e.isInWater()) {
                this.Paranaichthys.rotateAngleZ = (float) Math.toRadians(90);
                this.Paranaichthys.offsetY = 1.23F;
                this.bob(Paranaichthys, -speed, 5F, false, f2, 1);
            }
        }
    }
}
