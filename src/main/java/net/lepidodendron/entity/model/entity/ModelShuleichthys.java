package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelShuleichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelShuleichthys() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.15F, -4.5F);
        this.body.cubeList.add(new ModelBox(body, 26, 28, -1.225F, 1.25F, -1.75F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 28, 0.225F, 1.25F, -1.75F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 14, 10, -1.5F, -0.125F, 1.8F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, 4.7F, 0.9F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 7, 0.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4F, 4.7F, 0.9F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 7, -1.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.8F, 0.8F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 24, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.675F, -2.075F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 3, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.175F, -2.625F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 20, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.775F, 0.625F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 13, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.225F, -0.975F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 24, -1.0F, 0.0F, -2.0F, 2, 3, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.075F, 2.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 7, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 17, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.175F, -1.525F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 0, -1.0F, -0.75F, -2.0F, 2, 1, 2, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, 4.15F, 2.15F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 1.3526F, -0.2618F, 0.2618F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 24, 28, 0.0F, -0.65F, -0.5F, 0, 3, 1, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, 4.15F, 2.15F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 1.3526F, 0.2618F, -0.2618F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 24, 28, 0.0F, -0.65F, -0.5F, 0, 3, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.9F, 4.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -2.025F, -0.25F, 3, 5, 5, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.85F, 2.55F, 2.95F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.8727F, -0.2182F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 24, 7, 0.0F, -0.125F, -0.5F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.85F, 2.55F, 2.95F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.8727F, 0.2182F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 24, 7, 0.0F, -0.125F, -0.5F, 0, 2, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.15F, 4.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.275F, 1.6609F, 1.3752F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 24, -1.275F, -1.0F, 1.0F, 2, 2, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 1.6859F, -0.3998F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 18, -1.25F, -2.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.2359F, 3.4502F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.2217F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, 0.0F, -3.0F, 0.5F, 0, 5, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.9641F, 0.3502F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9425F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 27, 0.0F, -3.0F, 0.5F, 0, 4, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.225F, -0.0641F, -0.6998F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -1.225F, -2.0F, 0.0F, 2, 3, 5, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.0641F, 3.9502F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.1309F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.15F, -1.1F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1484F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 0, -0.5F, -2.0F, -0.5F, 1, 2, 5, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.025F, 2.6F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 18, 0.0F, -3.0F, 0.5F, 0, 5, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.75F, -1.2F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1134F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 18, -0.5F, -2.0F, 0.5F, 1, 2, 4, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = -0.2F;
        this.body.rotateAngleY = (float)Math.toRadians(230);
        this.body.rotateAngleX = (float)Math.toRadians(20);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.body.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};

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
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 0.95F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
