package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNectocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Center;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer head6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer nozzle;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer newtentacle;
    private final AdvancedModelRenderer newtentacle2;
    private final AdvancedModelRenderer newtentacle3;
    private final AdvancedModelRenderer newtentacle4;
    private final AdvancedModelRenderer newtentacle5;
    private final AdvancedModelRenderer newtentacle6;
    private final AdvancedModelRenderer newtentacle7;
    private final AdvancedModelRenderer newtentacle8;
    private final AdvancedModelRenderer newtentacle9;
    private final AdvancedModelRenderer newtentacle10;
    private final AdvancedModelRenderer newtentacle11;
    private final AdvancedModelRenderer newtentacle12;
    private final AdvancedModelRenderer newtentacle13;
    private final AdvancedModelRenderer newtentacle14;
    private final AdvancedModelRenderer newtentacletwo;
    private final AdvancedModelRenderer newtentacletwo2;
    private final AdvancedModelRenderer newtentacletwo3;
    private final AdvancedModelRenderer newtentacletwo4;
    private final AdvancedModelRenderer newtentacletwo5;
    private final AdvancedModelRenderer newtentacletwo6;
    private final AdvancedModelRenderer newtentacletwo7;
    private final AdvancedModelRenderer newtentacletwo8;
    private final AdvancedModelRenderer newtentacletwo9;
    private final AdvancedModelRenderer newtentacletwo10;
    private final AdvancedModelRenderer newtentacletwo11;
    private final AdvancedModelRenderer newtentacletwo12;
    private final AdvancedModelRenderer newtentacletwo13;
    private final AdvancedModelRenderer newtentacletwo14;

    public ModelNectocaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Center = new AdvancedModelRenderer(this);
        this.Center.setRotationPoint(0.0F, 24.0F, 4.0F);
        this.Center.cubeList.add(new ModelBox(Center, 23, 0, -1.5F, -4.5F, -1.0F, 3, 3, 4, 0.0F, false));
        this.Center.cubeList.add(new ModelBox(Center, 0, 3, -1.0F, -4.0F, 2.7F, 2, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.Center.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 25, -2.0F, -4.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.Center.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 25, 0.0F, -4.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Center.addChild(head1);
        this.head1.cubeList.add(new ModelBox(head1, 0, 19, -3.0F, -2.0F, -3.0F, 6, 4, 3, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.head1.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 0, 26, -4.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.head1.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 0, 26, 0.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, true));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head1.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 0, 0, -4.0F, -2.5F, -7.0F, 8, 5, 7, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.head2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 12, -4.0F, 0.0F, -3.0F, 4, 0, 7, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.head2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 12, 0.0F, 0.0F, -3.0F, 4, 0, 7, 0.0F, true));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.head2.addChild(head3);
        this.head3.cubeList.add(new ModelBox(head3, 15, 12, -3.5F, -2.0F, -3.0F, 7, 4, 3, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(-3.5F, 0.5F, -1.5F);
        this.head3.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 19, 25, -3.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(3.5F, 0.5F, -1.5F);
        this.head3.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 19, 25, -0.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 18, 19, -3.0F, -1.5F, -3.0F, 6, 3, 3, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(-3.0F, 0.5F, -1.0F);
        this.head4.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 12, 19, -2.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(3.0F, 0.5F, -1.0F);
        this.head4.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 12, 19, -1.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, true));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head4.addChild(head5);
        this.head5.cubeList.add(new ModelBox(head5, 26, 28, -2.0F, -1.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(-2.0F, 0.5F, -1.0F);
        this.head5.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 28, 7, -2.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(2.0F, 0.5F, -1.0F);
        this.head5.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 28, 7, -1.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.head6 = new AdvancedModelRenderer(this);
        this.head6.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head5.addChild(head6);
        this.head6.cubeList.add(new ModelBox(head6, 0, 0, -1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head6.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 9, 26, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head6.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 9, 26, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.nozzle = new AdvancedModelRenderer(this);
        this.nozzle.setRotationPoint(0.0F, -2.05F, 1.75F);
        this.Center.addChild(nozzle);
        this.setRotateAngle(nozzle, -0.6981F, 0.0F, 0.0F);
        this.nozzle.cubeList.add(new ModelBox(nozzle, 0, 12, -0.5F, -0.234F, -0.1072F, 1, 1, 2, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(-1.0F, -4.0F, 2.0F);
        this.Center.addChild(eye1);
        this.setRotateAngle(eye1, 0.0F, 0.2182F, 0.1745F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 6.0F, -1.0F);
        this.eye1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 15, -4.4F, -5.7F, 1.5F, 2, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(1.0F, -4.0F, 2.0F);
        this.Center.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.2182F, -0.1745F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 6.0F, -1.0F);
        this.eye2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, 2.4F, -5.7F, 1.5F, 2, 1, 1, 0.0F, true));

        this.newtentacle = new AdvancedModelRenderer(this);
        this.newtentacle.setRotationPoint(-0.75F, -3.0F, 3.0F);
        this.Center.addChild(newtentacle);
        this.newtentacle.cubeList.add(new ModelBox(newtentacle, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle2 = new AdvancedModelRenderer(this);
        this.newtentacle2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle.addChild(newtentacle2);
        this.newtentacle2.cubeList.add(new ModelBox(newtentacle2, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle3 = new AdvancedModelRenderer(this);
        this.newtentacle3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle2.addChild(newtentacle3);
        this.newtentacle3.cubeList.add(new ModelBox(newtentacle3, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle4 = new AdvancedModelRenderer(this);
        this.newtentacle4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle3.addChild(newtentacle4);
        this.newtentacle4.cubeList.add(new ModelBox(newtentacle4, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle5 = new AdvancedModelRenderer(this);
        this.newtentacle5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle4.addChild(newtentacle5);
        this.newtentacle5.cubeList.add(new ModelBox(newtentacle5, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle6 = new AdvancedModelRenderer(this);
        this.newtentacle6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle5.addChild(newtentacle6);
        this.newtentacle6.cubeList.add(new ModelBox(newtentacle6, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle7 = new AdvancedModelRenderer(this);
        this.newtentacle7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle6.addChild(newtentacle7);
        this.newtentacle7.cubeList.add(new ModelBox(newtentacle7, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle8 = new AdvancedModelRenderer(this);
        this.newtentacle8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle7.addChild(newtentacle8);
        this.newtentacle8.cubeList.add(new ModelBox(newtentacle8, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle9 = new AdvancedModelRenderer(this);
        this.newtentacle9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle8.addChild(newtentacle9);
        this.newtentacle9.cubeList.add(new ModelBox(newtentacle9, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle10 = new AdvancedModelRenderer(this);
        this.newtentacle10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle9.addChild(newtentacle10);
        this.newtentacle10.cubeList.add(new ModelBox(newtentacle10, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle11 = new AdvancedModelRenderer(this);
        this.newtentacle11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle10.addChild(newtentacle11);
        this.newtentacle11.cubeList.add(new ModelBox(newtentacle11, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle12 = new AdvancedModelRenderer(this);
        this.newtentacle12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle11.addChild(newtentacle12);
        this.newtentacle12.cubeList.add(new ModelBox(newtentacle12, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle13 = new AdvancedModelRenderer(this);
        this.newtentacle13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle12.addChild(newtentacle13);
        this.newtentacle13.cubeList.add(new ModelBox(newtentacle13, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacle14 = new AdvancedModelRenderer(this);
        this.newtentacle14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle13.addChild(newtentacle14);
        this.newtentacle14.cubeList.add(new ModelBox(newtentacle14, 0, 38, -0.51F, -0.51F, 0.0F, 1, 1, 1, 0.0F, false));

        this.newtentacletwo = new AdvancedModelRenderer(this);
        this.newtentacletwo.setRotationPoint(0.75F, -3.0F, 3.0F);
        this.Center.addChild(newtentacletwo);
        this.newtentacletwo.cubeList.add(new ModelBox(newtentacletwo, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo2 = new AdvancedModelRenderer(this);
        this.newtentacletwo2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo.addChild(newtentacletwo2);
        this.newtentacletwo2.cubeList.add(new ModelBox(newtentacletwo2, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo3 = new AdvancedModelRenderer(this);
        this.newtentacletwo3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo2.addChild(newtentacletwo3);
        this.newtentacletwo3.cubeList.add(new ModelBox(newtentacletwo3, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo4 = new AdvancedModelRenderer(this);
        this.newtentacletwo4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo3.addChild(newtentacletwo4);
        this.newtentacletwo4.cubeList.add(new ModelBox(newtentacletwo4, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo5 = new AdvancedModelRenderer(this);
        this.newtentacletwo5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo4.addChild(newtentacletwo5);
        this.newtentacletwo5.cubeList.add(new ModelBox(newtentacletwo5, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo6 = new AdvancedModelRenderer(this);
        this.newtentacletwo6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo5.addChild(newtentacletwo6);
        this.newtentacletwo6.cubeList.add(new ModelBox(newtentacletwo6, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo7 = new AdvancedModelRenderer(this);
        this.newtentacletwo7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo6.addChild(newtentacletwo7);
        this.newtentacletwo7.cubeList.add(new ModelBox(newtentacletwo7, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo8 = new AdvancedModelRenderer(this);
        this.newtentacletwo8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo7.addChild(newtentacletwo8);
        this.newtentacletwo8.cubeList.add(new ModelBox(newtentacletwo8, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo9 = new AdvancedModelRenderer(this);
        this.newtentacletwo9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo8.addChild(newtentacletwo9);
        this.newtentacletwo9.cubeList.add(new ModelBox(newtentacletwo9, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo10 = new AdvancedModelRenderer(this);
        this.newtentacletwo10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo9.addChild(newtentacletwo10);
        this.newtentacletwo10.cubeList.add(new ModelBox(newtentacletwo10, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo11 = new AdvancedModelRenderer(this);
        this.newtentacletwo11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo10.addChild(newtentacletwo11);
        this.newtentacletwo11.cubeList.add(new ModelBox(newtentacletwo11, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo12 = new AdvancedModelRenderer(this);
        this.newtentacletwo12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo11.addChild(newtentacletwo12);
        this.newtentacletwo12.cubeList.add(new ModelBox(newtentacletwo12, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo13 = new AdvancedModelRenderer(this);
        this.newtentacletwo13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo12.addChild(newtentacletwo13);
        this.newtentacletwo13.cubeList.add(new ModelBox(newtentacletwo13, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.newtentacletwo14 = new AdvancedModelRenderer(this);
        this.newtentacletwo14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo13.addChild(newtentacletwo14);
        this.newtentacletwo14.cubeList.add(new ModelBox(newtentacletwo14, 0, 38, -0.49F, -0.51F, 0.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Center.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.Center.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.Center.offsetY = 1.3F;
        //this.Center.rotateAngleY = (float)Math.toRadians(180);

        AdvancedModelRenderer[] BodyF = {this.head1, this.head2, this.head3, this.head4, this.head5, this.head6};
        AdvancedModelRenderer[] TentacleL = {this.newtentacle, this.newtentacle2, this.newtentacle3, this.newtentacle4, this.newtentacle5, this.newtentacle6, this.newtentacle7, this.newtentacle8, this.newtentacle9, this.newtentacle10, this.newtentacle11, this.newtentacle12, this.newtentacle13, this.newtentacle14};
        AdvancedModelRenderer[] TentacleR = {this.newtentacletwo, this.newtentacletwo2, this.newtentacletwo3, this.newtentacletwo4, this.newtentacletwo5, this.newtentacletwo6, this.newtentacletwo7, this.newtentacletwo8, this.newtentacletwo9, this.newtentacletwo10, this.newtentacletwo11, this.newtentacletwo12, this.newtentacletwo13, this.newtentacletwo14};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float feedModifier = 1;
            if (f3 == 0.0) {
                feedModifier = 0.15F;
            }

            this.chainWave(TentacleL, (float)0.45 * feedModifier, 0.035F, -3.5, f2, 0.8F);
            this.chainSwing(TentacleL, (float)0.45 *  feedModifier, 0.1F, -0.1, f2, 0.25F);

            this.chainWave(TentacleR, (float)0.45 * feedModifier, 0.035F, -3.5, f2, -0.8F);
            this.chainSwing(TentacleR, (float)0.45 *  feedModifier, -0.1F, -0.1, f2, -0.25F);


            float tailVdegree = 0.016F;
            float tailHdegree = 0.025F;
            float degreeFin = 0.4F * feedModifier;
            this.chainWave(BodyF, speed * feedModifier, tailVdegree, -3, f2, 0.4F);
            this.chainSwing(BodyF, speed*  feedModifier, tailHdegree, -2.5, f2, 0.5F);

            this.flap(finL, 0.5F, -degreeFin, false, 0, -0.5F, f2, 0.7F);
            this.flap(finR, 0.5F, degreeFin, false, 0, 0.5F, f2, 0.7F);
            this.flap(finL2, 0.5F, -degreeFin, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(finL3, 0.5F, -degreeFin, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finL4, 0.5F, -degreeFin, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finL5, 0.5F, -degreeFin, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finR5, 0.5F, degreeFin, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finL6, 0.5F, -degreeFin, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finR6, 0.5F, degreeFin, false, 2.5F, 0.5F, f2, 0.7F);

            if (!e.isInWater()) {
                this.Center.offsetY = 1.32F - 1.3F;
                this.bob(Center, -speed * 1.5F, 1.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(Center, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(Center, -speed, 0.07F, false, f2, 2);
                }
            }
        }
    }
}