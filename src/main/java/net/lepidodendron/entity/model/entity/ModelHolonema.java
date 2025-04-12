package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHolonema;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelHolonema extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer headshield;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;


    public ModelHolonema() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.headshield = new AdvancedModelRenderer(this);
        this.headshield.setRotationPoint(0.0F, 21.114F, -2.9319F);
        this.headshield.cubeList.add(new ModelBox(headshield, 0, 12, -4.0F, -4.114F, -0.0681F, 8, 7, 7, 0.0F, false));
        this.headshield.cubeList.add(new ModelBox(headshield, 26, 47, 3.2674F, 0.386F, 2.5026F, 2, 2, 2, 0.01F, false));
        this.headshield.cubeList.add(new ModelBox(headshield, 26, 47, -5.2674F, 0.386F, 2.5026F, 2, 2, 2, 0.01F, true));
        this.headshield.cubeList.add(new ModelBox(headshield, 0, 37, -3.5F, -1.364F, -4.0681F, 7, 3, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.886F, -0.0681F);
        this.headshield.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, -3.5F, -2.0377F, -3.9801F, 7, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.2412F, -6.9041F);
        this.headshield.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 31, -3.0F, -0.035F, 0.0215F, 6, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.382F, -4.6942F);
        this.headshield.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -3.01F, -0.5F, -0.5F, 0, 1, 1, 0.01F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, 3.01F, -0.5F, -0.5F, 0, 1, 1, 0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.9912F, -4.4041F);
        this.headshield.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6545F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, -3.0F, -0.1685F, -3.0273F, 6, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.5931F, 5.1372F);
        this.headshield.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 21, -3.5F, -0.0369F, -0.1185F, 7, 5, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.1384F, -0.0747F);
        this.headshield.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 31, -3.5F, -0.0355F, 0.1133F, 7, 3, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.614F, 0.9319F);
        this.headshield.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 39, -3.5F, 0.0F, -6.0F, 7, 3, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, 0.386F, -0.3181F);
        this.headshield.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 44, -0.1241F, 0.0F, -1.8079F, 2, 2, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, 0.386F, -0.3181F);
        this.headshield.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 44, -1.8759F, 0.0F, -1.8079F, 2, 2, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.886F, 6.9319F);
        this.headshield.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 6, -3.5F, -3.0F, 0.0F, 7, 3, 3, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(4.0F, 1.386F, 4.4319F);
        this.headshield.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.2618F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.2393F, 0.0F, 0.1632F);
        this.frontleftfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.0036F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -7.5F, 0.0F, 0.0F, 8, 0, 12, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.2393F, 0.0F, 0.1632F);
        this.frontleftfin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.0036F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 15, -2.0F, -0.5F, -2.0F, 2, 1, 6, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-4.0F, 1.386F, 4.4319F);
        this.headshield.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.2618F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2393F, 0.0F, 0.1632F);
        this.frontrightfin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.0036F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, 0.0F, 0.0F, 8, 0, 12, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.2393F, 0.0F, 0.1632F);
        this.frontrightfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.0036F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 15, 0.0F, -0.5F, -2.0F, 2, 1, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.364F, 9.6819F);
        this.headshield.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 23, 6, -3.0F, 0.0F, -0.5F, 6, 5, 6, 0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 4.5F, 3.5F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.3054F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 10, 26, -0.5F, 0.0F, 0.0F, 4, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 4.5F, 3.5F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.3054F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 10, 26, -3.5F, 0.0F, 0.0F, 4, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -2.0F, 0.0436F, -0.001F, 4, 4, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.8737F, 4.2829F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -1.75F, -3.0F, 0, 5, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2936F, 6.999F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 36, -1.5F, -0.0436F, -0.999F, 3, 3, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.9564F, 0.001F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6109F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 9, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2064F, 4.001F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -1.0F, -0.0872F, -0.9981F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, -0.0872F, 3.0019F);
        this.tail3.addChild(tail4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -1.25F, 2.75F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 47, -0.5F, -0.0293F, -0.0206F, 1, 1, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 45, -0.5F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.8737F, 3.0805F);
        this.tail4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 7, 0.0F, -2.0164F, -5.0F, 0, 4, 10, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.236F, -4.0681F);
        this.headshield.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.4765F, -2.367F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 22, -3.0F, 1.0272F, 0.0215F, 6, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.headshield.render(f5);
    }

    public void renderStaticWall(float f) {
        this.headshield.rotateAngleY = (float) Math.toRadians(90);
        this.headshield.offsetX = -0.1F;
        this.headshield.offsetY = -0.2F;
        this.headshield.offsetZ = 0.01F;
        this.headshield.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(headshield, -0.2F, -0.2F, 0.2F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.2F, 0.3F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.2F, -0.3F, 0.0F);
        this.headshield.offsetZ = -0.08F;
        this.headshield.offsetY = -0.109F;
        this.headshield.offsetX = 0.03F;
        this.headshield.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.headshield.offsetY = -0.4F;
        this.headshield.offsetX = 0.5F;
        this.headshield.offsetZ = 2.0F;
        this.headshield.rotateAngleY = (float)Math.toRadians(120);
        this.headshield.rotateAngleX = (float)Math.toRadians(1);
        this.headshield.rotateAngleZ = (float)Math.toRadians(0);
        this.headshield.scaleChildren = true;
        float scaler = 1.0F;
        this.headshield.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(headshield, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.2F, 0.3F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.2F, -0.3F, 0.0F);
        //End of pose, now render the model:
        this.headshield.render(f);
        //Reset rotations, positions and sizing:
        this.headshield.setScale(1.0F, 1.0F, 1.0F);
        this.headshield.scaleChildren = false;
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
        this.headshield.offsetY = -0.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.tail, this.tail2, this.tail3, this.tail4};
        EntityPrehistoricFloraHolonema holonema = (EntityPrehistoricFloraHolonema) e;
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
        if (isAtBottom && !holonema.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
            bottomModifier = 0.5F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(15);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(headshield, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !holonema.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.25), (float) Math.toRadians(25), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.headshield.offsetY = 0.0F;
                this.bob(headshield, -speed, 1F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
