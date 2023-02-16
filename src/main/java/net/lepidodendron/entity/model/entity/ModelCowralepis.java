package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCowralepis;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllolepis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCowralepis extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer rside;
    private final AdvancedModelRenderer rside2;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer rside3;
    private final AdvancedModelRenderer lside;
    private final AdvancedModelRenderer lside2;
    private final AdvancedModelRenderer LPectoral;
    private final AdvancedModelRenderer lside3;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer LPelvic;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;


    public ModelCowralepis() {
        this.textureWidth = 56;
        this.textureHeight = 56;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.75F, -2.75F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -2.5F, -0.5F, -9.25F, 5, 1, 10, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 24, 16, -3.5F, 0.25F, -4.5F, 7, 1, 5, 0.01F, false));

        this.rside = new AdvancedModelRenderer(this);
        this.rside.setRotationPoint(-2.5F, 0.5F, -9.25F);
        this.Head.addChild(rside);
        this.setRotateAngle(rside, 0.0F, -0.5236F, 0.0F);
        this.rside.cubeList.add(new ModelBox(rside, 0, 44, 0.0F, -0.98F, 0.0F, 2, 1, 3, 0.0F, false));

        this.rside2 = new AdvancedModelRenderer(this);
        this.rside2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rside.addChild(rside2);
        this.setRotateAngle(rside2, 0.0F, 0.48F, 0.0F);
        this.rside2.cubeList.add(new ModelBox(rside2, 0, 27, 0.0F, -0.99F, 0.0F, 2, 1, 7, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(0.5F, 0.0F, 6.75F);
        this.rside2.addChild(RPectoral);
        this.setRotateAngle(RPectoral, 0.0F, 0.6981F, -0.0873F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 0, 21, -8.0F, 0.0F, -1.0F, 9, 0, 5, 0.0F, false));
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, -4, 51, -8.0F, 0.05F, -1.0F, 9, 0, 5, 0.0F, false));
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 20, 32, -2.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rside3 = new AdvancedModelRenderer(this);
        this.rside3.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.rside2.addChild(rside3);
        this.setRotateAngle(rside3, 0.0F, -0.3054F, 0.0F);
        this.rside3.cubeList.add(new ModelBox(rside3, 0, 0, 0.0F, -0.49F, 0.0F, 1, 1, 3, -0.01F, false));

        this.lside = new AdvancedModelRenderer(this);
        this.lside.setRotationPoint(2.5F, 0.5F, -9.25F);
        this.Head.addChild(lside);
        this.setRotateAngle(lside, 0.0F, 0.5236F, 0.0F);
        this.lside.cubeList.add(new ModelBox(lside, 0, 44, -2.0F, -0.98F, 0.0F, 2, 1, 3, 0.0F, true));

        this.lside2 = new AdvancedModelRenderer(this);
        this.lside2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.lside.addChild(lside2);
        this.setRotateAngle(lside2, 0.0F, -0.48F, 0.0F);
        this.lside2.cubeList.add(new ModelBox(lside2, 0, 27, -2.0F, -0.99F, 0.0F, 2, 1, 7, 0.0F, true));

        this.LPectoral = new AdvancedModelRenderer(this);
        this.LPectoral.setRotationPoint(-0.5F, 0.0F, 6.75F);
        this.lside2.addChild(LPectoral);
        this.setRotateAngle(LPectoral, 0.0F, -0.6981F, 0.0873F);
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 0, 21, -1.0F, 0.0F, -1.0F, 9, 0, 5, 0.0F, true));
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, -4, 51, -1.0F, 0.05F, -1.0F, 9, 0, 5, 0.0F, true));
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 20, 32, -1.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.lside3 = new AdvancedModelRenderer(this);
        this.lside3.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.lside2.addChild(lside3);
        this.setRotateAngle(lside3, 0.0F, 0.3054F, 0.0F);
        this.lside3.cubeList.add(new ModelBox(lside3, 0, 0, -1.0F, -0.49F, 0.0F, 1, 1, 3, -0.01F, true));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -0.5F, -9.25F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.1309F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 40, 0, -2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.forehead.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -3.5F, 0.0F, 0.0F, 7, 1, 7, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.75F, -4.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 9, -3.5F, -0.5F, -2.75F, 7, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 44, 14, -2.425F, -0.52F, -4.7F, 2, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 22, 12, -0.5F, -0.52F, -4.7F, 1, 1, 2, 0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 5, 0.425F, -0.52F, -4.7F, 2, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 40, 24, -3.5F, -1.25F, -0.75F, 7, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -0.5F, -2.75F);
        this.Jaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5061F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 16, -2.0F, -0.04F, -2.225F, 2, 1, 1, -0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 40, -2.0F, -0.04F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, -0.5F, -2.75F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5061F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 16, 0.0F, -0.04F, -2.225F, 2, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 40, 0.0F, -0.04F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 21, 0, -3.5F, -0.75F, 0.0F, 6, 2, 6, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(-1.0F, 1.25F, 5.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 24, 24, -2.0F, -1.99F, 0.0F, 5, 2, 5, -0.02F, false));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-2.0F, -0.25F, 1.75F);
        this.Body2.addChild(RPelvic);
        this.setRotateAngle(RPelvic, -0.0503F, 0.5214F, -0.1007F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 14, 41, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.LPelvic = new AdvancedModelRenderer(this);
        this.LPelvic.setRotationPoint(3.0F, -0.25F, 1.75F);
        this.Body2.addChild(LPelvic);
        this.setRotateAngle(LPelvic, -0.0503F, -0.5214F, 0.1007F);
        this.LPelvic.cubeList.add(new ModelBox(LPelvic, 14, 41, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.5F, -1.25F, 4.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 27, 32, -2.0F, -0.75F, 0.0F, 4, 2, 5, -0.03F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 12, 0.0F, -2.72F, 2.0F, 0, 2, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 36, -1.5F, -1.0F, 0.0F, 3, 2, 5, -0.04F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.3054F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 22, 40, -1.0F, -1.0F, 0.0F, 2, 2, 5, -0.05F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 41, 27, 0.0F, 0.96F, 0.0F, 0, 3, 5, 0.01F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.1F, 4.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1309F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 37, 40, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 12, 29, 0.0F, -1.0F, 0.0F, 0, 5, 7, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleX = (float) Math.toRadians(90);
        this.Root.rotateAngleZ = (float) Math.toRadians(90);
        this.Root.offsetX = -0.1F;
        this.Root.offsetY = -0.23F;
        this.Root.offsetZ = 0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(rside, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(rside2, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(RPectoral, 0.0F, 1.0472F, -0.0873F);
        this.setRotateAngle(rside3, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(lside, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(lside2, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(LPectoral, 0.0F, -0.1745F, 0.0873F);
        this.setRotateAngle(lside3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(forehead, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(RPelvic, -0.0503F, 0.5214F, -0.1007F);
        this.setRotateAngle(LPelvic, -0.0503F, -0.5214F, 0.1007F);
        this.setRotateAngle(Tail, 0.0915F, -0.3042F, -0.0275F);
        this.setRotateAngle(Tail2, 0.1548F, -0.5618F, -0.083F);
        this.setRotateAngle(Tail3, 0.3237F, -0.3323F, -0.109F);
        this.setRotateAngle(Tail4, -0.1509F, 0.5187F, -0.0752F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetX = -0.1F;
        this.Root.offsetY = -0.05F;
        this.Root.offsetZ = 0.03F;
        this.Root.render(0.01F);
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
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        EntityPrehistoricFloraCowralepis cowra = (EntityPrehistoricFloraCowralepis) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        float finDegreeZ = (float)Math.toRadians(25);
        float finDegreeY = (float)Math.toRadians(7.5);
        if (isAtBottom && !cowra.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.23F;
            bottomModifier = 0.8F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(15);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(Root, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !cowra.getIsFast()) {
                this.walk(Jaw, (float) (speed * 0.2), (float) Math.toRadians(20), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(Jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(LPectoral, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(LPectoral, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(RPectoral, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(RPectoral, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(LPelvic, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(LPelvic, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(RPelvic, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(RPelvic, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Root.offsetY = -0.02F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
