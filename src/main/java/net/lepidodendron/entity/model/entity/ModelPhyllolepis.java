package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllolepis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPhyllolepis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;


    public ModelPhyllolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -3.0F, -1.0F, 6, 3, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 11, -2.0F, -3.25F, -0.5F, 4, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 34, 9, -2.5F, -3.0F, -3.0F, 5, 3, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 0, -2.0F, -1.0F, -4.0F, 4, 1, 1, -0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 32, -1.5F, -2.0F, -7.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.8044F, -1.0F, -4.8539F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4342F, 1.4264F, 0.4382F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 36, -3.8512F, -1.0F, -0.0254F, 3, 2, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 39, -0.8512F, -1.025F, -0.0254F, 1, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.8044F, -1.0F, -4.8539F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4342F, -1.4264F, -0.4382F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 36, 0.8512F, -1.0F, -0.0254F, 3, 2, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 39, -0.1488F, -1.025F, -0.0254F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.0F, -7.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7418F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 38, -3.0F, -1.0F, 0.0F, 3, 1, 3, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.0F, -7.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7418F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 38, 0.0F, -1.0F, 0.0F, 3, 1, 3, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -2.8468F, -3.0716F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2531F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 39, -0.5F, 0.1201F, -2.9417F, 1, 1, 3, -0.001F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 39, 3.5F, 0.1201F, -2.9417F, 1, 1, 3, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2574F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 34, -1.5F, 0.0F, -4.0F, 3, 1, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-6.7461F, -1.25F, 4.721F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1178F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.1421F, -1.0F, -0.0958F, 2, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(6.7461F, -1.25F, 4.721F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1178F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.1421F, -1.0F, -0.0958F, 2, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.25F, -1.0F, 5.75F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, -4.5F, -1.25F, -6.575F, 4, 2, 7, 0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.25F, -1.0F, 5.75F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, 0.5F, -1.25F, -6.575F, 4, 2, 7, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0998F, -1.0343F, -3.9575F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 20, -1.5998F, 0.0343F, -3.0425F, 3, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5998F, 0.0343F, -3.0425F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7418F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 37, -3.0F, 0.0F, 0.0F, 3, 1, 3, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.4002F, 0.0343F, -3.0425F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.7418F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 37, 0.0F, 0.0F, 0.0F, 3, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.9042F, 0.0343F, -0.8964F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4342F, 1.4264F, 0.4382F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 0, -0.8512F, -0.05F, -0.0254F, 1, 1, 3, -0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.7046F, 0.0343F, -0.8964F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4342F, -1.4264F, -0.4382F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 0, -0.1488F, -0.05F, -0.0254F, 1, 1, 3, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, 5.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 19, 0, -2.0F, -0.1F, -1.0F, 4, 2, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.7351F, 3.067F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 12, 0.0F, -0.725F, -2.5F, 0, 2, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.1F, 0.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 27, -2.0F, 0.1F, 0.0F, 4, 1, 4, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.0F, 0.9F, 0.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.24F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 14, 0.0F, -1.0F, 0.0F, 1, 2, 4, -0.001F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.0F, 0.9F, 0.0F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.24F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 14, -1.0F, -1.0F, 0.0F, 1, 2, 4, -0.001F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.2092F, 1.65F, 2.733F);
        this.body.addChild(backleftfin);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.9592F, 0.0F, 0.292F);
        this.backleftfin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 2, 44, -0.8619F, 0.0F, -1.3087F, 5, 0, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.2092F, 1.65F, 2.733F);
        this.body.addChild(backrightfin);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.9592F, 0.0F, 0.292F);
        this.backrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3927F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 44, -4.1381F, 0.0F, -1.3087F, 5, 0, 3, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.9831F, 1.575F, -0.5004F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.829F, 0.0F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 10, 18, -1.5589F, 0.0F, -1.616F, 4, 0, 5, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.9831F, 1.575F, -0.5004F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, -0.829F, 0.0F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 10, 18, -2.4411F, 0.0F, -1.616F, 4, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7109F, 3.525F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 20, -1.5F, -0.8109F, -0.2F, 3, 2, 5, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.8109F, 2.3F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1004F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 25, -1.5F, -0.25F, -2.55F, 3, 1, 5, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0F, 0.1891F, -0.2F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1004F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 5, 31, 0.0F, -1.0F, 0.0F, 1, 2, 5, -0.001F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 0.1891F, -0.2F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1004F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 5, 31, -1.0F, -1.0F, 0.0F, 1, 2, 5, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1891F, 4.25F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 27, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 5, 0.0F, -2.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 5, 0.0F, 1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 25, -0.5F, -0.75F, 0.0F, 1, 2, 5, 0.001F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 26, 0.0F, -2.75F, 0.0F, 0, 5, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 2, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.001F, -3.0F, 0.0F, 0, 5, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.23F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.829F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.0F, -0.829F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.3927F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.05F;
        this.main.offsetY = -0.08F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
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
        this.main.offsetZ = -0.2F;
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        EntityPrehistoricFloraPhyllolepis phyllo = (EntityPrehistoricFloraPhyllolepis) e;
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
        if (isAtBottom && !phyllo.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.25F;
            bottomModifier = 0.9F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(10);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !phyllo.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.2), (float) Math.toRadians(20), true, 0.5F, -0.3F, f2, 1);
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
                this.main.offsetY = -0.02F;
                this.main.offsetZ = -0.2F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
