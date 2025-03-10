package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAlbertonia extends ModelBasePalaeopedia {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Bellymiddle;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Bellyend;
    public AdvancedModelRenderer Backslope;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Bellyfront;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Eyeportion;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Upperjaw;

    public ModelAlbertonia() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.Dorsalfin = new AdvancedModelRenderer(this, 41, 41);
        this.Dorsalfin.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Dorsalfin.addBox(0.0F, -5.0F, 0.0F, 0, 5, 7, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 0);
        this.Tailend.setRotationPoint(0.0F, 0.5099999904632568F, 3.0F);
        this.Tailend.addBox(-1.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Tailend, 0.04241150198859518F, 0.0F, 0.0F);
        this.Eyeportion = new AdvancedModelRenderer(this, 0, 16);
        this.Eyeportion.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Eyeportion.addBox(-3.0F, 0.0F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Eyeportion, 0.6155776351678833F, 0.0F, 0.0F);
        this.Upperjaw = new AdvancedModelRenderer(this, 9, 7);
        this.Upperjaw.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw.addBox(-2.5F, 0.0F, -2.0F, 5, 6, 2, 0.0F);
        this.setRotateAngle(Upperjaw, 0.2972295835988592F, 0.0F, 0.0F);
        this.Backslope = new AdvancedModelRenderer(this, 0, 40);
        this.Backslope.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Backslope.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 8, 0.0F);
        this.setRotateAngle(Backslope, -0.1911135497644277F, 0.0F, 0.0F);
        this.Throat = new AdvancedModelRenderer(this, 23, 30);
        this.Throat.setRotationPoint(-0.009999999776482582F, 6.0F, -0.5F);
        this.Throat.addBox(-3.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Throat, -0.4881685797985891F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 13, 21);
        this.Rightpectoralfin.setRotationPoint(-2.9000000953674316F, 5.5F, -6.5F);
        this.Rightpectoralfin.addBox(-13.0F, 0.0F, -2.0F, 13, 0, 8, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.10611601718967469F, -0.6368706733475028F);
        this.Bellyend = new AdvancedModelRenderer(this, 0, 51);
        this.Bellyend.setRotationPoint(0.0F, 8.0F, 0.30000001192092896F);
        this.Bellyend.addBox(-2.0F, -4.0F, 0.0F, 4, 4, 9, 0.0F);
        this.setRotateAngle(Bellyend, 0.5307546228683145F, 0.0F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 36, 30);
        this.Bodyend.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.Bodyend.addBox(-2.5F, -3.5F, 0.0F, 5, 7, 8, 0.0F);
        this.setRotateAngle(Bodyend, -0.04241150198859518F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 27);
        this.Head.setRotationPoint(0.0F, 1.5F, -5.800000190734863F);
        this.Head.addBox(-3.5F, -4.0F, -4.0F, 7, 8, 4, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 19, 45);
        this.Lowerjaw.setRotationPoint(0.0F, 4.300000190734863F, -3.5999999046325684F);
        this.Lowerjaw.addBox(-2.0F, -1.0F, -6.0F, 4, 1, 6, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.5942845969882637F, 0.0F, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 38, 0);
        this.Leftpectoralfin.setRotationPoint(2.9000000953674316F, 5.5F, -6.5F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, -2.0F, 13, 0, 8, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, -0.10611601718967469F, 0.6368706733475028F);
        this.Bodyfront = new AdvancedModelRenderer(this, 25, 1);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-3.0F, -4.0F, -6.0F, 6, 11, 8, 0.0F);
        this.setRotateAngle(Bodyfront, -0.02129301687433082F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 9, 0);
        this.Leftpelvicfin.setRotationPoint(0.5F, -0.5F, -1.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.2546435405291338F, 0.12740903872453743F, 0.5094616179782085F);
        this.Bellyfront = new AdvancedModelRenderer(this, 19, 39);
        this.Bellyfront.setRotationPoint(0.009999999776482582F, 0.0F, -5.699999809265137F);
        this.Bellyfront.addBox(-2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(Bellyfront, -0.5307546228683145F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 18, 0);
        this.Rightpelvicfin.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.Rightpelvicfin.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.2546435405291338F, -0.12740903872453743F, -0.5094616179782085F);
        this.Tailfin = new AdvancedModelRenderer(this, 54, 0);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tailfin.addBox(0.0F, -5.5F, 0.0F, 0, 12, 11, 0.0F);
        this.setRotateAngle(Tailfin, 0.04241150198859518F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 18, 53);
        this.Headslope.setRotationPoint(-0.009999999776482582F, -5.5F, -0.20000000298023224F);
        this.Headslope.addBox(-3.0F, 0.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.3946189545285622F, 0.0F, 0.0F);
        this.Bellymiddle = new AdvancedModelRenderer(this, 33, 54);
        this.Bellymiddle.setRotationPoint(0.0F, 9.0F, 1.899999976158142F);
        this.Bellymiddle.addBox(-2.5F, -2.0F, -6.0F, 5, 2, 6, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 57, 43);
        this.Analfin.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F);
        this.setRotateAngle(Analfin, 0.27593656206399647F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 55, 24);
        this.Tailbase.setRotationPoint(0.0F, -0.6000000238418579F, 7.0F);
        this.Tailbase.addBox(-1.5F, -2.5F, 0.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Tailbase, 0.06370451936226872F, 0.0F, 0.0F);
        this.Backslope.addChild(this.Dorsalfin);
        this.Tailbase.addChild(this.Tailend);
        this.Head.addChild(this.Eyeportion);
        this.Eyeportion.addChild(this.Upperjaw);
        this.Bodyend.addChild(this.Backslope);
        this.Head.addChild(this.Throat);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Bodyend.addChild(this.Bellyend);
        this.Bodyfront.addChild(this.Bodyend);
        this.Bodyfront.addChild(this.Head);
        this.Head.addChild(this.Lowerjaw);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Bellymiddle.addChild(this.Leftpelvicfin);
        this.Bellymiddle.addChild(this.Bellyfront);
        this.Bellymiddle.addChild(this.Rightpelvicfin);
        this.Tailend.addChild(this.Tailfin);
        this.Head.addChild(this.Headslope);
        this.Bodyfront.addChild(this.Bellymiddle);
        this.Bellyend.addChild(this.Analfin);
        this.Bodyend.addChild(this.Tailbase);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.offsetY = -0.05F;
        this.Bodyfront.offsetX = -0.03F;
        this.Bodyfront.offsetZ = -0.01F;
        this.Bodyfront.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, -0.2F, 0.2F, -0.3F);
        this.setRotateAngle(Bodyend, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
        this.Bodyfront.offsetZ = 0.01F;
        this.Bodyfront.offsetX = -0.025F;
        this.Bodyfront.offsetY = 0.15F;
        this.Bodyfront.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Bodyfront.offsetY = -2.5F;
        this.Bodyfront.offsetX = 0.5F;
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(210);
        this.Bodyfront.rotateAngleX = (float) Math.toRadians(8);
        this.Bodyfront.rotateAngleZ = (float) Math.toRadians(-4);
        this.Bodyfront.scaleChildren = true;
        float scaler = 3.5F;
        this.Bodyfront.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Bodyfront, 0.2F, 3.7F, -0.3F);
        this.setRotateAngle(Bodyend, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Bodyfront.render(f);
        //Reset rotations, positions and sizing:
        this.Bodyfront.setScale(1.0F, 1.0F, 1.0F);
        this.Bodyfront.scaleChildren = false;
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
        //this.Bodyfront.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tailbase, this.Tailend, this.Tailfin};
        float speed = 0.7F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.055F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.55F, -3, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.55), 0.2F, true, -2, -0.25F, f2, 1);

            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

            this.swing(Analfin, (float) (speed * 0.75), 0.95F, true, 1.5F, 0, f2, 1);

            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.05F;
                this.bob(Bodyfront, -speed, 5F, false, f2, 1);
            }
        }
    }
}
