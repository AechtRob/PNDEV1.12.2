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
    private final AdvancedModelRenderer Bodymiddleback;
    private final AdvancedModelRenderer Bodyback;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Dorsalfinend;
    private final AdvancedModelRenderer Dorsalfinend2;
    private final AdvancedModelRenderer Dorsalfinmiddle;
    private final AdvancedModelRenderer Dorsalfinmiddle2;
    private final AdvancedModelRenderer Rightpelvicfinbase;
    private final AdvancedModelRenderer Leftpelvicfinbase;
    private final AdvancedModelRenderer Dorsalfinbase;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer Upperjawpiece;
    private final AdvancedModelRenderer Mouth;
    private final AdvancedModelRenderer Rightpectoralfinbase;
    private final AdvancedModelRenderer Leftpectoralfinbase2;

    public ModelCeratodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 17.0F, 0.0F);


        this.Bodymiddlefront = new AdvancedModelRenderer(this);
        this.Bodymiddlefront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(Bodymiddlefront);
        this.Bodymiddlefront.cubeList.add(new ModelBox(Bodymiddlefront, 0, 0, -3.0F, -0.5F, -8.0F, 6, 7, 7, 0.0F, false));

        this.Bodymiddleback = new AdvancedModelRenderer(this);
        this.Bodymiddleback.setRotationPoint(-0.01F, 0.51F, -1.05F);
        this.Bodymiddlefront.addChild(Bodymiddleback);
        this.Bodymiddleback.cubeList.add(new ModelBox(Bodymiddleback, 0, 14, -3.0F, -1.0F, -0.25F, 6, 7, 6, 0.0F, false));

        this.Bodyback = new AdvancedModelRenderer(this);
        this.Bodyback.setRotationPoint(0.0F, 0.6F, 5.8F);
        this.Bodymiddleback.addChild(Bodyback);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 19, 7, -2.5F, -1.2F, -1.25F, 5, 6, 7, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.5F, 5.65F);
        this.Bodyback.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 28, -2.0F, -1.175F, -1.0F, 4, 5, 6, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.9F, 5.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 35, 37, -1.5F, -1.625F, -1.0F, 3, 4, 5, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.1F, 3.85F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 37, 29, -1.0F, -1.125F, -0.55F, 2, 3, 5, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 3.975F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 19, 47, -0.5F, -0.625F, 0.05F, 1, 2, 3, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(-0.01F, -0.7F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 0, 33, 0.0F, -3.5F, 0.0F, 0, 9, 6, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.0F, -1.2F, 0.2F);
        this.Tailmiddleend.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 36, 42, 0.0F, -3.0F, -0.2F, 0, 9, 4, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.01F, -2.3F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinbase);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 28, 42, 0.0F, -2.0F, 0.0F, 0, 9, 4, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(0.0F, -1.2F, 1.0F);
        this.Tailbase.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, 0.0201F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 12, 42, 0.0F, -2.075F, -0.925F, 0, 3, 5, 0.0F, false));

        this.Dorsalfinend2 = new AdvancedModelRenderer(this);
        this.Dorsalfinend2.setRotationPoint(0.0F, 3.18F, 1.25F);
        this.Tailbase.addChild(Dorsalfinend2);
        this.setRotateAngle(Dorsalfinend2, -0.0375F, 0.0F, 0.0F);
        this.Dorsalfinend2.cubeList.add(new ModelBox(Dorsalfinend2, 25, 37, 0.0F, -0.9F, -1.0F, 0, 3, 5, 0.0F, false));

        this.Dorsalfinmiddle = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle.setRotationPoint(-0.01F, -1.375F, -0.25F);
        this.Bodyback.addChild(Dorsalfinmiddle);
        this.setRotateAngle(Dorsalfinmiddle, 0.0436F, 0.0F, 0.0F);
        this.Dorsalfinmiddle.cubeList.add(new ModelBox(Dorsalfinmiddle, 24, 14, 0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.Dorsalfinmiddle2 = new AdvancedModelRenderer(this);
        this.Dorsalfinmiddle2.setRotationPoint(-0.01F, 4.28F, -0.075F);
        this.Bodyback.addChild(Dorsalfinmiddle2);
        this.setRotateAngle(Dorsalfinmiddle2, -0.2618F, 0.0F, 0.0F);
        this.Dorsalfinmiddle2.cubeList.add(new ModelBox(Dorsalfinmiddle2, 12, 35, 0.0F, -2.25F, 2.0F, 0, 2, 4, 0.0F, false));

        this.Rightpelvicfinbase = new AdvancedModelRenderer(this);
        this.Rightpelvicfinbase.setRotationPoint(1.975F, 3.3F, -0.25F);
        this.Bodyback.addChild(Rightpelvicfinbase);
        this.setRotateAngle(Rightpelvicfinbase, -0.5032F, -1.2816F, 0.4077F);
        this.Rightpelvicfinbase.cubeList.add(new ModelBox(Rightpelvicfinbase, 44, 46, 0.0F, -0.5F, -0.5F, 7, 3, 0, 0.0F, false));

        this.Leftpelvicfinbase = new AdvancedModelRenderer(this);
        this.Leftpelvicfinbase.setRotationPoint(-1.955F, 3.3F, -0.25F);
        this.Bodyback.addChild(Leftpelvicfinbase);
        this.setRotateAngle(Leftpelvicfinbase, -0.5032F, 1.2816F, -0.4077F);
        this.Leftpelvicfinbase.cubeList.add(new ModelBox(Leftpelvicfinbase, 46, 37, -7.0F, -0.5F, -0.5F, 7, 3, 0, 0.0F, false));

        this.Dorsalfinbase = new AdvancedModelRenderer(this);
        this.Dorsalfinbase.setRotationPoint(0.0F, -0.5F, 2.75F);
        this.Bodymiddleback.addChild(Dorsalfinbase);
        this.setRotateAngle(Dorsalfinbase, 0.0848F, 0.0F, 0.0F);
        this.Dorsalfinbase.cubeList.add(new ModelBox(Dorsalfinbase, 0, 0, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.01F, -0.01F, -7.7F);
        this.Bodymiddlefront.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0213F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 19, 22, -3.01F, -0.4926F, -5.0005F, 6, 7, 5, 0.02F, false));

        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 3.0574F, -3.7005F);
        this.Bodyfront.addChild(Headbase);
        this.setRotateAngle(Headbase, -0.2806F, 0.0F, 0.0F);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 20, 34, -3.5F, -1.5F, -3.0F, 7, 5, 3, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.25F, -2.05F);
        this.Headbase.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, -0.0162F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 19, 0, -2.5F, -3.0F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -0.175F, -3.025F);
        this.Lowerjawbase.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0984F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 46, 29, -2.0F, 0.0653F, -2.5386F, 4, 1, 3, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -1.4426F, -5.0505F);
        this.Bodyfront.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.1721F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 36, 0, -3.0F, 1.0F, -3.0F, 6, 5, 3, 0.01F, false));

        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(0.01F, 0.0F, -2.7F);
        this.Headslope.addChild(Eyes);
        this.setRotateAngle(Eyes, 0.0848F, 0.0F, 0.0F);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 36, 8, -3.01F, 1.0F, -3.0F, 6, 3, 3, 0.0F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Eyes.addChild(Snout);
        this.setRotateAngle(Snout, 0.1061F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 12, 42, -2.5F, 1.0707F, -3.0251F, 5, 2, 3, 0.0F, false));

        this.Upperjawpiece = new AdvancedModelRenderer(this);
        this.Upperjawpiece.setRotationPoint(-0.01F, 3.0F, -3.0F);
        this.Snout.addChild(Upperjawpiece);
        this.setRotateAngle(Upperjawpiece, -0.3821F, 0.0F, 0.0F);
        this.Upperjawpiece.cubeList.add(new ModelBox(Upperjawpiece, 41, 25, -2.5F, -0.9251F, 0.003F, 5, 1, 3, 0.0F, false));

        this.Mouth = new AdvancedModelRenderer(this);
        this.Mouth.setRotationPoint(-0.02F, 4.0F, -3.0F);
        this.Eyes.addChild(Mouth);
        this.setRotateAngle(Mouth, -0.5308F, 0.0F, 0.0F);
        this.Mouth.cubeList.add(new ModelBox(Mouth, 36, 20, -2.99F, -1.99F, 0.0F, 6, 2, 3, -0.01F, false));
        this.Mouth.cubeList.add(new ModelBox(Mouth, 30, 57, -2.49F, 0.0026F, 0.0F, 5, 0, 1, 0.0F, false));

        this.Rightpectoralfinbase = new AdvancedModelRenderer(this);
        this.Rightpectoralfinbase.setRotationPoint(2.5F, 5.1574F, -4.5005F);
        this.Bodyfront.addChild(Rightpectoralfinbase);
        this.setRotateAngle(Rightpectoralfinbase, -0.2546F, -1.1463F, 0.2972F);
        this.Rightpectoralfinbase.cubeList.add(new ModelBox(Rightpectoralfinbase, 43, 17, 0.0F, -1.0F, -0.5F, 8, 3, 0, 0.0F, false));

        this.Leftpectoralfinbase2 = new AdvancedModelRenderer(this);
        this.Leftpectoralfinbase2.setRotationPoint(-2.52F, 5.1574F, -4.5005F);
        this.Bodyfront.addChild(Leftpectoralfinbase2);
        this.setRotateAngle(Leftpectoralfinbase2, -0.2546F, 1.1463F, -0.2972F);
        this.Leftpectoralfinbase2.cubeList.add(new ModelBox(Leftpectoralfinbase2, 43, 14, -8.0F, -1.0F, -0.5F, 8, 3, 0, 0.0F, false));

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
        this.setRotateAngle(Dorsalfinbase, 0.0848F, 0.0F, 0.0F);
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
        this.setRotateAngle(Rightpectoralfinbase, -0.2546F, -1.1463F, 0.2972F);
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
        AdvancedModelRenderer[] finPectoralRight = {this.Rightpectoralfinbase};
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

            this.chainWave(finPectoralRight, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPectoralRight, speed * outOfWater, -0.25F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPectoralRight, speed * outOfWater, -0.15F * outOfWater, 0.8, f2, 1);

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
