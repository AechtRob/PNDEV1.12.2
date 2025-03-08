package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTriopus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer triopus;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer anntennae;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftleg_1;
    private final AdvancedModelRenderer leftleg_2;
    private final AdvancedModelRenderer leftleg_3;
    private final AdvancedModelRenderer leftleg_4;
    private final AdvancedModelRenderer rightleg_1;
    private final AdvancedModelRenderer rightleg_2;
    private final AdvancedModelRenderer rightleg_3;
    private final AdvancedModelRenderer rightleg_4;
    private final AdvancedModelRenderer furace;
    private final AdvancedModelRenderer furace2;

    public ModelTriopus() {
        this.textureWidth = 20;
        this.textureHeight = 20;

        this.triopus = new AdvancedModelRenderer(this);
        this.triopus.setRotationPoint(-0.5F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.5F, -2.5F, -3.0F);
        this.triopus.addChild(cephalon);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.1687F, -0.2925F);
        this.cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5042F, 0.272F, -0.4531F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 14, -2.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.1687F, -0.2925F);
        this.cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5042F, -0.272F, 0.4531F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 14, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, -0.4F);
        this.cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 4, 0.0F, 0.2F, -1.0F, 1, 1, 1, -0.002F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 0, 0.0F, 0.2F, -2.0F, 1, 0, 1, 0.0F, false));

        this.anntennae = new AdvancedModelRenderer(this);
        this.anntennae.setRotationPoint(0.625F, 1.55F, -0.65F);
        this.cephalon.addChild(anntennae);
        this.anntennae.cubeList.add(new ModelBox(anntennae, -1, 9, -0.5F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.625F, 1.55F, -1.15F);
        this.cephalon.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, -1, 9, -3.5F, 0.0F, -3.5F, 4, 0, 4, 0.0F, true));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.5F, 1.2F);
        this.cephalon.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 0, -0.5F, -0.5F, -1.5F, 1, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.325F, -1.0F);
        this.thorax.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.6109F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -2.0F, 0.0F, 4.5F, 2, 0, 3, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 0, -2.0F, 0.0F, -0.5F, 2, 0, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.325F, -1.0F);
        this.thorax.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 0.0F, 0.0F, 4.5F, 2, 0, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 0, 0.0F, 0.0F, -0.5F, 2, 0, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.1383F, 0.8222F, -1.0F);
        this.thorax.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.0036F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -6, 9, -1.0F, 0.0F, -0.5F, 1, 0, 6, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.1383F, 0.8222F, -1.0F);
        this.thorax.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.0036F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -6, 9, 0.0F, 0.0F, -0.5F, 1, 0, 6, 0.0F, false));

        this.leftleg_1 = new AdvancedModelRenderer(this);
        this.leftleg_1.setRotationPoint(0.3172F, 0.4877F, -0.6128F);
        this.thorax.addChild(leftleg_1);
        this.setRotateAngle(leftleg_1, 0.0F, 0.0F, 0.5411F);
        this.leftleg_1.cubeList.add(new ModelBox(leftleg_1, 11, 14, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.leftleg_2 = new AdvancedModelRenderer(this);
        this.leftleg_2.setRotationPoint(0.3172F, 0.4877F, 1.8872F);
        this.thorax.addChild(leftleg_2);
        this.setRotateAngle(leftleg_2, 0.0F, 0.0F, 0.5411F);
        this.leftleg_2.cubeList.add(new ModelBox(leftleg_2, -1, 2, 0.0F, 0.0F, -1.5F, 3, 0, 1, 0.0F, false));

        this.leftleg_3 = new AdvancedModelRenderer(this);
        this.leftleg_3.setRotationPoint(0.3172F, 0.4877F, 3.3872F);
        this.thorax.addChild(leftleg_3);
        this.setRotateAngle(leftleg_3, 0.0F, 0.0F, 0.5411F);
        this.leftleg_3.cubeList.add(new ModelBox(leftleg_3, -1, 2, 0.0F, 0.0F, -1.5F, 3, 0, 1, 0.0F, false));

        this.leftleg_4 = new AdvancedModelRenderer(this);
        this.leftleg_4.setRotationPoint(0.3172F, 0.4877F, 4.8872F);
        this.thorax.addChild(leftleg_4);
        this.setRotateAngle(leftleg_4, 0.0F, 0.0F, 0.5411F);
        this.leftleg_4.cubeList.add(new ModelBox(leftleg_4, 13, 11, 0.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.rightleg_1 = new AdvancedModelRenderer(this);
        this.rightleg_1.setRotationPoint(-0.3172F, 0.4877F, -0.6128F);
        this.thorax.addChild(rightleg_1);
        this.setRotateAngle(rightleg_1, 0.0F, 0.0F, -0.5411F);
        this.rightleg_1.cubeList.add(new ModelBox(rightleg_1, 11, 14, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.rightleg_2 = new AdvancedModelRenderer(this);
        this.rightleg_2.setRotationPoint(-0.3172F, 0.4877F, 1.8872F);
        this.thorax.addChild(rightleg_2);
        this.setRotateAngle(rightleg_2, 0.0F, 0.0F, -0.5411F);
        this.rightleg_2.cubeList.add(new ModelBox(rightleg_2, -1, 2, -3.0F, 0.0F, -1.5F, 3, 0, 1, 0.0F, true));

        this.rightleg_3 = new AdvancedModelRenderer(this);
        this.rightleg_3.setRotationPoint(-0.3172F, 0.4877F, 3.3872F);
        this.thorax.addChild(rightleg_3);
        this.setRotateAngle(rightleg_3, 0.0F, 0.0F, -0.5411F);
        this.rightleg_3.cubeList.add(new ModelBox(rightleg_3, -1, 2, -3.0F, 0.0F, -1.5F, 3, 0, 1, 0.0F, true));

        this.rightleg_4 = new AdvancedModelRenderer(this);
        this.rightleg_4.setRotationPoint(-0.3172F, 0.4877F, 4.8872F);
        this.thorax.addChild(rightleg_4);
        this.setRotateAngle(rightleg_4, 0.0F, 0.0F, -0.5411F);
        this.rightleg_4.cubeList.add(new ModelBox(rightleg_4, 13, 11, -2.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.furace = new AdvancedModelRenderer(this);
        this.furace.setRotationPoint(0.1F, 0.25F, 5.25F);
        this.thorax.addChild(furace);
        this.setRotateAngle(furace, 0.0F, 0.3927F, 0.0F);
        this.furace.cubeList.add(new ModelBox(furace, 8, 9, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.furace2 = new AdvancedModelRenderer(this);
        this.furace2.setRotationPoint(-0.1F, 0.25F, 5.25F);
        this.thorax.addChild(furace2);
        this.setRotateAngle(furace2, 0.0F, -0.3927F, 0.0F);
        this.furace2.cubeList.add(new ModelBox(furace2, 8, 9, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.triopus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.triopus.offsetY = -2.2F;
        this.triopus.offsetX = -0.228F;
        this.triopus.rotateAngleY = (float)Math.toRadians(222);
        this.triopus.rotateAngleX = (float)Math.toRadians(28);
        this.triopus.rotateAngleZ = (float)Math.toRadians(-8);
        this.triopus.scaleChildren = true;
        float scaler = 8.63F;
        this.triopus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.triopus.render(f);
        //Reset rotations, positions and sizing:
        this.triopus.setScale(1.0F, 1.0F, 1.0F);
        this.triopus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(triopus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cephalon, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(thorax, 0.0F, 0.1F, 0.0F);
        this.triopus.offsetY = 0.316F;
        this.triopus.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Crotalocephalus.offsetY = 1.0F;


        float speed = 0.45F;
        float tailVdegree = 0.30F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.3F;

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
            speed = 0.18F;
            tailVdegree = 0.05F;
            tailHdegree = 0.11F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.flap(leftleg_1, speed, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg_1, speed, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg_2, speed, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_2, speed, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg_3, speed, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_3, speed, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg_4, speed, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_4, speed, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

            this.swing(furace, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(furace2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            this.swing(anntennae, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(anntennae2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(triopus, -speed, 0.12F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.triopus.offsetY = 0.0F;
                this.bob(triopus, -speed, 0.21F, false, f2, 1);
            }
        }
    }
}
