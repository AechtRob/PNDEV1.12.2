package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoccoderma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinstart;
    private final AdvancedModelRenderer Tailmidupperslope;
    private final AdvancedModelRenderer Tailmidlowerslope;
    private final AdvancedModelRenderer Bodyendupperslope;
    private final AdvancedModelRenderer Dorsallobe;
    private final AdvancedModelRenderer Seconddorsalfin;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Firstdorsalfin;
    private final AdvancedModelRenderer Leftarm;
    private final AdvancedModelRenderer Leftpectoralfin;
    private final AdvancedModelRenderer Rightarm;
    private final AdvancedModelRenderer Rightpectoralfin;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer Headslopeupper;
    private final AdvancedModelRenderer Headslopelower;
    private final AdvancedModelRenderer Snoutbase;
    private final AdvancedModelRenderer Snoutfront;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Leftpupil;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Rightpupil;

    public ModelCoccoderma() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -8.2F, -4.0F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0848F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 48, -2.5F, -3.0F, -6.0F, 5, 10, 6, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.4F, -0.5F);
        this.Bodyfront.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0637F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 33, -2.0F, -2.0F, 0.0F, 4, 8, 6, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(-0.01F, 1.1F, 5.4F);
        this.Bodymiddle.addChild(Bodyend);
        this.setRotateAngle(Bodyend, -0.0213F, 0.0F, 0.0F);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 20, 43, -2.0F, -1.5F, 0.0F, 4, 6, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.Bodyend.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 33, 37, -1.5F, -2.0F, 0.0F, 3, 5, 4, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.6F, 3.5F);
        this.Tailbase.addChild(Tailmiddle);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 21, 34, -1.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.0F, 3.7F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0213F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 10, 7, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.01F, 0.0F, 3.9F);
        this.Tailend.addChild(Tailfinend);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 47, 1, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 54, 0, 0.0F, -4.5F, 0.0F, 0, 9, 5, 0.0F, false));

        this.Tailfinstart = new AdvancedModelRenderer(this);
        this.Tailfinstart.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.Tailmiddle.addChild(Tailfinstart);
        this.Tailfinstart.cubeList.add(new ModelBox(Tailfinstart, 56, 11, 0.0F, 0.0F, 0.0F, 0, 9, 4, 0.0F, false));

        this.Tailmidupperslope = new AdvancedModelRenderer(this);
        this.Tailmidupperslope.setRotationPoint(0.01F, -2.6F, 0.1F);
        this.Tailmiddle.addChild(Tailmidupperslope);
        this.setRotateAngle(Tailmidupperslope, -0.2546F, 0.0F, 0.0F);
        this.Tailmidupperslope.cubeList.add(new ModelBox(Tailmidupperslope, 43, 32, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tailmidlowerslope = new AdvancedModelRenderer(this);
        this.Tailmidlowerslope.setRotationPoint(-0.02F, 2.4F, 0.0F);
        this.Tailmiddle.addChild(Tailmidlowerslope);
        this.setRotateAngle(Tailmidlowerslope, 0.2335F, 0.0F, 0.0F);
        this.Tailmidlowerslope.cubeList.add(new ModelBox(Tailmidlowerslope, 44, 43, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Bodyendupperslope = new AdvancedModelRenderer(this);
        this.Bodyendupperslope.setRotationPoint(0.0F, -3.1F, 0.0F);
        this.Bodyend.addChild(Bodyendupperslope);
        this.setRotateAngle(Bodyendupperslope, -0.4245F, 0.0F, 0.0F);
        this.Bodyendupperslope.cubeList.add(new ModelBox(Bodyendupperslope, 30, 28, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Dorsallobe = new AdvancedModelRenderer(this);
        this.Dorsallobe.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.Bodyendupperslope.addChild(Dorsallobe);
        this.setRotateAngle(Dorsallobe, 1.04F, 0.0F, 0.0F);
        this.Dorsallobe.cubeList.add(new ModelBox(Dorsallobe, 1, 0, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Seconddorsalfin = new AdvancedModelRenderer(this);
        this.Seconddorsalfin.setRotationPoint(0.0F, 0.8F, 1.5F);
        this.Dorsallobe.addChild(Seconddorsalfin);
        this.setRotateAngle(Seconddorsalfin, -0.0848F, 0.0F, 0.0F);
        this.Seconddorsalfin.cubeList.add(new ModelBox(Seconddorsalfin, 43, 8, 0.0F, -1.5F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 4.6F, 1.0F);
        this.Bodyend.addChild(Analfin);
        this.setRotateAngle(Analfin, -0.6369F, 0.0F, 0.0F);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 42, 12, 0.0F, -3.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-0.3F, 6.0F, 0.8F);
        this.Bodymiddle.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0848F, -0.1485F, 0.6156F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 43, 22, 0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F, true));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(0.3F, 6.0F, 0.8F);
        this.Bodymiddle.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0848F, 0.1485F, -0.6156F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 43, 17, 0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Firstdorsalfin = new AdvancedModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -3.1F, -1.5F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.setRotateAngle(Firstdorsalfin, 0.8067F, 0.0F, 0.0F);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 39, 0, 0.0F, 0.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.Leftarm = new AdvancedModelRenderer(this);
        this.Leftarm.setRotationPoint(-2.5F, 5.0F, -4.0F);
        this.Bodyfront.addChild(Leftarm);
        this.setRotateAngle(Leftarm, -1.0613F, -0.2759F, 0.2122F);
        this.Leftarm.cubeList.add(new ModelBox(Leftarm, 17, 0, -0.5F, -1.0F, -0.5F, 1, 2, 3, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(-0.3F, 0.0F, 1.5F);
        this.Leftarm.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, 0.1061F, 0.1274F, 0.0F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 28, 0, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Rightarm = new AdvancedModelRenderer(this);
        this.Rightarm.setRotationPoint(2.5F, 5.0F, -4.0F);
        this.Bodyfront.addChild(Rightarm);
        this.setRotateAngle(Rightarm, -1.0613F, 0.2759F, -0.2122F);
        this.Rightarm.cubeList.add(new ModelBox(Rightarm, 8, 0, -0.5F, -1.0F, -0.5F, 1, 2, 3, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(0.3F, 0.0F, 1.5F);
        this.Rightarm.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, 0.1061F, -0.1274F, 0.0F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 17, 2, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Bodyfront.addChild(Headbase);
        this.setRotateAngle(Headbase, -0.0637F, 0.0F, 0.0F);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 23, 54, -3.0F, -2.0F, -4.5F, 6, 5, 5, 0.0F, false));

        this.Headslopeupper = new AdvancedModelRenderer(this);
        this.Headslopeupper.setRotationPoint(2.5F, -4.05F, 0.0F);
        this.Headbase.addChild(Headslopeupper);
        this.setRotateAngle(Headslopeupper, 0.4283F, 0.0F, 0.0F);
        this.Headslopeupper.cubeList.add(new ModelBox(Headslopeupper, 0, 14, -5.01F, 0.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.Headslopelower = new AdvancedModelRenderer(this);
        this.Headslopelower.setRotationPoint(2.5F, 6.0F, 0.7F);
        this.Headbase.addChild(Headslopelower);
        this.setRotateAngle(Headslopelower, -0.4671F, 0.0F, 0.0F);
        this.Headslopelower.cubeList.add(new ModelBox(Headslopelower, 0, 23, -5.01F, -3.0F, -6.0F, 5, 3, 6, 0.0F, false));

        this.Snoutbase = new AdvancedModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, -2.0F, -4.5F);
        this.Headbase.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.8067F, 0.0F, 0.0F);
        this.Snoutbase.cubeList.add(new ModelBox(Snoutbase, 18, 20, -2.5F, 0.0F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Snoutfront = new AdvancedModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.Snoutbase.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, -1.3373F, 0.0F, 0.0F);
        this.Snoutfront.cubeList.add(new ModelBox(Snoutfront, 48, 38, -2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 3.7F, -2.7F);
        this.Headbase.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.4671F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 16, 11, -2.0F, -0.5F, -5.0F, 4, 1, 6, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.2F, 0.0F, -3.0F);
        this.Headbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.0F, -0.1698F, 0.0F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 26, 0, -2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.Leftpupil = new AdvancedModelRenderer(this);
        this.Leftpupil.setRotationPoint(-1.05F, 0.0F, 0.0F);
        this.Lefteye.addChild(Leftpupil);
        this.Leftpupil.cubeList.add(new ModelBox(Leftpupil, 0, 10, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(1.2F, 0.0F, -3.0F);
        this.Headbase.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0F, 0.1698F, 0.0F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 0, 5, 0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.Rightpupil = new AdvancedModelRenderer(this);
        this.Rightpupil.setRotationPoint(1.05F, 0.0F, 0.0F);
        this.Righteye.addChild(Rightpupil);
        this.Rightpupil.cubeList.add(new ModelBox(Rightpupil, 0, 13, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.17F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = -0.1F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.14F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Bodyfront.offsetY = 1.3F;

        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailend};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.1F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(Lowerjaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
        this.swing(Rightpectoralfin, (float) (speed * 0.75), -0.1F, true, 0, 0, f2, 1);

        this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(Rightpelvicfin, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            //this.Bodyfront.offsetY = 1.32F;
            this.bob(root, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

}

