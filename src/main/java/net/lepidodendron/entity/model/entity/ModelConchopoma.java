package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraConchopoma;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelConchopoma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;

    public ModelConchopoma() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.25F, -1.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.0F, -6.0F, 6, 8, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 47, 7, 0.0F, -5.0F, 0.5F, 0, 2, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -2.5F, -3.0F, 0.0F, 5, 7, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.525F, 3.5F, 0.75F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.3783F, 0.6194F, -0.2268F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 24, 40, -1.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 34, 35, -0.5F, -1.5F, 0.25F, 0, 3, 5, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.525F, 3.5F, 0.75F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.3783F, -0.6194F, 0.2268F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 24, 40, 0.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 34, 35, 0.5F, -1.5F, 0.25F, 0, 3, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 9, -2.0F, -2.5F, 0.0F, 4, 6, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 37, 0.0F, -5.5F, 0.0F, 0, 3, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -1.5F, -2.5F, 2.0F, 3, 5, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 40, 0.0F, 2.5F, 1.0F, 0, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1667F, 4.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 43, -1.0F, -1.8333F, 0.0F, 2, 4, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 0, -0.025F, 1.9167F, 0.0F, 0, 2, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.025F, -4.8333F, 0.0F, 0, 3, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 0, -0.5F, -1.3333F, 2.0F, 1, 3, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 46, 0.0F, 1.1667F, 2.0F, 0, 2, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 26, 0.0F, -4.3333F, 2.0F, 0, 3, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1667F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 13, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 37, 0.0F, 1.0F, 0.0F, 0, 2, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 37, 0.0F, -3.0F, 0.0F, 0, 2, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 37, 0.0F, -2.5F, 2.0F, 0, 3, 3, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 46, 0.0F, 0.5F, 2.0F, 0, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.1375F, -0.2054F, -6.0447F);
        this.body.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.3625F, -0.0881F, -8.202F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 15, -2.1F, -0.35F, 0.65F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6375F, -0.0881F, -8.202F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 15, 1.1F, -0.35F, 0.65F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.1375F, -0.0881F, -8.202F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 31, -0.5F, -1.45F, 0.2F, 3, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -0.5F, -0.225F, -1.3F, 3, 1, 4, 0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.1375F, -1.9629F, -6.7047F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4581F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 24, -0.5F, -0.0002F, -2.9973F, 3, 1, 3, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.6375F, -2.9196F, -3.8553F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3272F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 26, -0.5F, -0.0101F, -3.0031F, 4, 4, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.6375F, -3.7946F, 0.0447F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 0, -1.5F, 0.0F, -4.0F, 4, 4, 4, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3625F, 2.9155F, -3.7169F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3534F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 34, -2.5F, -1.9878F, -3.0233F, 4, 2, 3, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.1375F, 4.2054F, 0.0447F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3272F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 15, -1.5F, -6.0F, -4.0F, 5, 6, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.8625F, 1.8054F, -2.9553F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.725F, 0.4079F, -0.338F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 32, 44, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.frontLeftFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 9, -0.5F, -0.55F, -0.2F, 1, 1, 3, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.frontLeftFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 26, 0.0F, -1.125F, -2.35F, 0, 3, 7, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.1375F, 1.8054F, -2.9553F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.725F, -0.4079F, 0.338F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 32, 44, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.frontRightFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 9, -0.5F, -0.55F, -0.2F, 1, 1, 3, 0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.frontRightFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 26, 0.0F, -1.125F, -2.35F, 0, 3, 7, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.1375F, 0.9099F, -6.2282F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.998F, -1.9738F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 18, -0.5F, 0.475F, -1.25F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.root.offsetZ = -0.76F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = 0.01F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.root.offsetZ = 0.04F;
        this.root.offsetY = -0.05F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.8F;
        this.root.offsetX = -0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.root.offsetY = 1F;

        AdvancedModelRenderer[] finPectoralLeft = {this.frontLeftFin};
        AdvancedModelRenderer[] finPectoralRight = {this.frontRightFin};
        AdvancedModelRenderer[] finPelvicLeft = {this.backLeftFin};
        AdvancedModelRenderer[] finPelvicRight = {this.backRightFin};
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.15F;
        float outOfWater = 1;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (!((EntityPrehistoricFloraConchopoma) e).isReallyInWater()) {
            outOfWater = 1.45f;
            this.root.bob(speed, 0.35F, false, f2, 1F);
            this.root.offsetY = .2F;
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
            this.swing(root, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75) * outOfWater, (float)Math.toRadians(17.5), false, 0, 0.3F, f2, 1);

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
