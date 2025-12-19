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
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Headshouldnotmove;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rfinspike;
    private final AdvancedModelRenderer rfinspike2;
    private final AdvancedModelRenderer pectralfinright;
    private final AdvancedModelRenderer pectralfinleft;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;

    private ModelAnimator animator;


    public ModelEntelognathus() {
        this.textureWidth = 56;
        this.textureHeight = 80;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.Root.cubeList.add(new ModelBox(Root, 0, 49, -3.5F, -3.0F, -1.75F, 7, 5, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, -2.075F, -0.85F);
        this.Root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0742F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 56, -2.75F, -2.0F, 1.0F, 6, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.25F, -1.475F, -2.125F);
        this.Root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 52, -2.75F, -2.0F, 1.0F, 6, 1, 2, 0.0F, false));

        this.Headshouldnotmove = new AdvancedModelRenderer(this);
        this.Headshouldnotmove.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.Root.addChild(Headshouldnotmove);
        this.Headshouldnotmove.cubeList.add(new ModelBox(Headshouldnotmove, 19, 28, -3.5F, -1.5F, -6.0F, 7, 4, 2, 0.0F, false));
        this.Headshouldnotmove.cubeList.add(new ModelBox(Headshouldnotmove, 0, 12, -4.0F, -2.5F, -4.0F, 8, 5, 4, 0.0F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(-0.5F, -2.5F, -4.0F);
        this.Headshouldnotmove.addChild(forehead2);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 40, 17, -2.5F, -0.15F, 0.0F, 6, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -0.25F, 1.95F);
        this.forehead2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0087F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, -3.25F, 0.1F, 0.0F, 6, 1, 2, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Headshouldnotmove.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 8, 43, -3.0F, -0.5381F, -0.8087F, 6, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 45, 7, -2.0F, -0.5381F, -1.8087F, 4, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 33, -1.0F, -0.5381F, -2.8087F, 2, 1, 1, 0.0F, false));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.25F, 2.0F, -6.0F);
        this.Headshouldnotmove.addChild(lips);
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


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.eye.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(1.75F, -0.5F, 1.0F);
        this.forehead.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.5672F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.eye2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.rfinspike = new AdvancedModelRenderer(this);
        this.rfinspike.setRotationPoint(-4.0F, 2.0F, -2.75F);
        this.Headshouldnotmove.addChild(rfinspike);
        this.setRotateAngle(rfinspike, 0.0F, 0.7854F, 0.0F);
        this.rfinspike.cubeList.add(new ModelBox(rfinspike, 13, 22, -2.0F, -0.5F, 0.0F, 2, 1, 1, -0.01F, false));

        this.rfinspike2 = new AdvancedModelRenderer(this);
        this.rfinspike2.setRotationPoint(4.0F, 2.0F, -2.75F);
        this.Headshouldnotmove.addChild(rfinspike2);
        this.setRotateAngle(rfinspike2, 0.0F, -0.7854F, 0.0F);
        this.rfinspike2.cubeList.add(new ModelBox(rfinspike2, 13, 22, 0.0F, -0.5F, 0.0F, 2, 1, 1, -0.01F, true));

        this.pectralfinright = new AdvancedModelRenderer(this);
        this.pectralfinright.setRotationPoint(-3.75F, 1.25F, -2.75F);
        this.Root.addChild(pectralfinright);
        this.setRotateAngle(pectralfinright, -0.2498F, 0.7528F, -0.4933F);
        this.pectralfinright.cubeList.add(new ModelBox(pectralfinright, 20, 1, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.pectralfinleft = new AdvancedModelRenderer(this);
        this.pectralfinleft.setRotationPoint(3.75F, 1.25F, -2.75F);
        this.Root.addChild(pectralfinleft);
        this.setRotateAngle(pectralfinleft, -0.2498F, -0.7528F, 0.4933F);
        this.pectralfinleft.cubeList.add(new ModelBox(pectralfinleft, 20, 1, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Root.addChild(Body);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9F, -0.4F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 62, -2.0F, 0.0F, 0.0F, 4, 2, 4, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.15F, 2.6F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 64, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.75F, -1.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 1, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.1F, 4.0F);
        this.Body.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 4.7F, -0.55F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6109F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 65, 0.5F, -1.0F, 4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 2.8F, -1.65F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 62, -0.5F, -3.0F, 1.0F, 2, 3, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.1F, -1.75F);
        this.Tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 1, 34, -0.5F, -2.0F, 1.0F, 2, 2, 4, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3F, 3.4F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.1278F, -1.4743F);
        this.Tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.192F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 70, 0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.6778F, 0.3257F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 69, 0.5F, -0.5F, 0.0F, 0, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -0.1722F, -0.4243F);
        this.Tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 42, 0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.75F, 2.0F, 3.75F);
        this.Root.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.0562F, 0.8653F, -0.2282F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 37, 15, -1.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.75F, 2.0F, 3.75F);
        this.Root.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.0562F, -0.8653F, 0.2282F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 37, 15, -0.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleX = (float) Math.toRadians(0);
        this.Root.rotateAngleZ = (float) Math.toRadians(0);
        this.Root.offsetX = -0.F;
        this.Root.offsetY = -0.25F;
        this.Root.offsetZ = -0.13F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0961F, -0.0565F, -0.0054F);
        this.setRotateAngle(cube_r1, -0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(eye, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(forehead, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Headshouldnotmove, -0.1004F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, -0.2923F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(nose, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(pectralfinleft, -0.2613F, -0.4966F, 0.5324F);
        this.setRotateAngle(pectralfinright, -0.1724F, 0.7702F, -0.3812F);
        this.setRotateAngle(pelvicfinleft, -0.0562F, -0.8653F, 0.2282F);
        this.setRotateAngle(pelvicfinright, -0.0562F, 0.8653F, -0.2282F);
        this.setRotateAngle(rfinspike, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(rfinspike2, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(Root, -0.2397F, 0.0114F, 0.0466F);
        this.setRotateAngle(Tail, 0.0933F, -0.3607F, -0.033F);
        this.setRotateAngle(Tail2, 0.1655F, -0.1183F, 0.0186F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetX = -0.F;
        this.Root.offsetY = -0.1F;
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
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2};
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
            this.flap(pectralfinleft, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(pectralfinleft, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(pectralfinright, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(pectralfinright, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(pectralfinleft, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(pectralfinleft, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(pectralfinright, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(pectralfinright, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Root.offsetY = -0.02F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
