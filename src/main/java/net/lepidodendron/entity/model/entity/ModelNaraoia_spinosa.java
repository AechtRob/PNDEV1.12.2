package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraNaraoia_spinosa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelNaraoia_spinosa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer naraoia;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer rightleg5;

    public ModelNaraoia_spinosa() {
        this.textureWidth = 50;
        this.textureHeight = 40;

        this.naraoia = new AdvancedModelRenderer(this);
        this.naraoia.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -1.15F, -4.0F);
        this.naraoia.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 23, -4.0F, -1.0F, -2.0F, 8, 1, 1, 0.051F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 23, 28, -5.0F, -1.0F, -1.0F, 10, 1, 2, 0.052F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 0, -1.0F, -1.5F, -1.0F, 2, 1, 3, 0.051F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 21, 17, -6.0F, -1.025F, 1.0F, 12, 0, 3, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 25, -4.0F, -1.0F, 1.0F, 8, 1, 1, 0.05F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 27, -4.0F, -1.0F, -3.0F, 8, 1, 1, 0.05F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 10, -2.0F, -1.0F, -4.0F, 4, 1, 1, 0.049F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 12, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.025F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.05F, 2.0F, -4.05F);
        this.cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 8, -2.05F, -3.0F, 0.05F, 2, 1, 1, 0.048F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0234F, 2.0F, -3.3318F);
        this.cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0908F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 10, -2.05F, -3.0F, 0.05F, 2, 1, 1, 0.047F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.993F, 2.0F, -1.469F);
        this.cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -1.05F, -3.0F, 0.05F, 1, 1, 1, 0.049F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.993F, 2.0F, -1.469F);
        this.cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, 0.05F, -3.0F, 0.05F, 1, 1, 1, 0.049F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0234F, 2.0F, -3.3318F);
        this.cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.0908F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 10, 0.05F, -3.0F, 0.05F, 2, 1, 1, 0.047F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.05F, 2.0F, -4.05F);
        this.cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 8, 0.05F, -3.0F, 0.05F, 2, 1, 1, 0.048F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(1.0F, 0.3F, -1.0F);
        this.cephalon.addChild(anntennae1);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, 19, 12, 0.0F, -0.05F, -4.5F, 4, 0, 5, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-1.0F, 0.25F, -1.0F);
        this.cephalon.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 19, 12, -4.0F, 0.0F, -4.5F, 4, 0, 5, 0.0F, true));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 29, -4.0F, -1.0F, 1.5F, 8, 1, 7, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 20, 21, -1.0F, -1.5F, 2.0F, 2, 1, 6, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 4, -0.5F, -1.5F, 7.95F, 1, 1, 3, -0.001F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 17, -3.0F, -1.0F, 8.5F, 6, 1, 2, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 8, -2.0F, -1.0F, 10.5F, 4, 1, 1, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 4, 0, -5.0F, -0.025F, 1.5F, 10, 0, 12, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 8, 12, -2.0F, -0.5F, -0.5F, 4, 1, 8, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 6, 13, -1.0F, -0.5F, 7.5F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.0F, 2.0F, 8.5F);
        this.pygidium.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 31, 0.0F, -3.0F, 0.0F, 1, 1, 3, -0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.8519F, 2.0F, 11.2716F);
        this.pygidium.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.3526F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 32, 0.0F, -3.0F, 0.0F, 1, 1, 1, -0.002F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.8519F, 2.0F, 11.2716F);
        this.pygidium.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.3526F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 32, -1.0F, -3.0F, 0.0F, 1, 1, 1, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.0F, 2.0F, 8.5F);
        this.pygidium.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 31, -1.0F, -3.0F, 0.0F, 1, 1, 3, -0.001F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(1.6913F, 0.4881F, 1.0F);
        this.pygidium.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0094F, 0.0426F, 0.2184F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, -1, 16, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.6913F, 0.4881F, 1.0F);
        this.pygidium.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0094F, -0.0426F, -0.2184F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, -1, 16, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.6913F, 0.4881F, 3.0F);
        this.pygidium.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.0094F, -0.0426F, 0.2184F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, -1, 16, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.6913F, 0.4881F, 3.0F);
        this.pygidium.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.0094F, 0.0426F, -0.2184F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, -1, 16, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.4413F, 0.4881F, 5.0F);
        this.pygidium.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0285F, -0.1278F, 0.22F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, -1, 16, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.4413F, 0.4881F, 5.0F);
        this.pygidium.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0285F, 0.1278F, -0.22F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, -1, 16, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.9413F, 0.4881F, 7.0F);
        this.pygidium.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.0479F, -0.2129F, 0.2233F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, -1, 16, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.9413F, 0.4881F, 7.0F);
        this.pygidium.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.0479F, 0.2129F, -0.2233F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, -1, 16, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(0.4413F, 0.4881F, 9.0F);
        this.pygidium.addChild(leftleg5);
        this.setRotateAngle(leftleg5, -0.0681F, -0.298F, 0.2284F);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, -1, 16, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(-0.4413F, 0.4881F, 9.0F);
        this.pygidium.addChild(rightleg5);
        this.setRotateAngle(rightleg5, -0.0681F, 0.298F, -0.2284F);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, -1, 16, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.naraoia.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.naraoia.offsetY = -2.0F;
        this.naraoia.offsetX = -1.338F;
        this.naraoia.rotateAngleY = (float)Math.toRadians(200);
        this.naraoia.rotateAngleX = (float)Math.toRadians(8);
        this.naraoia.rotateAngleZ = (float)Math.toRadians(-8);
        this.naraoia.scaleChildren = true;
        float scaler = 1.63F;
        this.naraoia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.naraoia.render(f);
        //Reset rotations, positions and sizing:
        this.naraoia.setScale(1.0F, 1.0F, 1.0F);
        this.naraoia.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(naraoia, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(pygidium, 0.0F, 0.1F, 0.0F);
        this.naraoia.offsetY = 0.06F;
        this.naraoia.offsetZ = 0.016F;
        this.naraoia.render(0.01F);
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
        //this.naraoia.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3, this.leftleg4, this.leftleg5};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3, this.rightleg4, this.rightleg5};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraNaraoia_spinosa) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

        }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}