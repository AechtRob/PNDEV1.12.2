package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParnaibaia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailupperslope;
    private final AdvancedModelRenderer Taillowerslope;
    private final AdvancedModelRenderer Tailfinstart;
    private final AdvancedModelRenderer Backslopeend;
    private final AdvancedModelRenderer Dorsallobe;
    private final AdvancedModelRenderer Seconddorsalfin;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Backslopemiddle;
    private final AdvancedModelRenderer Bellyslopemiddle;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Firstdorsalfin;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer Headslopeupper;
    private final AdvancedModelRenderer Headslopelower;
    private final AdvancedModelRenderer Snoutbase;
    private final AdvancedModelRenderer Snoutfront;
    private final AdvancedModelRenderer Snoutfrontslope;
    private final AdvancedModelRenderer Jawpiece;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Leftmasseter;
    private final AdvancedModelRenderer Lowerjawslope;
    private final AdvancedModelRenderer Leftarm;
    private final AdvancedModelRenderer Leftpectoralfin;
    private final AdvancedModelRenderer Rightarm;
    private final AdvancedModelRenderer Rightpectoralfin;

    public ModelParnaibaia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -5.2F, 1.0F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 48, -2.5F, -3.0F, -6.0F, 5, 8, 8, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, 0.5F, 1.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 35, -2.5F, -3.0F, 0.0F, 5, 7, 5, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 0.4F, 4.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 0, 24, -2.0F, -2.5F, 0.0F, 4, 6, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.01F, 0.51F, 3.5F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 13, -2.0F, -3.0F, 0.0F, 4, 6, 4, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 46, 48, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.01F, 3.5F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 48, 56, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.0F, 4.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 33, 45, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.Tailend.addChild(Tailfinend);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 43, 10, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.01F, -0.1F, 0.0F);
        this.Tailmiddleend.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 52, 0, 0.0F, -5.0F, 0.0F, 0, 10, 6, 0.0F, false));

        this.Tailupperslope = new AdvancedModelRenderer(this);
        this.Tailupperslope.setRotationPoint(0.0F, -3.25F, 0.3F);
        this.Tailmiddlebase.addChild(Tailupperslope);
        this.setRotateAngle(Tailupperslope, -0.4458F, 0.0F, 0.0F);
        this.Tailupperslope.cubeList.add(new ModelBox(Tailupperslope, 13, 21, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Taillowerslope = new AdvancedModelRenderer(this);
        this.Taillowerslope.setRotationPoint(0.0F, 2.75F, 0.2F);
        this.Tailmiddlebase.addChild(Taillowerslope);
        this.setRotateAngle(Taillowerslope, 0.3396F, 0.0F, 0.0F);
        this.Taillowerslope.cubeList.add(new ModelBox(Taillowerslope, 0, 6, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tailfinstart = new AdvancedModelRenderer(this);
        this.Tailfinstart.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinstart);
        this.Tailfinstart.cubeList.add(new ModelBox(Tailfinstart, 43, 0, 0.0F, -4.5F, 0.0F, 0, 9, 4, 0.0F, false));

        this.Backslopeend = new AdvancedModelRenderer(this);
        this.Backslopeend.setRotationPoint(0.0F, -3.5F, 0.1F);
        this.Bodyend.addChild(Backslopeend);
        this.setRotateAngle(Backslopeend, -0.2546F, 0.0F, 0.0F);
        this.Backslopeend.cubeList.add(new ModelBox(Backslopeend, 44, 26, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.Dorsallobe = new AdvancedModelRenderer(this);
        this.Dorsallobe.setRotationPoint(0.0F, 0.2F, 2.7F);
        this.Backslopeend.addChild(Dorsallobe);
        this.setRotateAngle(Dorsallobe, -0.1698F, 0.0F, 0.0F);
        this.Dorsallobe.cubeList.add(new ModelBox(Dorsallobe, 34, 0, -0.5F, -2.0F, -0.5F, 1, 2, 2, 0.0F, false));

        this.Seconddorsalfin = new AdvancedModelRenderer(this);
        this.Seconddorsalfin.setRotationPoint(0.0F, -1.75F, -0.2F);
        this.Dorsallobe.addChild(Seconddorsalfin);
        this.setRotateAngle(Seconddorsalfin, -0.1698F, 0.0F, 0.0F);
        this.Seconddorsalfin.cubeList.add(new ModelBox(Seconddorsalfin, 36, 8, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 3.3F, 2.4F);
        this.Bodyend.addChild(Analfin);
        this.setRotateAngle(Analfin, 0.1061F, 0.0F, 0.0F);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 32, 0, 0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Backslopemiddle = new AdvancedModelRenderer(this);
        this.Backslopemiddle.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.Bodymiddle.addChild(Backslopemiddle);
        this.setRotateAngle(Backslopemiddle, -0.0991F, 0.0F, 0.0F);
        this.Backslopemiddle.cubeList.add(new ModelBox(Backslopemiddle, 16, 30, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Bellyslopemiddle = new AdvancedModelRenderer(this);
        this.Bellyslopemiddle.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Bodymiddle.addChild(Bellyslopemiddle);
        this.setRotateAngle(Bellyslopemiddle, 0.0848F, 0.0F, 0.0F);
        this.Bellyslopemiddle.cubeList.add(new ModelBox(Bellyslopemiddle, 41, 41, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-0.5F, -0.2F, 1.0F);
        this.Bellyslopemiddle.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.3396F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 43, 14, 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(0.5F, -0.2F, 1.0F);
        this.Bellyslopemiddle.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.3396F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 34, 12, 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Firstdorsalfin = new AdvancedModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.setRotateAngle(Firstdorsalfin, -0.3821F, 0.0F, 0.0F);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 54, 12, 0.0F, -5.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 0.7F, -4.8F);
        this.Bodyfront.addChild(Headbase);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 27, 55, -3.0F, -2.0F, -4.0F, 6, 5, 4, 0.0F, false));

        this.Headslopeupper = new AdvancedModelRenderer(this);
        this.Headslopeupper.setRotationPoint(-0.01F, -3.7F, -1.2F);
        this.Headbase.addChild(Headslopeupper);
        this.setRotateAngle(Headslopeupper, 0.603F, 0.0F, 0.0F);
        this.Headslopeupper.cubeList.add(new ModelBox(Headslopeupper, 36, 35, -2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Headslopelower = new AdvancedModelRenderer(this);
        this.Headslopelower.setRotationPoint(0.01F, 4.3F, -1.2F);
        this.Headbase.addChild(Headslopelower);
        this.setRotateAngle(Headslopelower, -0.4402F, 0.0F, 0.0F);
        this.Headslopelower.cubeList.add(new ModelBox(Headslopelower, 30, 29, -2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Snoutbase = new AdvancedModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Headbase.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.3183F, 0.0F, 0.0F);
        this.Snoutbase.cubeList.add(new ModelBox(Snoutbase, 26, 23, -2.5F, 0.0F, -2.0F, 5, 3, 2, 0.0F, false));

        this.Snoutfront = new AdvancedModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Snoutbase.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, -0.4033F, 0.0F, 0.0F);
        this.Snoutfront.cubeList.add(new ModelBox(Snoutfront, 22, 17, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Snoutfrontslope = new AdvancedModelRenderer(this);
        this.Snoutfrontslope.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.Snoutfront.addChild(Snoutfrontslope);
        this.setRotateAngle(Snoutfrontslope, 0.3396F, 0.0F, 0.0F);
        this.Snoutfrontslope.cubeList.add(new ModelBox(Snoutfrontslope, 13, 11, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Jawpiece = new AdvancedModelRenderer(this);
        this.Jawpiece.setRotationPoint(0.01F, 3.0F, -2.0F);
        this.Snoutbase.addChild(Jawpiece);
        this.setRotateAngle(Jawpiece, -0.8278F, 0.0F, 0.0F);
        this.Jawpiece.cubeList.add(new ModelBox(Jawpiece, 41, 22, -2.5F, -1.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-2.45F, 1.1F, -1.87F);
        this.Snoutbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.2759F, -0.2546F, 0.0637F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 1, 0, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(2.45F, 1.1F, -1.87F);
        this.Snoutbase.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.2759F, 0.2546F, -0.0637F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 8, 0, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(-0.01F, 2.64F, -3.05F);
        this.Headbase.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0848F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 21, 37, -2.0F, -1.0F, -5.0F, 4, 1, 6, 0.0F, false));

        this.Leftmasseter = new AdvancedModelRenderer(this);
        this.Leftmasseter.setRotationPoint(0.01F, -1.0F, -2.3F);
        this.Lowerjaw.addChild(Leftmasseter);
        this.setRotateAngle(Leftmasseter, 0.5095F, 0.0F, 0.0F);
        this.Leftmasseter.cubeList.add(new ModelBox(Leftmasseter, 9, 4, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(0.01F, 0.0F, -5.0F);
        this.Lowerjaw.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.1485F, 0.0F, 0.0F);
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 19, 46, -1.5F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.Leftarm = new AdvancedModelRenderer(this);
        this.Leftarm.setRotationPoint(-2.5F, 2.3F, -4.5F);
        this.Bodyfront.addChild(Leftarm);
        this.setRotateAngle(Leftarm, 0.0848F, -0.4245F, 0.0F);
        this.Leftarm.cubeList.add(new ModelBox(Leftarm, 27, 0, -0.1F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.Leftarm.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, 0.1485F, 0.0424F, 0.0F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 27, 8, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Rightarm = new AdvancedModelRenderer(this);
        this.Rightarm.setRotationPoint(2.5F, 2.3F, -4.5F);
        this.Bodyfront.addChild(Rightarm);
        this.setRotateAngle(Rightarm, 0.0848F, 0.4245F, 0.0F);
        this.Rightarm.cubeList.add(new ModelBox(Rightarm, 20, 0, -0.9F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.Rightarm.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, 0.1485F, -0.0424F, 0.0F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 23, 4, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));
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
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.088F;
        this.root.offsetZ = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.4F, 0.0F);
        this.root.offsetY = -0.14F;
        this.root.offsetZ = -0.05F;
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

        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend, this.Tailfinend};

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

        this.walk(Leftarm, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.swing(Leftarm, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.walk(Rightarm, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
        this.swing(Rightarm, (float) (speed * 0.75), -0.1F, true, 0, 0, f2, 1);

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

