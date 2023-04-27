package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGyrodus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer Dorsalslopeend;
    private final AdvancedModelRenderer Dorsalfinend;
    private final AdvancedModelRenderer Bellyslopeend;
    private final AdvancedModelRenderer Analfinend;
    private final AdvancedModelRenderer Dorsalslopemiddle;
    private final AdvancedModelRenderer Dorsalfinbase;
    private final AdvancedModelRenderer Bellyslopemiddle;
    private final AdvancedModelRenderer Analfinbase;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Headslopeback;
    private final AdvancedModelRenderer Headslopemiddle;
    private final AdvancedModelRenderer Headslopefront;
    private final AdvancedModelRenderer Throatslopeback;
    private final AdvancedModelRenderer Throatslopefront;
    private final AdvancedModelRenderer Upperlip;
    private final AdvancedModelRenderer Snoutslope;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Chinupper;
    private final AdvancedModelRenderer Chinlower;
    private final AdvancedModelRenderer Leftmasseter;
    private final AdvancedModelRenderer Rightmasseter;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Leftpupil;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Rightpupil;
    private final AdvancedModelRenderer Dorsalslopefront;
    private final AdvancedModelRenderer Bellyslopefront;
    private final AdvancedModelRenderer Leftpectoralfin;
    private final AdvancedModelRenderer Rightpectoralfin;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;

    public ModelGyrodus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 4.0F, 1.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 5.5F, -0.5F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0213F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 71, -2.0F, -8.5F, -6.5F, 4, 22, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.4F, 0.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 23, 71, -2.0F, -8.5F, 0.0F, 4, 23, 6, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 3.05F, 5.3F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 44, 81, -1.5F, -6.5F, 0.0F, 3, 13, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.2F, 5.2F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 44, 70, -1.0F, -2.5F, 0.0F, 2, 5, 5, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.01F, 0.0F, 4.3F);
        this.Tailbase.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 54, 68, -1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.Tailend.addChild(Tailfin);
        this.setRotateAngle(Tailfin, 0.0213F, 0.0F, 0.0F);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 42, 14, 0.0F, -9.5F, 0.0F, 0, 19, 11, 0.0F, false));

        this.Dorsalslopeend = new AdvancedModelRenderer(this);
        this.Dorsalslopeend.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Tailbase.addChild(Dorsalslopeend);
        this.setRotateAngle(Dorsalslopeend, -0.7325F, 0.0F, 0.0F);
        this.Dorsalslopeend.cubeList.add(new ModelBox(Dorsalslopeend, 27, 59, -0.5F, 0.0F, 0.0F, 1, 4, 7, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Dorsalslopeend.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, -0.1274F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 63, 14, 0.0F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));

        this.Bellyslopeend = new AdvancedModelRenderer(this);
        this.Bellyslopeend.setRotationPoint(0.0F, 6.3F, 0.2F);
        this.Tailbase.addChild(Bellyslopeend);
        this.setRotateAngle(Bellyslopeend, 0.7217F, 0.0F, 0.0F);
        this.Bellyslopeend.cubeList.add(new ModelBox(Bellyslopeend, 32, 40, -0.5F, -4.0F, 0.0F, 1, 4, 6, 0.0F, false));

        this.Analfinend = new AdvancedModelRenderer(this);
        this.Analfinend.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bellyslopeend.addChild(Analfinend);
        this.setRotateAngle(Analfinend, 0.0848F, 0.0F, 0.0F);
        this.Analfinend.cubeList.add(new ModelBox(Analfinend, 63, 17, 0.0F, 0.0F, 0.0F, 0, 1, 6, 0.0F, false));

        this.Dorsalslopemiddle = new AdvancedModelRenderer(this);
        this.Dorsalslopemiddle.setRotationPoint(0.0F, -11.5F, -0.2F);
        this.Bodyend.addChild(Dorsalslopemiddle);
        this.setRotateAngle(Dorsalslopemiddle, -0.7006F, 0.0F, 0.0F);
        this.Dorsalslopemiddle.cubeList.add(new ModelBox(Dorsalslopemiddle, 37, 51, -1.0F, 0.0F, 0.0F, 2, 4, 8, 0.0F, false));

        this.Dorsalfinbase = new AdvancedModelRenderer(this);
        this.Dorsalfinbase.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Dorsalslopemiddle.addChild(Dorsalfinbase);
        this.Dorsalfinbase.cubeList.add(new ModelBox(Dorsalfinbase, 63, 0, 0.0F, -6.0F, 0.0F, 0, 6, 7, 0.0F, false));

        this.Bellyslopemiddle = new AdvancedModelRenderer(this);
        this.Bellyslopemiddle.setRotationPoint(0.0F, 11.45F, 0.1F);
        this.Bodyend.addChild(Bellyslopemiddle);
        this.setRotateAngle(Bellyslopemiddle, 0.743F, 0.0F, 0.0F);
        this.Bellyslopemiddle.cubeList.add(new ModelBox(Bellyslopemiddle, 19, 46, -1.0F, -4.0F, 0.0F, 2, 4, 8, 0.0F, false));

        this.Analfinbase = new AdvancedModelRenderer(this);
        this.Analfinbase.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Bellyslopemiddle.addChild(Analfinbase);
        this.Analfinbase.cubeList.add(new ModelBox(Analfinbase, 63, 7, 0.0F, 0.0F, 0.0F, 0, 6, 7, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.3F, -6.5F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, 0.0424F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 54, -2.5F, -3.5F, -7.5F, 5, 8, 8, 0.0F, false));

        this.Headslopeback = new AdvancedModelRenderer(this);
        this.Headslopeback.setRotationPoint(-0.01F, -10.75F, 0.47F);
        this.Head.addChild(Headslopeback);
        this.setRotateAngle(Headslopeback, 0.5943F, 0.0F, 0.0F);
        this.Headslopeback.cubeList.add(new ModelBox(Headslopeback, 0, 41, -2.0F, 0.0F, -5.0F, 4, 7, 5, 0.0F, false));

        this.Headslopemiddle = new AdvancedModelRenderer(this);
        this.Headslopemiddle.setRotationPoint(0.02F, 0.0F, -5.0F);
        this.Headslopeback.addChild(Headslopemiddle);
        this.setRotateAngle(Headslopemiddle, 0.4671F, 0.0F, 0.0F);
        this.Headslopemiddle.cubeList.add(new ModelBox(Headslopemiddle, 0, 16, -2.0F, 0.0F, -4.0F, 4, 7, 4, 0.0F, false));

        this.Headslopefront = new AdvancedModelRenderer(this);
        this.Headslopefront.setRotationPoint(-0.01F, -3.5F, -7.5F);
        this.Head.addChild(Headslopefront);
        this.setRotateAngle(Headslopefront, 0.5732F, 0.0F, 0.0F);
        this.Headslopefront.cubeList.add(new ModelBox(Headslopefront, 0, 9, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.Throatslopeback = new AdvancedModelRenderer(this);
        this.Throatslopeback.setRotationPoint(-0.01F, 11.15F, -0.45F);
        this.Head.addChild(Throatslopeback);
        this.setRotateAngle(Throatslopeback, -0.6793F, 0.0F, 0.0F);
        this.Throatslopeback.cubeList.add(new ModelBox(Throatslopeback, 0, 28, -2.0F, -6.0F, -6.0F, 4, 6, 6, 0.0F, false));

        this.Throatslopefront = new AdvancedModelRenderer(this);
        this.Throatslopefront.setRotationPoint(0.02F, 0.0F, -6.0F);
        this.Throatslopeback.addChild(Throatslopefront);
        this.setRotateAngle(Throatslopefront, -0.2532F, 0.0F, 0.0F);
        this.Throatslopefront.cubeList.add(new ModelBox(Throatslopefront, 17, 37, -2.0F, -4.0F, -4.0F, 4, 4, 4, 0.0F, false));

        this.Upperlip = new AdvancedModelRenderer(this);
        this.Upperlip.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.Head.addChild(Upperlip);
        this.setRotateAngle(Upperlip, 0.0637F, 0.0F, 0.0F);
        this.Upperlip.cubeList.add(new ModelBox(Upperlip, 30, 11, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Snoutslope = new AdvancedModelRenderer(this);
        this.Snoutslope.setRotationPoint(-0.01F, 0.0F, -3.0F);
        this.Upperlip.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.7168F, 0.0F, 0.0F);
        this.Snoutslope.cubeList.add(new ModelBox(Snoutslope, 13, 11, -1.5F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.96F, -6.83F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.0637F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 31, 17, -1.5F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.Chinupper = new AdvancedModelRenderer(this);
        this.Chinupper.setRotationPoint(-0.01F, 0.5F, -3.5F);
        this.Lowerjaw.addChild(Chinupper);
        this.setRotateAngle(Chinupper, -0.3609F, 0.0F, 0.0F);
        this.Chinupper.cubeList.add(new ModelBox(Chinupper, 26, 5, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.Chinlower = new AdvancedModelRenderer(this);
        this.Chinlower.setRotationPoint(0.01F, 0.0F, 1.3F);
        this.Chinupper.addChild(Chinlower);
        this.setRotateAngle(Chinlower, -0.3609F, 0.0F, 0.0F);
        this.Chinlower.cubeList.add(new ModelBox(Chinlower, 15, 7, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Leftmasseter = new AdvancedModelRenderer(this);
        this.Leftmasseter.setRotationPoint(-1.49F, -0.5F, -1.7F);
        this.Lowerjaw.addChild(Leftmasseter);
        this.setRotateAngle(Leftmasseter, -0.658F, 0.0F, 0.0F);
        this.Leftmasseter.cubeList.add(new ModelBox(Leftmasseter, 25, 10, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.Rightmasseter = new AdvancedModelRenderer(this);
        this.Rightmasseter.setRotationPoint(1.49F, -0.5F, -1.7F);
        this.Lowerjaw.addChild(Rightmasseter);
        this.setRotateAngle(Rightmasseter, -0.658F, 0.0F, 0.0F);
        this.Rightmasseter.cubeList.add(new ModelBox(Rightmasseter, 28, 10, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-2.1F, -1.5F, -5.5F);
        this.Head.addChild(Lefteye);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 7, 4, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.Leftpupil = new AdvancedModelRenderer(this);
        this.Leftpupil.setRotationPoint(-0.07F, 0.0F, 0.0F);
        this.Lefteye.addChild(Leftpupil);
        this.Leftpupil.cubeList.add(new ModelBox(Leftpupil, 8, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(2.1F, -1.5F, -5.5F);
        this.Head.addChild(Righteye);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 0, 4, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.Rightpupil = new AdvancedModelRenderer(this);
        this.Rightpupil.setRotationPoint(0.07F, 0.0F, 0.0F);
        this.Righteye.addChild(Rightpupil);
        this.Rightpupil.cubeList.add(new ModelBox(Rightpupil, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Dorsalslopefront = new AdvancedModelRenderer(this);
        this.Dorsalslopefront.setRotationPoint(0.0F, -8.5F, -6.5F);
        this.Bodyfront.addChild(Dorsalslopefront);
        this.setRotateAngle(Dorsalslopefront, 0.0567F, 0.0F, 0.0F);
        this.Dorsalslopefront.cubeList.add(new ModelBox(Dorsalslopefront, 21, 28, -1.5F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.Bellyslopefront = new AdvancedModelRenderer(this);
        this.Bellyslopefront.setRotationPoint(0.0F, 13.5F, -6.5F);
        this.Bodyfront.addChild(Bellyslopefront);
        this.setRotateAngle(Bellyslopefront, -0.0848F, 0.0F, 0.0F);
        this.Bellyslopefront.cubeList.add(new ModelBox(Bellyslopefront, 17, 19, -1.5F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(-1.8F, 5.0F, -6.5F);
        this.Bodyfront.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, 0.3609F, -0.3183F, 0.0F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 52, 3, 0.0F, -1.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(1.8F, 5.0F, -6.5F);
        this.Bodyfront.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, 0.3183F, 0.3183F, 0.0F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 41, 3, 0.0F, -1.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-1.99F, 12.7F, -2.5F);
        this.Bodyfront.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0F, -0.2972F, 0.0F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 58, 12, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(1.99F, 12.7F, -2.5F);
        this.Bodyfront.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.2972F, 0.0F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 53, 12, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.root.offsetY = -0.13F;
        this.root.offsetX = -0.06F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        //this.body.offsetX = -0.09F;
        this.root.offsetY = -0.13F;
        this.root.offsetZ = -0.04F;
        this.root.offsetX = -0.06F;
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
        //this.root.offsetY = 0.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailbase, this.Tailend, this.Tailfin};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = 1.1F;
                 this.root.offsetZ = -0.3F;
                 this.root.offsetX = 0.3F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
