package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelJamoytius extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Eyeportion;
    private final AdvancedModelRenderer Nose;
    private final AdvancedModelRenderer Mouthtop;
    private final AdvancedModelRenderer Mouthfiller;
    private final AdvancedModelRenderer Mouthunderside;
    private final AdvancedModelRenderer Bodymiddlefront;
    private final AdvancedModelRenderer Bodymiddleback;
    private final AdvancedModelRenderer Bodyback;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Dorsalridgetbase;
    private final AdvancedModelRenderer Leftanalfin;
    private final AdvancedModelRenderer Rightanalfin;
    private final AdvancedModelRenderer Dorsalridgeback;
    private final AdvancedModelRenderer Dorsalridgemback;
    private final AdvancedModelRenderer Dorsalridgemfront;
    private final AdvancedModelRenderer Dorsalridgefront;

    public ModelJamoytius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 3.0F, 0.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 17.7F, -2.0F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0637F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 34, -2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.Eyeportion = new AdvancedModelRenderer(this);
        this.Eyeportion.setRotationPoint(0.01F, -2.0F, -6.7F);
        this.Bodyfront.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, -0.0213F, 0.0F, 0.0F);
        this.Eyeportion.cubeList.add(new ModelBox(Eyeportion, 23, 41, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Nose = new AdvancedModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Eyeportion.addChild(Nose);
        this.setRotateAngle(Nose, 0.3821F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 33, 40, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Mouthtop = new AdvancedModelRenderer(this);
        this.Mouthtop.setRotationPoint(-0.01F, 0.62F, -1.8F);
        this.Nose.addChild(Mouthtop);
        this.setRotateAngle(Mouthtop, 0.6793F, 0.0F, 0.0F);
        this.Mouthtop.cubeList.add(new ModelBox(Mouthtop, 33, 36, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.Mouthfiller = new AdvancedModelRenderer(this);
        this.Mouthfiller.setRotationPoint(0.01F, 2.0F, -3.0F);
        this.Eyeportion.addChild(Mouthfiller);
        this.setRotateAngle(Mouthfiller, -0.0424F, 0.0F, 0.0F);
        this.Mouthfiller.cubeList.add(new ModelBox(Mouthfiller, 34, 47, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Mouthunderside = new AdvancedModelRenderer(this);
        this.Mouthunderside.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.Bodyfront.addChild(Mouthunderside);
        this.setRotateAngle(Mouthunderside, -0.2759F, 0.0F, 0.0F);
        this.Mouthunderside.cubeList.add(new ModelBox(Mouthunderside, 0, 7, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Bodymiddlefront = new AdvancedModelRenderer(this);
        this.Bodymiddlefront.setRotationPoint(-0.01F, 0.1F, -0.7F);
        this.Bodyfront.addChild(Bodymiddlefront);
        this.setRotateAngle(Bodymiddlefront, 0.0848F, 0.0F, 0.0F);
        this.Bodymiddlefront.cubeList.add(new ModelBox(Bodymiddlefront, 0, 13, -1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.Bodymiddleback = new AdvancedModelRenderer(this);
        this.Bodymiddleback.setRotationPoint(0.01F, 0.0F, 4.3F);
        this.Bodymiddlefront.addChild(Bodymiddleback);
        this.setRotateAngle(Bodymiddleback, 0.0424F, 0.0F, 0.0F);
        this.Bodymiddleback.cubeList.add(new ModelBox(Bodymiddleback, 16, 31, -1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.Bodyback = new AdvancedModelRenderer(this);
        this.Bodyback.setRotationPoint(0.0F, 0.5F, 4.4F);
        this.Bodymiddleback.addChild(Bodyback);
        this.setRotateAngle(Bodyback, 0.0637F, 0.0F, 0.0F);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 0, 23, -1.0F, -2.5F, 0.0F, 2, 4, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(-0.01F, -0.1F, 5.4F);
        this.Bodyback.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0424F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 17, 22, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.3F, 4.4F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.2759F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 29, 30, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.01F, -0.1F, 2.5F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.3183F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 27, 17, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, 0.3183F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 0, 35, 0.0F, -6.0F, 0.0F, 0, 10, 11, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailmiddle.addChild(Tailfinbase);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 0, 32, 0.0F, -3.9F, -0.4F, 0, 4, 3, 0.0F, false));

        this.Dorsalridgetbase = new AdvancedModelRenderer(this);
        this.Dorsalridgetbase.setRotationPoint(0.0F, -1.52F, -0.1F);
        this.Tailbase.addChild(Dorsalridgetbase);
        this.setRotateAngle(Dorsalridgetbase, -0.1911F, 0.0F, 0.0F);
        this.Dorsalridgetbase.cubeList.add(new ModelBox(Dorsalridgetbase, 27, 10, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Leftanalfin = new AdvancedModelRenderer(this);
        this.Leftanalfin.setRotationPoint(-0.1F, 1.5F, 0.5F);
        this.Tailbase.addChild(Leftanalfin);
        this.setRotateAngle(Leftanalfin, 0.0F, 0.0F, 0.3609F);
        this.Leftanalfin.cubeList.add(new ModelBox(Leftanalfin, 23, 48, 0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Rightanalfin = new AdvancedModelRenderer(this);
        this.Rightanalfin.setRotationPoint(0.1F, 1.5F, 0.5F);
        this.Tailbase.addChild(Rightanalfin);
        this.setRotateAngle(Rightanalfin, 0.0F, 0.0F, -0.3609F);
        this.Rightanalfin.cubeList.add(new ModelBox(Rightanalfin, 23, 44, 0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Dorsalridgeback = new AdvancedModelRenderer(this);
        this.Dorsalridgeback.setRotationPoint(0.0F, -2.32F, -0.1F);
        this.Bodyback.addChild(Dorsalridgeback);
        this.setRotateAngle(Dorsalridgeback, -0.1274F, 0.0F, 0.0F);
        this.Dorsalridgeback.cubeList.add(new ModelBox(Dorsalridgeback, 13, 0, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Dorsalridgemback = new AdvancedModelRenderer(this);
        this.Dorsalridgemback.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.Bodymiddleback.addChild(Dorsalridgemback);
        this.setRotateAngle(Dorsalridgemback, -0.0213F, 0.0F, 0.0F);
        this.Dorsalridgemback.cubeList.add(new ModelBox(Dorsalridgemback, 13, 8, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.Dorsalridgemfront = new AdvancedModelRenderer(this);
        this.Dorsalridgemfront.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Bodymiddlefront.addChild(Dorsalridgemfront);
        this.setRotateAngle(Dorsalridgemfront, -0.0213F, 0.0F, 0.0F);
        this.Dorsalridgemfront.cubeList.add(new ModelBox(Dorsalridgemfront, 17, 15, -1.0F, -1.0F, 0.425F, 2, 1, 5, 0.0F, false));

        this.Dorsalridgefront = new AdvancedModelRenderer(this);
        this.Dorsalridgefront.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Bodyfront.addChild(Dorsalridgefront);
        this.setRotateAngle(Dorsalridgefront, 0.1698F, 0.0F, 0.0F);
        this.Dorsalridgefront.cubeList.add(new ModelBox(Dorsalridgefront, 23, 2, -1.5F, -1.0F, -6.0F, 3, 1, 6, 0.0F, false));

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
        this.setRotateAngle(root, 0.7418F, (float) Math.toRadians(90), 0.0F);

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
        AdvancedModelRenderer[] fishTail = {this.Bodymiddleback, this.Bodyback, this.Tailbase, this.Tailmiddle};
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
