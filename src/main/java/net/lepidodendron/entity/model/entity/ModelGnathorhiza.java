package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGnathorhiza;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGnathorhiza extends AdvancedModelBase {
    public AdvancedModelRenderer Bodymiddlefront;
    public AdvancedModelRenderer Bodymiddleback;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Dorsalfinbase;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Dorsalfinmiddle;
    public AdvancedModelRenderer Leftpelvicfinbase;
    public AdvancedModelRenderer Rightpelvicfinbase;
    public AdvancedModelRenderer Tailmiddlebase;
    public AdvancedModelRenderer Dorsalfinend;
    public AdvancedModelRenderer Tailmiddleend;
    public AdvancedModelRenderer Tailfinbase;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfinmiddle;
    public AdvancedModelRenderer Tailfinend;
    public AdvancedModelRenderer Leftpelvicfinmiddle;
    public AdvancedModelRenderer Leftpelvicfinend;
    public AdvancedModelRenderer Rightpelvicfinmiddle;
    public AdvancedModelRenderer Rightpelvicfinend;
    public AdvancedModelRenderer Headbase;
    public AdvancedModelRenderer Leftpectoralfinbase;
    public AdvancedModelRenderer Rightpectoralfinbase;
    public AdvancedModelRenderer Lowerjawbase;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Eyes;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Mouth;
    public AdvancedModelRenderer Upperjawpiece;
    public AdvancedModelRenderer Leftpectoralfinmiddle;
    public AdvancedModelRenderer Leftpectoralfinend;
    public AdvancedModelRenderer Rightpectoralfinmiddle;
    public AdvancedModelRenderer Rightpectoralfinend;

    public ModelGnathorhiza() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Snout = new AdvancedModelRenderer(this, 18, 18);
        this.Snout.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Snout.addBox(-2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Snout, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftpectoralfinend = new AdvancedModelRenderer(this, 34, 0);
        this.Leftpectoralfinend.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.Leftpectoralfinend.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leftpectoralfinend, 0.0F, -0.1485275233394591F, -0.2972295835988592F);
        this.Dorsalfinend = new AdvancedModelRenderer(this, 41, 0);
        this.Dorsalfinend.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Dorsalfinend.addBox(0.0F, -2.0F, 0.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(Dorsalfinend, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightpelvicfinend = new AdvancedModelRenderer(this, 28, 8);
        this.Rightpelvicfinend.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.Rightpelvicfinend.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Rightpelvicfinend, 0.0F, 0.31834805156902407F, 0.12740903872453743F);
        this.Dorsalfinmiddle = new AdvancedModelRenderer(this, 28, 0);
        this.Dorsalfinmiddle.setRotationPoint(0.009999999776482582F, -1.5F, 0.0F);
        this.Dorsalfinmiddle.addBox(0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 35, 47);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 5.599999904632568F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F);
        this.Rightpectoralfinmiddle = new AdvancedModelRenderer(this, 56, 0);
        this.Rightpectoralfinmiddle.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.Rightpectoralfinmiddle.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Rightpectoralfinmiddle, 0.0F, 0.23352505591421208F, -0.27593656206399647F);
        this.Rightpectoralfinbase = new AdvancedModelRenderer(this, 45, 0);
        this.Rightpectoralfinbase.setRotationPoint(-2.5F, 5.199999809265137F, -6.5F);
        this.Rightpectoralfinbase.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Rightpectoralfinbase, -0.2546435571738906F, 1.1463322580361979F, -0.2972295835988592F);
        this.Leftpectoralfinbase = new AdvancedModelRenderer(this, 12, 0);
        this.Leftpectoralfinbase.setRotationPoint(2.5F, 5.199999809265137F, -6.5F);
        this.Leftpectoralfinbase.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leftpectoralfinbase, -0.2546435405291338F, -1.1463322580361979F, 0.2972295835988592F);
        this.Tailbase = new AdvancedModelRenderer(this, 23, 80);
        this.Tailbase.setRotationPoint(0.0F, 0.5F, 4.900000095367432F);
        this.Tailbase.addBox(-2.0F, -1.5F, 0.0F, 4, 5, 6, 0.0F);
        this.Bodymiddlefront = new AdvancedModelRenderer(this, 0, 85);
        this.Bodymiddlefront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodymiddlefront.addBox(-3.0F, -1.0F, -8.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(Bodymiddlefront, -0.02129301687433082F, 0.0F, 0.0F);
        this.Bodymiddleback = new AdvancedModelRenderer(this, 0, 69);
        this.Bodymiddleback.setRotationPoint(0.009999999776482582F, 0.5099999904632568F, -1.2999999523162842F);
        this.Bodymiddleback.addBox(-3.0F, -1.5F, 0.0F, 6, 7, 8, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRenderer(this, 21, 64);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.8999999761581421F, 5.0F);
        this.Tailmiddlebase.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F);
        this.Rightpectoralfinend = new AdvancedModelRenderer(this, 1, 0);
        this.Rightpectoralfinend.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.Rightpectoralfinend.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Rightpectoralfinend, 0.0F, 0.1485275233394591F, 0.2972295835988592F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 54);
        this.Bodyfront.setRotationPoint(-0.009999999776482582F, -0.009999999776482582F, -6.699999809265137F);
        this.Bodyfront.addBox(-3.0F, -1.0F, -7.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(Bodyfront, -0.021293017373673524F, 0.0F, 0.0F);
        this.Rightpelvicfinbase = new AdvancedModelRenderer(this, 0, 8);
        this.Rightpelvicfinbase.setRotationPoint(-2.299999952316284F, 3.799999952316284F, 5.0F);
        this.Rightpelvicfinbase.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Rightpelvicfinbase, -1.4859733144953278F, 1.209862232156147F, -1.2311552703357667F);
        this.Leftpelvicfinmiddle = new AdvancedModelRenderer(this, 9, 11);
        this.Leftpelvicfinmiddle.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.Leftpelvicfinmiddle.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leftpelvicfinmiddle, 0.0F, 0.23352505591421208F, -0.12740903872453743F);
        this.Mouth = new AdvancedModelRenderer(this, 17, 38);
        this.Mouth.setRotationPoint(0.019999999552965164F, 4.0F, -3.0F);
        this.Mouth.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 3, 0.0F);
        this.setRotateAngle(Mouth, -0.5307546228683145F, 0.0F, 0.0F);
        this.Tailfinmiddle = new AdvancedModelRenderer(this, 67, 0);
        this.Tailfinmiddle.setRotationPoint(0.0F, -1.2000000476837158F, 0.0F);
        this.Tailfinmiddle.addBox(0.0F, -3.0F, 0.0F, 0, 7, 6, 0.0F);
        this.Leftpectoralfinmiddle = new AdvancedModelRenderer(this, 23, 0);
        this.Leftpectoralfinmiddle.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.Leftpectoralfinmiddle.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leftpectoralfinmiddle, 0.0F, -0.23352505591421208F, 0.27593656206399647F);
        this.Tailfinend = new AdvancedModelRenderer(this, 80, 0);
        this.Tailfinend.setRotationPoint(0.009999999776482582F, -0.699999988079071F, 0.0F);
        this.Tailfinend.addBox(0.0F, -3.5F, 0.0F, 0, 7, 10, 0.0F);
        this.Upperjawpiece = new AdvancedModelRenderer(this, 24, 44);
        this.Upperjawpiece.setRotationPoint(0.009999999776482582F, 3.0F, -3.0F);
        this.Upperjawpiece.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawpiece, -0.38205256260891435F, 0.0F, 0.0F);
        this.Headbase = new AdvancedModelRenderer(this, 0, 22);
        this.Headbase.setRotationPoint(0.0F, 3.0F, -5.699999809265137F);
        this.Headbase.addBox(-3.5F, -2.0F, -3.0F, 7, 5, 3, 0.0F);
        this.setRotateAngle(Headbase, -0.10611601718967469F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRenderer(this, 20, 50);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.10000000149011612F, 5.300000190734863F);
        this.Tailmiddleend.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
        this.Leftpelvicfinend = new AdvancedModelRenderer(this, 28, 11);
        this.Leftpelvicfinend.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.Leftpelvicfinend.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Leftpelvicfinend, 0.0F, -0.31834805156902407F, -0.12740903872453743F);
        this.Leftpelvicfinbase = new AdvancedModelRenderer(this, 0, 11);
        this.Leftpelvicfinbase.setRotationPoint(2.299999952316284F, 3.799999952316284F, 5.0F);
        this.Leftpelvicfinbase.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Leftpelvicfinbase, -1.4859733144953278F, -1.209862232156147F, 1.2311552703357667F);
        this.Eyes = new AdvancedModelRenderer(this, 0, 14);
        this.Eyes.setRotationPoint(-0.009999999776482582F, 0.0F, -2.700000047683716F);
        this.Eyes.addBox(-3.0F, 0.0F, -3.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(Eyes, 0.08482300397719036F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 0, 31);
        this.Headslope.setRotationPoint(0.009999999776482582F, -3.799999952316284F, -1.2999999523162842F);
        this.Headslope.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 3, 0.0F);
        this.setRotateAngle(Headslope, 0.12740903872453743F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 16, 11);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.8999999761581421F, -1.899999976158142F);
        this.Lowerjawfront.addBox(-2.0F, -2.0F, -4.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightpelvicfinmiddle = new AdvancedModelRenderer(this, 9, 8);
        this.Rightpelvicfinmiddle.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.Rightpelvicfinmiddle.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Rightpelvicfinmiddle, 0.0F, -0.23352505591421208F, 0.12740903872453743F);
        this.Bodyback = new AdvancedModelRenderer(this, 0, 41);
        this.Bodyback.setRotationPoint(0.0F, 0.6000000238418579F, 6.800000190734863F);
        this.Bodyback.addBox(-2.5F, -1.5F, 0.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(Bodyback, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailfinbase = new AdvancedModelRenderer(this, 54, 0);
        this.Tailfinbase.setRotationPoint(-0.009999999776482582F, -2.299999952316284F, 0.0F);
        this.Tailfinbase.addBox(0.0F, -2.0F, 0.0F, 0, 7, 6, 0.0F);
        this.Dorsalfinbase = new AdvancedModelRenderer(this, 17, 0);
        this.Dorsalfinbase.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Dorsalfinbase.addBox(0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F);
        this.setRotateAngle(Dorsalfinbase, 0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRenderer(this, 19, 28);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, -2.299999952316284F);
        this.Lowerjawbase.addBox(-2.5F, -3.0F, -3.0F, 5, 4, 3, 0.0F);
        this.setRotateAngle(Lowerjawbase, -0.04241150198859518F, 0.0F, 0.0F);
        this.Eyes.addChild(this.Snout);
        this.Leftpectoralfinmiddle.addChild(this.Leftpectoralfinend);
        this.Tailbase.addChild(this.Dorsalfinend);
        this.Rightpelvicfinmiddle.addChild(this.Rightpelvicfinend);
        this.Bodyback.addChild(this.Dorsalfinmiddle);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Rightpectoralfinbase.addChild(this.Rightpectoralfinmiddle);
        this.Bodyfront.addChild(this.Rightpectoralfinbase);
        this.Bodyfront.addChild(this.Leftpectoralfinbase);
        this.Bodyback.addChild(this.Tailbase);
        this.Bodymiddlefront.addChild(this.Bodymiddleback);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Rightpectoralfinmiddle.addChild(this.Rightpectoralfinend);
        this.Bodymiddlefront.addChild(this.Bodyfront);
        this.Bodyback.addChild(this.Rightpelvicfinbase);
        this.Leftpelvicfinbase.addChild(this.Leftpelvicfinmiddle);
        this.Eyes.addChild(this.Mouth);
        this.Tailmiddleend.addChild(this.Tailfinmiddle);
        this.Leftpectoralfinbase.addChild(this.Leftpectoralfinmiddle);
        this.Tailend.addChild(this.Tailfinend);
        this.Snout.addChild(this.Upperjawpiece);
        this.Bodyfront.addChild(this.Headbase);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Leftpelvicfinmiddle.addChild(this.Leftpelvicfinend);
        this.Bodyback.addChild(this.Leftpelvicfinbase);
        this.Headslope.addChild(this.Eyes);
        this.Headbase.addChild(this.Headslope);
        this.Lowerjawbase.addChild(this.Lowerjawfront);
        this.Rightpelvicfinbase.addChild(this.Rightpelvicfinmiddle);
        this.Bodymiddleback.addChild(this.Bodyback);
        this.Tailmiddlebase.addChild(this.Tailfinbase);
        this.Bodymiddleback.addChild(this.Dorsalfinbase);
        this.Headbase.addChild(this.Lowerjawbase);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodymiddlefront.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Bodymiddlefront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodymiddlefront.offsetX = -0.05F;
        this.Bodymiddlefront.offsetY = -0.05F;
        this.Bodymiddlefront.render(0.01F);
        this.resetToDefaultPose();
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
        this.Bodymiddlefront.offsetY = 0.6F;

        AdvancedModelRenderer[] finPectoralLeft = {this.Leftpectoralfinbase, this.Leftpectoralfinmiddle, this.Leftpectoralfinend};
        AdvancedModelRenderer[] finPectoralRight = {this.Rightpectoralfinbase, this.Rightpectoralfinmiddle, this.Rightpectoralfinend};
        AdvancedModelRenderer[] finPelvicLeft = {this.Leftpelvicfinbase, this.Leftpelvicfinmiddle, this.Leftpelvicfinend};
        AdvancedModelRenderer[] finPelvicRight = {this.Rightpelvicfinbase, this.Rightpelvicfinmiddle, this.Rightpelvicfinend};
        AdvancedModelRenderer[] fishTail = {this.Bodymiddleback, this.Bodyback, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        float speed = 0.15F;
        //if (!e.isInWater()) {
        //    speed = 0.5F;
        //}
        if (!((EntityPrehistoricFloraGnathorhiza) e).isReallyInWater()) {
            speed = 0.4f;
            this.Bodymiddlefront.bob(speed, 0.35F, false, f2, 1F);
            this.Bodymiddlefront.offsetY = 1.1F;
        }


        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = speed * 0.55F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -2.5, f2, 1);
            this.swing(Bodymiddlefront, speed, 0.21F, true, 0, 0, f2, 1);
            this.walk(Lowerjawbase, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.chainWave(finPectoralLeft, speed, 0.25F, 0.5F, f2, 1);
            this.chainSwing(finPectoralLeft, speed, 0.25F, 0.5F, f2, 1);
            this.chainFlap(finPectoralLeft, speed, 0.15F, -0.8, f2, 1);

            this.chainWave(finPectoralRight, speed, 0.25F, 0.5F, f2, 1);
            this.chainSwing(finPectoralRight, speed, -0.25F, 0.5F, f2, 1);
            this.chainFlap(finPectoralRight, speed, -0.15F, 0.8, f2, 1);

            this.chainWave(finPelvicLeft, speed, 0.20F, 0.3F, f2, 1);
            this.chainSwing(finPelvicLeft, speed, 0.20F, 0.3F, f2, 1);
            this.chainFlap(finPelvicLeft, speed, 0.10F, -0.5, f2, 1);

            this.chainWave(finPelvicRight, speed, 0.20F, 0.3F, f2, 1);
            this.chainSwing(finPelvicRight, speed, -0.20F, 0.3F, f2, 1);
            this.chainFlap(finPelvicRight, speed, -0.10F, 0.5, f2, 1);

            //if (!e.isInWater()) {
            //    this.Bodymiddlefront.rotateAngleZ = (float) Math.toRadians(90);
            //    this.Bodymiddlefront.offsetY = 1.25F;
            //    this.bob(Bodymiddlefront, -speed, 5F, false, f2, 1);
            //}
        }
    }
}
