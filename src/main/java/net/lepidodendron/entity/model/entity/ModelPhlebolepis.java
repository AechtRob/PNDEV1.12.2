package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPhlebolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Headback;
    private final AdvancedModelRenderer Headmiddle;
    private final AdvancedModelRenderer Headfront;
    private final AdvancedModelRenderer Headfronttop;
    private final AdvancedModelRenderer Headfrontunderside;
    private final AdvancedModelRenderer Headmiddletop;
    private final AdvancedModelRenderer Headmiddleunderside;
    private final AdvancedModelRenderer Leftorbit;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Rightorbit;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinendedgea;
    private final AdvancedModelRenderer Tailfinendedgeb;
    private final AdvancedModelRenderer Tailfintop;
    private final AdvancedModelRenderer Tailfintopedge;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Dorsalfinend;
    private final AdvancedModelRenderer Dorsalfinendedge;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Dorsalfinbase;
    private final AdvancedModelRenderer Headbacktop;
    private final AdvancedModelRenderer Headbackunderside;
    private final AdvancedModelRenderer Leftpectoralbase;
    private final AdvancedModelRenderer Leftpectoralend;
    private final AdvancedModelRenderer Rightpectoralbase;
    private final AdvancedModelRenderer Rightpectoralend;

    public ModelPhlebolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.825F, 0.0F);


        this.Headback = new AdvancedModelRenderer(this);
        this.Headback.setRotationPoint(0.0F, 20.3F, 0.0F);
        this.root.addChild(Headback);
        this.Headback.cubeList.add(new ModelBox(Headback, 0, 54, -4.0F, -2.5F, -5.0F, 8, 5, 5, 0.0F, false));

        this.Headmiddle = new AdvancedModelRenderer(this);
        this.Headmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Headback.addChild(Headmiddle);
        this.Headmiddle.cubeList.add(new ModelBox(Headmiddle, 23, 48, -3.5F, -2.0F, -2.3F, 7, 4, 3, 0.0F, false));

        this.Headfront = new AdvancedModelRenderer(this);
        this.Headfront.setRotationPoint(0.0F, 0.1F, -2.1F);
        this.Headmiddle.addChild(Headfront);
        this.Headfront.cubeList.add(new ModelBox(Headfront, 25, 30, -2.5F, -1.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Headfronttop = new AdvancedModelRenderer(this);
        this.Headfronttop.setRotationPoint(-0.01F, -2.1F, -0.2F);
        this.Headfront.addChild(Headfronttop);
        this.setRotateAngle(Headfronttop, 0.3609F, 0.0F, 0.0F);
        this.Headfronttop.cubeList.add(new ModelBox(Headfronttop, 25, 24, -2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Headfrontunderside = new AdvancedModelRenderer(this);
        this.Headfrontunderside.setRotationPoint(0.01F, 1.9F, -0.1F);
        this.Headfront.addChild(Headfrontunderside);
        this.setRotateAngle(Headfrontunderside, -0.31F, 0.0F, 0.0F);
        this.Headfrontunderside.cubeList.add(new ModelBox(Headfrontunderside, 42, 59, -2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.Headmiddletop = new AdvancedModelRenderer(this);
        this.Headmiddletop.setRotationPoint(0.0F, -2.6F, 0.7F);
        this.Headmiddle.addChild(Headmiddletop);
        this.setRotateAngle(Headmiddletop, 0.2087F, 0.0F, 0.0F);
        this.Headmiddletop.cubeList.add(new ModelBox(Headmiddletop, 22, 19, -3.0F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.Headmiddleunderside = new AdvancedModelRenderer(this);
        this.Headmiddleunderside.setRotationPoint(0.0F, 2.6F, 0.7F);
        this.Headmiddle.addChild(Headmiddleunderside);
        this.setRotateAngle(Headmiddleunderside, -0.2086F, 0.0F, 0.0F);
        this.Headmiddleunderside.cubeList.add(new ModelBox(Headmiddleunderside, 20, 12, -3.0F, -1.0F, -3.075F, 6, 1, 3, -0.01F, false));

        this.Leftorbit = new AdvancedModelRenderer(this);
        this.Leftorbit.setRotationPoint(-3.5F, 0.0F, -2.3F);
        this.Headmiddle.addChild(Leftorbit);
        this.setRotateAngle(Leftorbit, 0.0F, -0.3609F, 0.0F);
        this.Leftorbit.cubeList.add(new ModelBox(Leftorbit, 39, 33, 0.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(0.4F, 0.0F, -0.7F);
        this.Leftorbit.addChild(Lefteye);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 45, 10, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Rightorbit = new AdvancedModelRenderer(this);
        this.Rightorbit.setRotationPoint(3.5F, 0.0F, -2.3F);
        this.Headmiddle.addChild(Rightorbit);
        this.setRotateAngle(Rightorbit, 0.0F, 0.3609F, 0.0F);
        this.Rightorbit.cubeList.add(new ModelBox(Rightorbit, 39, 27, -2.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(-0.4F, 0.0F, -0.7F);
        this.Rightorbit.addChild(Righteye);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 49, 12, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.57F, -0.5F);
        this.Headback.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 42, -3.0F, -2.5F, 0.3F, 6, 6, 5, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 31, -2.0F, -2.5F, 0.0F, 4, 6, 4, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 27, 56, -1.5F, -1.5F, 0.0F, 3, 4, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.5F, 3.3F);
        this.Bodyend.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1485F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 23, 39, -1.0F, -2.0F, 0.0F, 2, 4, 4, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(-0.01F, 0.4F, 3.6F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.0424F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 43, 52, -1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0213F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 43, 45, -0.5F, -1.0F, -0.5F, 1, 2, 4, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.01F, -2.0F, -0.1F);
        this.Tailend.addChild(Tailfinmiddle);
        this.setRotateAngle(Tailfinmiddle, -0.2759F, 0.0F, 0.0F);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 39, 21, -0.5F, 0.0F, -0.5F, 1, 1, 4, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(-0.01F, 0.0F, 2.7F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, 0.0424F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 11, 2, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Tailfinendedgea = new AdvancedModelRenderer(this);
        this.Tailfinendedgea.setRotationPoint(0.0F, 0.2F, 2.0F);
        this.Tailfinend.addChild(Tailfinendedgea);
        this.setRotateAngle(Tailfinendedgea, -2.3775F, 0.0F, 0.0F);
        this.Tailfinendedgea.cubeList.add(new ModelBox(Tailfinendedgea, 0, 2, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Tailfinendedgeb = new AdvancedModelRenderer(this);
        this.Tailfinendedgeb.setRotationPoint(-0.01F, -0.4F, 1.8F);
        this.Tailfinend.addChild(Tailfinendedgeb);
        this.setRotateAngle(Tailfinendedgeb, -0.1061F, 0.0F, 0.0F);
        this.Tailfinendedgeb.cubeList.add(new ModelBox(Tailfinendedgeb, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Tailfintop = new AdvancedModelRenderer(this);
        this.Tailfintop.setRotationPoint(0.0F, -3.2F, -0.6F);
        this.Tailmiddle.addChild(Tailfintop);
        this.setRotateAngle(Tailfintop, 0.2122F, 0.0F, 0.0F);
        this.Tailfintop.cubeList.add(new ModelBox(Tailfintop, 32, 36, -0.5F, 0.0F, 0.325F, 1, 3, 3, 0.0F, false));

        this.Tailfintopedge = new AdvancedModelRenderer(this);
        this.Tailfintopedge.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.Tailfintop.addChild(Tailfintopedge);
        this.setRotateAngle(Tailfintopedge, -0.0637F, 0.0F, 0.0F);
        this.Tailfintopedge.cubeList.add(new ModelBox(Tailfintopedge, 0, 8, 0.0F, 0.0F, 0.275F, 0, 4, 1, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.0F, -2.0F, 0.77F);
        this.Tailbase.addChild(Tailfinbase);
        this.setRotateAngle(Tailfinbase, 0.3183F, 0.0F, 0.0F);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 31, 7, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(-0.01F, -2.95F, 0.0F);
        this.Bodyend.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, 0.0848F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 24, 6, -0.5F, 0.0F, 0.175F, 1, 3, 2, -0.01F, false));

        this.Dorsalfinendedge = new AdvancedModelRenderer(this);
        this.Dorsalfinendedge.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Dorsalfinend.addChild(Dorsalfinendedge);
        this.setRotateAngle(Dorsalfinendedge, 0.5519F, 0.0F, 0.0F);
        this.Dorsalfinendedge.cubeList.add(new ModelBox(Dorsalfinendedge, 0, 4, 0.0F, 0.0F, -1.0F, 0, 3, 1, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 3.5F, -0.3F);
        this.Bodyend.addChild(Analfin);
        this.setRotateAngle(Analfin, -0.1698F, 0.0F, 0.0F);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 17, 31, -0.5F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.Dorsalfinbase = new AdvancedModelRenderer(this);
        this.Dorsalfinbase.setRotationPoint(0.0F, -2.5F, 1.0F);
        this.Bodymiddle.addChild(Dorsalfinbase);
        this.setRotateAngle(Dorsalfinbase, 0.1698F, 0.0F, 0.0F);
        this.Dorsalfinbase.cubeList.add(new ModelBox(Dorsalfinbase, 38, 40, -0.5F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.Headbacktop = new AdvancedModelRenderer(this);
        this.Headbacktop.setRotationPoint(0.0F, -3.1F, 0.0F);
        this.Headback.addChild(Headbacktop);
        this.setRotateAngle(Headbacktop, 0.1148F, 0.0F, 0.0F);
        this.Headbacktop.cubeList.add(new ModelBox(Headbacktop, 0, 12, -3.5F, 0.0F, -5.0F, 7, 3, 5, 0.0F, false));

        this.Headbackunderside = new AdvancedModelRenderer(this);
        this.Headbackunderside.setRotationPoint(-0.01F, 2.95F, 0.0F);
        this.Headback.addChild(Headbackunderside);
        this.setRotateAngle(Headbackunderside, -0.0848F, 0.0F, 0.0F);
        this.Headbackunderside.cubeList.add(new ModelBox(Headbackunderside, 0, 21, -3.5F, -4.0F, -5.0F, 7, 4, 5, 0.0F, false));

        this.Leftpectoralbase = new AdvancedModelRenderer(this);
        this.Leftpectoralbase.setRotationPoint(-3.95F, 0.8F, -4.8F);
        this.Headback.addChild(Leftpectoralbase);
        this.setRotateAngle(Leftpectoralbase, -0.1061F, -0.4458F, -0.0637F);
        this.Leftpectoralbase.cubeList.add(new ModelBox(Leftpectoralbase, 38, 15, 0.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Leftpectoralend = new AdvancedModelRenderer(this);
        this.Leftpectoralend.setRotationPoint(0.0F, 0.01F, 4.0F);
        this.Leftpectoralbase.addChild(Leftpectoralend);
        this.setRotateAngle(Leftpectoralend, 0.0F, 0.3609F, 0.0F);
        this.Leftpectoralend.cubeList.add(new ModelBox(Leftpectoralend, 3, 9, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Rightpectoralbase = new AdvancedModelRenderer(this);
        this.Rightpectoralbase.setRotationPoint(3.95F, 0.8F, -4.8F);
        this.Headback.addChild(Rightpectoralbase);
        this.setRotateAngle(Rightpectoralbase, -0.1061F, 0.4458F, 0.0637F);
        this.Rightpectoralbase.cubeList.add(new ModelBox(Rightpectoralbase, 36, 9, -2.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Rightpectoralend = new AdvancedModelRenderer(this);
        this.Rightpectoralend.setRotationPoint(0.0F, 0.01F, 4.0F);
        this.Rightpectoralbase.addChild(Rightpectoralend);
        this.setRotateAngle(Rightpectoralend, 0.0F, -0.3609F, 0.0F);
        this.Rightpectoralend.cubeList.add(new ModelBox(Rightpectoralend, 3, 6, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

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
        this.root.offsetZ = -1.1F;
        this.root.offsetY = -0.22F;
        this.root.offsetX = -0.05F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Headmiddle, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Bodyend, -0.2F, 0.4F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.12F, 0.0F);
        this.root.offsetY = -0.35F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.root.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailend};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.Sclerodus.offsetY = 0.58F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
