package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTitanicthys extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Lfin;
    public AdvancedModelRenderer Rfin;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Bottomneck;
    public AdvancedModelRenderer Jaw;
    public AdvancedModelRenderer Leye;
    public AdvancedModelRenderer Reye;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer DorsalFin;
    public AdvancedModelRenderer LBfin;
    public AdvancedModelRenderer RBfin;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer Tailfin;

    public ModelTitanicthys() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Tailfin = new AdvancedModelRenderer(this, 144, 17);
        this.Tailfin.mirror = true;
        this.Tailfin.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Tailfin.addBox(0.0F, 0.0F, 0.0F, 0, 30, 52, 0.0F);
        this.setRotateAngle(Tailfin, 0.1806415842393158F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 8, 56);
        this.Tail3.setRotationPoint(0.0F, 1.4F, 24.0F);
        this.Tail3.addBox(-6.5F, 0.0F, 0.0F, 13, 17, 16, 0.0F);
        this.setRotateAngle(Tail3, 0.020943951856169794F, 0.0F, 0.0F);
        this.Bottomneck = new AdvancedModelRenderer(this, 150, 197);
        this.Bottomneck.setRotationPoint(0.0F, 8.1F, -13.8F);
        this.Bottomneck.addBox(-8.5F, 0.0F, -1.5F, 17, 5, 14, 0.0F);
        this.setRotateAngle(Bottomneck, -0.19547687289441354F, 0.0F, 0.0F);
        this.Rfin = new AdvancedModelRenderer(this, 77, 130);
        this.Rfin.setRotationPoint(-10.0F, 12.9F, -2.5F);
        this.Rfin.addBox(-27.0F, 0.0F, -7.5F, 27, 0, 16, 0.0F);
        this.setRotateAngle(Rfin, 0.0F, 0.1563815016444822F, -1.1728612040769677F);
        this.Tail5 = new AdvancedModelRenderer(this, 87, 16);
        this.Tail5.setRotationPoint(0.0F, 0.7F, 12.7F);
        this.Tail5.addBox(-4.5F, 0.0F, 0.0F, 9, 13, 15, 0.0F);
        this.setRotateAngle(Tail5, 0.12164944520215827F, 0.0F, 0.0F);
        this.Leye = new AdvancedModelRenderer(this, 204, 200);
        this.Leye.mirror = true;
        this.Leye.setRotationPoint(7.7F, -13.0F, -11.8F);
        this.Leye.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Leye, -0.7428121536172364F, 0.0F, 0.0F);
        this.DorsalFin = new AdvancedModelRenderer(this, 90, 122);
        this.DorsalFin.mirror = true;
        this.DorsalFin.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.DorsalFin.addBox(0.0F, 0.0F, 0.0F, 0, 21, 27, 0.0F);
        this.setRotateAngle(DorsalFin, 1.2100368023656016F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 99, 216);
        this.Neck.setRotationPoint(0.0F, -0.1F, -11.5F);
        this.Neck.addBox(-9.0F, -10.5F, -11.5F, 18, 22, 14, 0.0F);
        this.setRotateAngle(Neck, 0.2216568116743285F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 6, 12);
        this.Tail4.setRotationPoint(0.0F, 1.0F, 14.0F);
        this.Tail4.addBox(-5.5F, 0.0F, 0.0F, 11, 14, 15, 0.0F);
        this.setRotateAngle(Tail4, 0.07679448875222618F, 0.0F, 0.0F);
        this.LBfin = new AdvancedModelRenderer(this, 124, 173);
        this.LBfin.mirror = true;
        this.LBfin.setRotationPoint(3.0F, 21.5F, 5.0F);
        this.LBfin.addBox(0.0F, 0.0F, -2.0F, 12, 0, 12, 0.0F);
        this.setRotateAngle(LBfin, 0.0F, -0.11728612207217244F, 1.3292428222347474F);
        this.Head = new AdvancedModelRenderer(this, 166, 219);
        this.Head.setRotationPoint(0.0F, 3.2F, -3.0F);
        this.Head.addBox(-8.0F, -16.0F, -16.0F, 16, 17, 16, 0.0F);
        this.setRotateAngle(Head, 0.5314527705480788F, 0.0F, 0.0F);
        this.Tail6 = new AdvancedModelRenderer(this, 163, 10);
        this.Tail6.setRotationPoint(0.0F, 7.1F, 13.9F);
        this.Tail6.addBox(-2.5F, -7.0F, 0.0F, 5, 7, 35, 0.0F);
        this.setRotateAngle(Tail6, 0.6382669021280042F, 0.0F, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 5, 201);
        this.Body.setRotationPoint(0.0F, 8.0F, -10.0F);
        this.Body.addBox(-10.5F, -11.0F, -12.0F, 21, 27, 24, 0.0F);
        this.setRotateAngle(Body, 0.05881759379483809F, 0.0F, 0.0F);
        this.RBfin = new AdvancedModelRenderer(this, 94, 173);
        this.RBfin.setRotationPoint(-3.0F, 21.5F, 5.0F);
        this.RBfin.addBox(-12.0F, 0.0F, -2.0F, 12, 0, 12, 0.0F);
        this.setRotateAngle(RBfin, 0.0F, 0.11728612207217244F, -1.3292428222347474F);
        this.Lfin = new AdvancedModelRenderer(this, 77, 187);
        this.Lfin.mirror = true;
        this.Lfin.setRotationPoint(10.0F, 12.9F, -2.5F);
        this.Lfin.addBox(0.0F, 0.0F, -7.5F, 27, 0, 16, 0.0F);
        this.setRotateAngle(Lfin, 0.0F, -0.1563815016444822F, 1.1728612040769677F);
        this.Analfin = new AdvancedModelRenderer(this, 0, 0);
        this.Analfin.setRotationPoint(0.0F, 16.5F, 8.5F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 8, 10, 0.0F);
        this.setRotateAngle(Analfin, 0.03263765709551775F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 7, 153);
        this.Tail1.setRotationPoint(0.0F, -10.5F, 11.5F);
        this.Tail1.addBox(-9.0F, 0.0F, 0.0F, 18, 25, 22, 0.0F);
        this.setRotateAngle(Tail1, -0.11693705655466871F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 6, 104);
        this.Tail2.setRotationPoint(0.0F, 0.4F, 21.0F);
        this.Tail2.addBox(-7.5F, 0.0F, 0.0F, 15, 22, 26, 0.0F);
        this.setRotateAngle(Tail2, -0.08063420944476721F, 0.0F, 0.0F);
        this.Reye = new AdvancedModelRenderer(this, 204, 200);
        this.Reye.setRotationPoint(-7.7F, -13.0F, -11.8F);
        this.Reye.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reye, -0.7428121536172364F, 0.0F, 0.0F);
        this.Jaw = new AdvancedModelRenderer(this, 209, 191);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -13.5F);
        this.Jaw.addBox(-8.0F, -16.0F, -3.0F, 16, 16, 3, 0.1F);
        this.setRotateAngle(Jaw, 0.14748031846456947F, 0.0F, 0.0F);
        this.Tail6.addChild(this.Tailfin);
        this.Tail2.addChild(this.Tail3);
        this.Neck.addChild(this.Bottomneck);
        this.Body.addChild(this.Rfin);
        this.Tail4.addChild(this.Tail5);
        this.Head.addChild(this.Leye);
        this.Tail2.addChild(this.DorsalFin);
        this.Body.addChild(this.Neck);
        this.Tail3.addChild(this.Tail4);
        this.Tail2.addChild(this.LBfin);
        this.Neck.addChild(this.Head);
        this.Tail5.addChild(this.Tail6);
        this.Tail2.addChild(this.RBfin);
        this.Body.addChild(this.Lfin);
        this.Tail3.addChild(this.Analfin);
        this.Body.addChild(this.Tail1);
        this.Tail1.addChild(this.Tail2);
        this.Head.addChild(this.Reye);
        this.Head.addChild(this.Jaw);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.85F);
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

        AdvancedModelRenderer[] fishTail = {this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};

        float speed = 0.1F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //this.Neck.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.Neck.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.4F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(Body, speed, 0.3F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(Body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(Lfin, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(Lfin, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(Rfin, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(Rfin, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(LBfin, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(LBfin, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(RBfin, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(RBfin, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = 0.7F;
            this.bob(Body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }
}
