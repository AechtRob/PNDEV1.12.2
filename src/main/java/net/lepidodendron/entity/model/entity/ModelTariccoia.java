package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTariccoia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelTariccoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tariccoia;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer thorax3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg4;

    public ModelTariccoia() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.tariccoia = new AdvancedModelRenderer(this);
        this.tariccoia.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -1.95F, -3.0F);
        this.tariccoia.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 8, -0.5F, 0.0F, -5.0F, 1, 1, 1, -0.002F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 11, 0, -3.5F, 0.0F, -2.0F, 7, 1, 2, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 10, 17, -2.5F, 0.0F, -4.0F, 5, 1, 2, -0.001F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 22, -1.0F, 0.5F, -2.3F, 2, 1, 2, 0.051F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.0F, -5.0F);
        this.cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.3478F, 3.0F, -4.2346F);
        this.cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.8727F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 13, -2.0F, -3.0F, 0.0F, 2, 1, 2, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.6333F, 3.0F, -2.7025F);
        this.cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.3963F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 3, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.9806F, 3.0F, -0.7329F);
        this.cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -1.0F, -3.0F, 0.0F, 1, 1, 2, -0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.9806F, 3.0F, -0.7329F);
        this.cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, 0.0F, -3.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.6333F, 3.0F, -2.7025F);
        this.cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.3963F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 3, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.3478F, 3.0F, -4.2346F);
        this.cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 13, 0.0F, -3.0F, 0.0F, 2, 1, 2, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 3.0F, -5.0F);
        this.cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(1.0F, 1.25F, -1.55F);
        this.cephalon.addChild(anntennae1);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, -5, 13, 0.0F, 0.0F, -4.5F, 3, 0, 5, 0.0F, true));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-1.0F, 1.25F, -1.55F);
        this.cephalon.addChild(anntennae2);
        this.setRotateAngle(anntennae2, 0.0F, 0.0F, 0.0F);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, -5, 13, -3.0F, 0.0F, -4.5F, 3, 0, 5, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(thorax1);
        this.setRotateAngle(thorax1, 0.0F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, 0.6F);
        this.thorax1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -3.1416F, 0.0F, 3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 5, -2.5F, -2.5F, -0.15F, 5, 1, 1, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 7, -3.0F, -3.0F, -0.15F, 6, 1, 1, -0.002F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.thorax1.addChild(thorax2);
        this.setRotateAngle(thorax2, 0.0F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, 0.9F);
        this.thorax2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, 0.0F, 3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, -2.5F, -2.5F, 0.1F, 5, 1, 1, -0.004F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 17, -3.0F, -3.0F, 0.1F, 6, 1, 1, -0.004F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.8413F, 1.4881F, 0.35F);
        this.thorax2.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0189F, 0.0852F, 0.219F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, -1, 10, 0.2438F, -0.0541F, -0.5109F, 2, 0, 1, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.8413F, 1.4881F, 0.35F);
        this.thorax2.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0189F, -0.0852F, -0.219F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, -1, 10, -2.2438F, -0.0541F, -0.5109F, 2, 0, 1, 0.0F, true));

        this.thorax3 = new AdvancedModelRenderer(this);
        this.thorax3.setRotationPoint(0.0F, 3.0F, 0.75F);
        this.thorax2.addChild(thorax3);
        this.setRotateAngle(thorax3, 0.0F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.thorax3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.1416F, 0.0F, 3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 3, -2.5F, -2.5F, 0.1F, 5, 1, 1, -0.006F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 7, -3.0F, -3.0F, 0.1F, 6, 1, 1, -0.006F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, -3.0F, 0.575F);
        this.thorax3.addChild(pygidium);
        this.setRotateAngle(pygidium, 0.0F, 0.0F, 0.0F);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 8, -3.0F, 0.5F, 0.025F, 6, 1, 4, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 16, 9, -2.0F, 0.5F, 4.025F, 4, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.4962F, 0.0F, 3.9973F);
        this.pygidium.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.5708F, -1.4399F, 1.5708F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 20, -0.025F, 0.0F, -1.0F, 5, 0, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.4976F, 0.0F, 6.9382F);
        this.pygidium.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.5708F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, -1, -1, -6.9409F, 0.0F, -2.9986F, 1, 1, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.0F, 4.975F);
        this.pygidium.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -3.1416F, 0.0F, 3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 13, -3.5F, -3.0F, 1.0F, 7, 1, 3, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1F, 0.025F, 3.9739F);
        this.pygidium.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -3.0543F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 20, -1.6F, -0.0249F, -2.9989F, 3, 1, 3, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, 0.875F);
        this.pygidium.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -3.0543F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 7, 0.0F, 0.0F, -6.0F, 0, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.0F, -0.425F);
        this.pygidium.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -3.1416F, 0.0F, 3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 18, -1.0F, -3.5F, -4.3F, 2, 1, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(2.845F, 0.0323F, 4.8419F);
        this.pygidium.addChild(bone);
        this.setRotateAngle(bone, 0.0349F, -0.0338F, -0.0317F);


        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-2.845F, 0.0323F, 4.8419F);
        this.pygidium.addChild(bone2);
        this.setRotateAngle(bone2, 0.0349F, 0.0338F, 0.0317F);


        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.1413F, 1.4881F, 0.525F);
        this.pygidium.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, 0.0F, 0.22F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, -1, 10, -0.0255F, 0.0057F, -0.4983F, 2, 0, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.1413F, 1.4881F, 0.525F);
        this.pygidium.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 0.0F, -0.22F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, -1, 10, -1.9745F, 0.0057F, -0.4983F, 2, 0, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0346F, 1.4881F, 2.4797F);
        this.pygidium.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0189F, -0.0852F, 0.219F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, -1, 10, 0.0064F, -0.0014F, -0.4996F, 2, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.0346F, 1.4881F, 2.4797F);
        this.pygidium.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0189F, 0.0852F, -0.219F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, -1, 10, -2.0064F, -0.0014F, -0.4996F, 2, 0, 1, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.6913F, 1.4881F, 4.675F);
        this.pygidium.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.0479F, -0.2129F, 0.2233F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, -1, 11, 0.0292F, -0.0065F, -0.7115F, 2, 0, 1, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.6913F, 1.4881F, 4.675F);
        this.pygidium.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.0479F, 0.2129F, -0.2233F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, -1, 11, -2.0292F, -0.0065F, -0.7115F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tariccoia.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.tariccoia.offsetY = -2.0F;
        this.tariccoia.offsetX = -1.338F;
        this.tariccoia.rotateAngleY = (float)Math.toRadians(200);
        this.tariccoia.rotateAngleX = (float)Math.toRadians(8);
        this.tariccoia.rotateAngleZ = (float)Math.toRadians(-8);
        this.tariccoia.scaleChildren = true;
        float scaler = 1.63F;
        this.tariccoia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.tariccoia.render(f);
        //Reset rotations, positions and sizing:
        this.tariccoia.setScale(1.0F, 1.0F, 1.0F);
        this.tariccoia.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tariccoia, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cephalon, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(pygidium, 0.0F, 0.1F, 0.0F);
        this.tariccoia.offsetY = 0.31F;
        this.tariccoia.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.pseudonaraoia.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3, leftleg4};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3, rightleg4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraTariccoia) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg1, 0.5F, -0.2F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg1, 0.5F, 0.2F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg2, 0.5F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg2, 0.5F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg4, 0.5F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg4, 0.5F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg1, 0.2F, -0.2F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.2F, 0.2F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.2F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.2F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.2F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.2F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg4, 0.2F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg4, 0.2F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


        }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}