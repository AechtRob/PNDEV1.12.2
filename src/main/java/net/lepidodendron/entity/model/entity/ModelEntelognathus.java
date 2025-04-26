package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEntelognathus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEntelognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rfinspike;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer lfinspike;
    private final AdvancedModelRenderer LPectoral;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer LPelvic;

    private ModelAnimator animator;


    public ModelEntelognathus() {
        this.textureWidth = 56;
        this.textureHeight = 50;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 19, 28, -3.5F, -1.5F, -6.0F, 7, 4, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, -4.0F, -2.5F, -4.0F, 8, 5, 4, 0.0F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(-0.5F, -2.5F, -4.0F);
        this.Head.addChild(forehead2);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 40, 17, -2.5F, -0.15F, 0.0F, 6, 1, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.75F, -0.25F, 2.0F);
        this.forehead2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 0, -3.25F, 0.1F, 0.0F, 6, 1, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 8, 43, -3.0F, -0.5381F, -0.8087F, 6, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 45, 7, -2.0F, -0.5381F, -1.8087F, 4, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 33, -1.0F, -0.5381F, -2.8087F, 2, 1, 1, 0.0F, false));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.25F, 2.0F, -6.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 30, 38, -3.25F, -2.01F, -2.0F, 6, 2, 2, 0.01F, false));
        this.lips.cubeList.add(new ModelBox(lips, 23, 43, -2.75F, -2.01F, -3.0F, 5, 2, 1, 0.01F, false));
        this.lips.cubeList.add(new ModelBox(lips, 13, 25, -1.25F, -1.0F, -4.0F, 2, 1, 1, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-0.75F, 0.0F, -4.0F);
        this.lips.addChild(nose);
        this.setRotateAngle(nose, -0.5672F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 37, 43, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.nose.addChild(forehead);
        this.setRotateAngle(forehead, -0.2531F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 15, 35, -2.0F, -6.0F, 0.0F, 5, 5, 2, 0.0F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 45, 4, -1.5F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.75F, -0.5F, 1.0F);
        this.forehead.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.0F, 0.5672F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.eye.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(1.75F, -0.5F, 1.0F);
        this.forehead.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.5672F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.eye2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.rfinspike = new AdvancedModelRenderer(this);
        this.rfinspike.setRotationPoint(-4.0F, 1.75F, -4.0F);
        this.Head.addChild(rfinspike);
        this.setRotateAngle(rfinspike, 0.0F, 0.7854F, 0.0F);
        this.rfinspike.cubeList.add(new ModelBox(rfinspike, 13, 22, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.rfinspike.addChild(RPectoral);
        this.setRotateAngle(RPectoral, 0.0038F, 0.0872F, -0.1307F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 17, 0, -6.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, false));

        this.lfinspike = new AdvancedModelRenderer(this);
        this.lfinspike.setRotationPoint(4.0F, 1.75F, -4.0F);
        this.Head.addChild(lfinspike);
        this.setRotateAngle(lfinspike, 0.0F, -0.7854F, 0.0F);
        this.lfinspike.cubeList.add(new ModelBox(lfinspike, 13, 22, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.LPectoral = new AdvancedModelRenderer(this);
        this.LPectoral.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.lfinspike.addChild(LPectoral);
        this.setRotateAngle(LPectoral, 0.0038F, -0.0872F, 0.1307F);
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 17, 0, 0.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 21, 18, -3.5F, -2.0F, 0.0F, 7, 5, 4, -0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -2.0F, 0.0F, 5, 5, 6, -0.02F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 41, 23, 0.0F, -6.0F, 1.0F, 0, 4, 5, 0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(-0.5F, 0.1F, 5.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 22, -1.0F, -2.0F, 0.0F, 3, 4, 6, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 41, 43, 0.5F, -6.0F, 1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.Tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 43, 0.5F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3F, 5.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 33, -0.5F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.2618F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 32, 29, 0.0F, -1.0F, -0.5F, 1, 2, 6, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 32, 0, 0.5F, 1.0F, -0.5F, 0, 4, 6, 0.01F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.5F, 0.0F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 42, -0.5F, -0.5F, -0.5F, 1, 1, 5, -0.01F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 21, 5, 0.0F, 0.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-2.5F, 2.5F, 1.5F);
        this.Body2.addChild(RPelvic);
        this.setRotateAngle(RPelvic, -0.0562F, 0.8653F, -0.2282F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 32, 12, -4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.LPelvic = new AdvancedModelRenderer(this);
        this.LPelvic.setRotationPoint(2.5F, 2.5F, 1.5F);
        this.Body2.addChild(LPelvic);
        this.setRotateAngle(LPelvic, -0.0562F, -0.8653F, 0.2282F);
        this.LPelvic.cubeList.add(new ModelBox(LPelvic, 32, 12, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

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
        this.Root.offsetY = -0.21F;
        this.Root.offsetZ = 0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(nose, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(eye, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(rfinspike, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(lfinspike, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(LPectoral, 0.0038F, -0.0872F, 0.1307F);
        this.setRotateAngle(Body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Tail, 0.1064F, -0.6082F, -0.061F);
        this.setRotateAngle(Tail2, 0.1962F, -0.4721F, -0.0902F);
        this.setRotateAngle(Tail3, 0.2823F, 0.3786F, 0.1068F);
        this.setRotateAngle(Tail4, -0.1064F, 0.6082F, -0.061F);
        this.setRotateAngle(RPelvic, -0.0562F, 0.8653F, -0.2282F);
        this.setRotateAngle(LPelvic, -0.0562F, -0.8653F, 0.2282F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetX = -0.F;
        this.Root.offsetY = 0.1F;
        this.Root.offsetZ = -0.0F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -0.8F;
        this.Root.offsetX = -0.4F;
        this.Root.offsetZ = 2.0F;
        this.Root.rotateAngleY = (float)Math.toRadians(120);
        this.Root.rotateAngleX = (float)Math.toRadians(1);
        this.Root.rotateAngleZ = (float)Math.toRadians(0);
        this.Root.scaleChildren = true;
        float scaler = 3.6F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(nose, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(eye, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(rfinspike, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(lfinspike, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(LPectoral, 0.0038F, -0.0872F, 0.1307F);
        this.setRotateAngle(Body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Tail, 0.1064F, -0.6082F, -0.061F);
        this.setRotateAngle(Tail2, 0.1962F, -0.4721F, -0.0902F);
        this.setRotateAngle(Tail3, 0.2823F, 0.3786F, 0.1068F);
        this.setRotateAngle(Tail4, -0.1064F, 0.6082F, -0.061F);
        this.setRotateAngle(RPelvic, -0.0562F, 0.8653F, -0.2282F);
        this.setRotateAngle(LPelvic, -0.0562F, -0.8653F, 0.2282F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        EntityPrehistoricFloraEntelognathus entelo = (EntityPrehistoricFloraEntelognathus) e;
        float speed = 0.2F;
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
        if (isAtBottom && !entelo.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.27F;
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
            if(isAtBottom && !entelo.getIsFast()) {
                this.walk(Jaw, (float) (speed * 0.2), (float) Math.toRadians(7.5), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(Jaw, (float) (speed * 0.4), (float) Math.toRadians(10), true, 0.2F, -0.25F, f2, 1);
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
                //this.Root.offsetY = -0.02F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
