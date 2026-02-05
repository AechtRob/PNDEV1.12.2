package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCeratodus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCeratodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodymiddlefront;
    private final AdvancedModelRenderer Bodymiddlefront_r1;
    private final AdvancedModelRenderer Bodymiddleback;
    private final AdvancedModelRenderer Bodymiddleback_r1;
    private final AdvancedModelRenderer Dorsalfinmiddle_r1;
    private final AdvancedModelRenderer Bodyback;
    private final AdvancedModelRenderer Bodyback_r1;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddlebase_r1;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailmiddleend_r1;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailend_r1;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Dorsalfinend;
    private final AdvancedModelRenderer Dorsalfinend2;
    private final AdvancedModelRenderer Dorsalfinmiddle;
    private final AdvancedModelRenderer Dorsalfinmiddle_r2;
    private final AdvancedModelRenderer Dorsalfinmiddle2;
    private final AdvancedModelRenderer Leftpelvicfinbase;
    private final AdvancedModelRenderer Rightpelvicfinbase;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawbase_r1;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer Upperjawpiece;
    private final AdvancedModelRenderer Mouth;
    private final AdvancedModelRenderer Rightpectoralfinbase2;
    private final AdvancedModelRenderer Leftpectoralfinbase2;

    public ModelCeratodus() {
        this.textureWidth = 80;
        this.textureHeight = 72;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 15.0F, 0.0F);


        this.Bodymiddlefront = new AdvancedModelRenderer(this);
        this.Bodymiddlefront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(Bodymiddlefront);
        this.Bodymiddlefront.cubeList.add(new ModelBox(Bodymiddlefront, 0, 0, -2.5F, -0.5F, -8.25F, 5, 7, 7, 0.0F, false));

        this.Bodymiddlefront_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddlefront_r1.setRotationPoint(-1.0F, 16.325F, 6.875F);
        this.Bodymiddlefront.addChild(Bodymiddlefront_r1);
        this.setRotateAngle(Bodymiddlefront_r1, 0.1745F, 0.0F, 0.0F);
        this.Bodymiddlefront_r1.cubeList.add(new ModelBox(Bodymiddlefront_r1, 58, 18, -1.0F, -18.5F, -8.0F, 4, 1, 3, -0.01F, false));

        this.Bodymiddleback = new AdvancedModelRenderer(this);
        this.Bodymiddleback.setRotationPoint(-0.01F, 0.51F, -1.05F);
        this.Bodymiddlefront.addChild(Bodymiddleback);
        this.Bodymiddleback.cubeList.add(new ModelBox(Bodymiddleback, 20, 14, -1.99F, -1.0F, -0.5F, 4, 7, 6, 0.0F, false));

        this.Bodymiddleback_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddleback_r1.setRotationPoint(-1.49F, 16.865F, 1.65F);
        this.Bodymiddleback.addChild(Bodymiddleback_r1);
        this.setRotateAngle(Bodymiddleback_r1, 0.0436F, 0.0F, 0.0F);
        this.Bodymiddleback_r1.cubeList.add(new ModelBox(Bodymiddleback_r1, 40, 19, 0.0F, -18.49F, -1.3F, 3, 1, 6, -0.01F, false));

        this.Dorsalfinmiddle_r1 = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle_r1.setRotationPoint(0.01F, 23.665F, -1.6F);
        this.Bodymiddleback.addChild(Dorsalfinmiddle_r1);
        this.setRotateAngle(Dorsalfinmiddle_r1, 0.0873F, 0.0F, 0.0F);
        this.Dorsalfinmiddle_r1.cubeList.add(new ModelBox(Dorsalfinmiddle_r1, 10, 56, -0.02F, -25.39F, 5.5F, 0, 2, 4, 0.0F, false));

        this.Bodyback = new AdvancedModelRenderer(this);
        this.Bodyback.setRotationPoint(0.0F, 0.6F, 5.8F);
        this.Bodymiddleback.addChild(Bodyback);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 0, 14, -1.49F, -1.7F, -1.25F, 3, 7, 7, 0.0F, false));

        this.Bodyback_r1 = new AdvancedModelRenderer(this);
        this.Bodyback_r1.setRotationPoint(-1.49F, 16.29F, -7.15F);
        this.Bodyback.addChild(Bodyback_r1);
        this.setRotateAngle(Bodyback_r1, -0.0873F, 0.0F, 0.0F);
        this.Bodyback_r1.cubeList.add(new ModelBox(Bodyback_r1, 0, 40, 0.5F, -19.09F, 4.5F, 2, 1, 7, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.5F, 5.65F);
        this.Bodyback.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 28, -0.99F, -1.225F, -1.0F, 2, 6, 6, 0.0F, false));

        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(-1.49F, -1.16F, 5.0F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.2182F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 58, 46, 1.0F, 0.035F, -5.0F, 1, 1, 5, 0.01F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.9F, 5.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 34, 46, -0.49F, -0.625F, -1.0F, 1, 4, 5, 0.02F, false));

        this.Tailmiddlebase_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.01F, -0.51F, 4.0F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.3142F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 46, 54, -0.5F, -0.115F, -5.0F, 1, 2, 5, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.9F, 3.85F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 55, 31, -0.49F, -0.125F, 0.1F, 1, 2, 4, 0.01F, false));

        this.Tailmiddleend_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(-1.49F, -0.135F, 4.45F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.3054F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 35, 56, 1.0F, 0.01F, -4.5F, 1, 2, 4, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.8F, 3.975F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 58, 58, -0.49F, -0.325F, 0.05F, 1, 1, 3, 0.0F, false));

        this.Tailend_r1 = new AdvancedModelRenderer(this);
        this.Tailend_r1.setRotationPoint(-0.99F, -0.36F, 3.05F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.2531F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 60, 0, 0.5F, 0.085F, -3.2F, 1, 1, 3, -0.01F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(-0.01F, -2.5F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 20, 27, 0.0F, -1.5F, 0.0F, 0, 7, 7, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.0F, -2.2F, 0.2F);
        this.Tailmiddleend.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 18, 46, 0.0F, -3.0F, -0.2F, 0, 10, 4, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.01F, -2.3F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinbase);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 26, 46, 0.0F, -2.25F, 0.0F, 0, 10, 4, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(0.0F, -1.2F, 1.0F);
        this.Tailbase.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, 0.0201F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 0, 56, 0.0F, -2.325F, -0.925F, 0, 3, 5, 0.0F, false));

        this.Dorsalfinend2 = new AdvancedModelRenderer(this);
        this.Dorsalfinend2.setRotationPoint(0.0F, 3.18F, 1.25F);
        this.Tailbase.addChild(Dorsalfinend2);
        this.setRotateAngle(Dorsalfinend2, -0.0375F, 0.0F, 0.0F);
        this.Dorsalfinend2.cubeList.add(new ModelBox(Dorsalfinend2, 54, 37, 0.0F, -1.4F, -1.0F, 0, 4, 5, 0.0F, false));

        this.Dorsalfinmiddle = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle.setRotationPoint(-0.01F, -1.375F, -0.25F);
        this.Bodyback.addChild(Dorsalfinmiddle);
        this.setRotateAngle(Dorsalfinmiddle, 0.0436F, 0.0F, 0.0F);


        this.Dorsalfinmiddle_r2 = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle_r2.setRotationPoint(0.02F, 23.49F, -6.5F);
        this.Dorsalfinmiddle.addChild(Dorsalfinmiddle_r2);
        this.setRotateAngle(Dorsalfinmiddle_r2, -0.0436F, 0.0F, 0.0F);
        this.Dorsalfinmiddle_r2.cubeList.add(new ModelBox(Dorsalfinmiddle_r2, 46, 46, -0.02F, -25.39F, 5.5F, 0, 2, 6, 0.0F, false));

        this.Dorsalfinmiddle2 = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle2.setRotationPoint(-0.01F, 4.28F, -0.075F);
        this.Bodyback.addChild(Dorsalfinmiddle2);
        this.setRotateAngle(Dorsalfinmiddle2, -0.2618F, 0.0F, 0.0F);


        this.Leftpelvicfinbase = new AdvancedModelRenderer(this);
        this.Leftpelvicfinbase.setRotationPoint(-0.605F, 5.15F, 2.0F);
        this.Bodyback.addChild(Leftpelvicfinbase);
        this.setRotateAngle(Leftpelvicfinbase, -0.9882F, 1.0236F, -0.3714F);
        this.Leftpelvicfinbase.cubeList.add(new ModelBox(Leftpelvicfinbase, 58, 24, -5.0F, -0.5F, 0.0F, 5, 2, 0, 0.0F, false));

        this.Rightpelvicfinbase = new AdvancedModelRenderer(this);
        this.Rightpelvicfinbase.setRotationPoint(0.625F, 5.15F, 2.0F);
        this.Bodyback.addChild(Rightpelvicfinbase);
        this.setRotateAngle(Rightpelvicfinbase, -0.9882F, -1.0236F, 0.3714F);
        this.Rightpelvicfinbase.cubeList.add(new ModelBox(Rightpelvicfinbase, 58, 24, 0.0F, -0.5F, 0.0F, 5, 2, 0, 0.0F, true));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.01F, -0.01F, -7.7F);
        this.Bodymiddlefront.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0213F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 24, 0, -2.51F, -0.4926F, -5.0004F, 5, 6, 5, 0.02F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-0.51F, 24.4674F, 7.1996F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 34, 35, -2.0F, -18.46F, -13.7F, 5, 1, 5, 0.01F, false));

        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 3.0574F, -3.7004F);
        this.Bodyfront.addChild(Headbase);
        this.setRotateAngle(Headbase, -0.2806F, 0.0F, 0.0F);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 34, 27, -3.51F, -2.15F, -2.5F, 7, 5, 3, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.25F, -2.3F);
        this.Headbase.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.1583F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 44, 0, -2.51F, -2.0F, -3.0F, 5, 3, 3, 0.0F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(-0.01F, 22.06F, 10.975F);
        this.Lowerjawbase.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.192F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 54, 26, -2.5F, -19.01F, -17.7F, 5, 1, 3, -0.01F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -0.175F, -3.025F);
        this.Lowerjawbase.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0984F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 58, 10, -2.01F, 0.0653F, -2.5386F, 4, 1, 3, 0.01F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(-0.01F, 0.0753F, -2.5386F);
        this.Lowerjawfront.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.1745F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 58, 14, -2.0F, -0.01F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -1.4426F, -5.0505F);
        this.Bodyfront.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.1721F, 0.0F, 0.0F);


        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.5F, 25.66F, 12.75F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, -0.0436F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 38, 11, -4.0F, -24.01F, -16.5F, 7, 5, 3, -0.01F, false));

        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(0.01F, 0.0F, -2.7F);
        this.Headslope.addChild(Eyes);
        this.setRotateAngle(Eyes, 0.0848F, 0.0F, 0.0F);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 36, 41, -3.01F, 1.0F, -3.0F, 6, 2, 3, 0.0F, false));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 58, 22, -3.01F, 1.9F, -2.85F, 6, 1, 1, 0.02F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Eyes.addChild(Snout);
        this.setRotateAngle(Snout, 0.1061F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 0, 48, -2.51F, 1.0707F, -2.8751F, 5, 1, 3, 0.0F, false));
        this.Snout.cubeList.add(new ModelBox(Snout, 0, 52, -2.51F, 1.5957F, -2.8751F, 5, 1, 3, -0.01F, false));

        this.Upperjawpiece = new AdvancedModelRenderer(this);
        this.Upperjawpiece.setRotationPoint(-0.01F, 3.0F, -3.0F);
        this.Snout.addChild(Upperjawpiece);
        this.setRotateAngle(Upperjawpiece, -0.3821F, 0.0F, 0.0F);
        this.Upperjawpiece.cubeList.add(new ModelBox(Upperjawpiece, 44, 6, -2.5F, -1.4251F, 0.003F, 5, 1, 3, 0.01F, false));

        this.Mouth = new AdvancedModelRenderer(this);
        this.Mouth.setRotationPoint(-0.02F, 4.0F, -3.0F);
        this.Eyes.addChild(Mouth);
        this.setRotateAngle(Mouth, -0.5308F, 0.0F, 0.0F);
        this.Mouth.cubeList.add(new ModelBox(Mouth, 18, 41, -2.99F, -2.49F, -0.5F, 6, 2, 3, -0.01F, false));

        this.Rightpectoralfinbase2 = new AdvancedModelRenderer(this);
        this.Rightpectoralfinbase2.setRotationPoint(-2.17F, 4.6574F, -3.5004F);
        this.Bodyfront.addChild(Rightpectoralfinbase2);
        this.setRotateAngle(Rightpectoralfinbase2, -0.5601F, 1.1463F, -0.2972F);
        this.Rightpectoralfinbase2.cubeList.add(new ModelBox(Rightpectoralfinbase2, 24, 11, -8.0F, -1.0F, -0.5F, 8, 3, 0, 0.0F, false));

        this.Leftpectoralfinbase2 = new AdvancedModelRenderer(this);
        this.Leftpectoralfinbase2.setRotationPoint(2.15F, 4.6574F, -3.5004F);
        this.Bodyfront.addChild(Leftpectoralfinbase2);
        this.setRotateAngle(Leftpectoralfinbase2, -0.5601F, -1.1463F, 0.2972F);
        this.Leftpectoralfinbase2.cubeList.add(new ModelBox(Leftpectoralfinbase2, 24, 11, 0.0F, -1.0F, -0.5F, 8, 3, 0, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodymiddlefront.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Bodymiddlefront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodymiddlefront.offsetY = -0.04F;
        this.Bodymiddlefront.offsetZ = -0.033F;
        this.Bodymiddlefront.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyback, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddleback, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Dorsalfinend, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinend2, -0.0375F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinmiddle, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinmiddle2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Eyes, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Headbase, -0.2806F, 0.0F, 0.0F);
        this.setRotateAngle(Headslope, 0.1721F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpectoralfinbase2, -0.2546F, 1.1463F, -0.2972F);
        this.setRotateAngle(Leftpelvicfinbase, -0.5032F, 1.2816F, -0.4077F);
        this.setRotateAngle(Lowerjawbase, -0.0162F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.622F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.5308F, 0.0F, 0.0F);
        this.setRotateAngle(Rightpelvicfinbase, -0.5032F, -1.2816F, 0.4077F);
        this.setRotateAngle(Snout, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Upperjawpiece, -0.3821F, 0.0F, 0.0F);
        this.Bodymiddlefront.offsetY = -0.15F;
        this.Bodymiddlefront.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Bodymiddlefront.offsetY = -0.4F;
        this.Bodymiddlefront.offsetX = 0.2F;
        this.Bodymiddlefront.offsetZ = 2.0F;
        this.Bodymiddlefront.rotateAngleY = (float)Math.toRadians(120);
        this.Bodymiddlefront.rotateAngleX = (float)Math.toRadians(1);
        this.Bodymiddlefront.rotateAngleZ = (float)Math.toRadians(0);
        this.Bodymiddlefront.scaleChildren = true;
        float scaler = 1.8F;
        this.Bodymiddlefront.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Bodymiddlefront, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Bodyback, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddleback, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Dorsalfinend, 0.0201F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinend2, -0.0375F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinmiddle, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfinmiddle2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Eyes, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Headbase, -0.2806F, 0.0F, 0.0F);
        this.setRotateAngle(Headslope, 0.1721F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpectoralfinbase2, -0.2546F, 1.1463F, -0.2972F);
        this.setRotateAngle(Leftpelvicfinbase, -0.5032F, 1.2816F, -0.4077F);
        this.setRotateAngle(Lowerjawbase, -0.0162F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.622F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.5308F, 0.0F, 0.0F);
        this.setRotateAngle(Rightpelvicfinbase, -0.5032F, -1.2816F, 0.4077F);
        this.setRotateAngle(Snout, 0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Upperjawpiece, -0.3821F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Bodymiddlefront.render(f);
        //Reset rotations, positions and sizing:
        this.Bodymiddlefront.setScale(1.0F, 1.0F, 1.0F);
        this.Bodymiddlefront.scaleChildren = false;
        resetToDefaultPose();

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
        this.Bodymiddlefront.offsetY = 1F;

        AdvancedModelRenderer[] finPectoralLeft = {this.Leftpectoralfinbase2};
        AdvancedModelRenderer[] finPelvicLeft = {this.Leftpelvicfinbase};
        AdvancedModelRenderer[] finPelvicRight = {this.Rightpelvicfinbase};
        AdvancedModelRenderer[] fishTail = {this.Bodymiddleback, this.Bodyback, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        float speed = 0.15F;
        float outOfWater = 1;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (!((EntityPrehistoricFloraCeratodus) e).isReallyInWater()) {
            outOfWater = 1.45f;
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
        //if (!e.isInWater()) {
        //    outOfWater = 0.05f;
        //}

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * outOfWater, 0.05F * outOfWater, -3, f2, 1);
            this.chainSwing(fishTail, speed * outOfWater, 0.3F * outOfWater, -2.5, f2, 1);
            this.swing(Bodymiddlefront, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);
            this.walk(Lowerjawbase, (float) (speed * 0.75) * outOfWater, (float)Math.toRadians(17.5), false, 0, 0.3F, f2, 1);

            this.chainWave(finPectoralLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPectoralLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPectoralLeft, speed * outOfWater, 0.15F * outOfWater, -0.8, f2, 1);


            this.chainWave(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwing(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainFlap(finPelvicLeft, speed * outOfWater, 0.10F * outOfWater, -0.5, f2, 1);

            this.chainWave(finPelvicRight, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwing(finPelvicRight, speed * outOfWater, -0.20F * outOfWater, 0.3F, f2, 1);
            this.chainFlap(finPelvicRight, speed * outOfWater, -0.10F * outOfWater, 0.5, f2, 1);

            //if (!e.isInWater()) {
            //    this.Bodymiddlefront.rotateAngleZ = (float)Math.toRadians(90);
            //    this.Bodymiddlefront.offsetY = 1.35F;
            //}
        }
    }
}
