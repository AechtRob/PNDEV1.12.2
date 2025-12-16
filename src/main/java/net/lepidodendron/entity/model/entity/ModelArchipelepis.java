package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelArchipelepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelArchipelepis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -3.0F, -7.0F, 6, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 5, 3.075F, -1.5F, -6.65F, 0, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 5, -3.075F, -1.5F, -6.65F, 0, 1, 5, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 18, -2.0F, -2.5F, -8.675F, 4, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 12, -2.0F, -2.0F, -8.7F, 4, 1, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -1.5F, -7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 24, -0.15F, -1.0F, -1.275F, 1, 2, 2, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, -1.5F, -7.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 24, -0.85F, -1.0F, -1.275F, 1, 2, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -6.675F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 0, -2.0F, -1.0F, -2.05F, 4, 1, 2, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -6.675F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 20, -2.0F, 0.025F, -2.075F, 4, 1, 2, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.5F, -1.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -2.0F, -1.5F, 0.0F, 4, 3, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 14, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.65F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -1.0F, -0.75F, 0.0F, 2, 1, 3, -0.001F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 12, -1.0F, -0.25F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6515F, 1.4504F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 24, 0.0F, -1.025F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 21, -0.5F, -0.275F, -0.225F, 1, 1, 3, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = -0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(230);
        this.root.rotateAngleX = (float)Math.toRadians(20);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

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
        //this.root.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
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
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 0.95F;
                this.bob(root, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
