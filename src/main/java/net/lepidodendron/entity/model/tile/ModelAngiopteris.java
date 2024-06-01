package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAngiopteris extends ModelBase {
    private final ModelRenderer Angiopteris;
    private final ModelRenderer leaf1;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone7;
    private final ModelRenderer leaf2;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone8;
    private final ModelRenderer leaf3;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer leaf4;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer leaf5;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer leaf6;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer leaf7;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer leaf8;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer leaf9;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer leaf10;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone40;
    private final ModelRenderer leaf11;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer leaf12;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;

    public ModelAngiopteris() {
        textureWidth = 103;
        textureHeight = 86;

        Angiopteris = new ModelRenderer(this);
        Angiopteris.setRotationPoint(0.0F, 24.0F, 0.0F);
        Angiopteris.cubeList.add(new ModelBox(Angiopteris, 22, 3, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 55, -8.0F, -22.0F, -1.0F, 16, 14, 0, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 55, -8.0F, -22.0F, -1.0F, 16, 14, 0, 0.0F, false));

        leaf1 = new ModelRenderer(this);
        leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf1);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf1.addChild(bone);
        setRotationAngle(bone, -0.6109F, 0.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone.addChild(bone3);
        setRotationAngle(bone3, -0.3927F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone3.cubeList.add(new ModelBox(bone3, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone3.addChild(bone5);
        setRotationAngle(bone5, -0.3927F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 39, 19, -16.0F, -33.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 31, 20, -1.0F, -31.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone5.addChild(bone7);
        setRotationAngle(bone7, -0.3927F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 40, 51, -14.0F, -34.0F, 0.8F, 28, 32, 0, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 31, 20, -1.0F, -31.0F, 0.4F, 2, 32, 2, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone7.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 2, -4.5F, -13.8F, -1.4F, 9, 12, 0, 0.0F, false));

        leaf2 = new ModelRenderer(this);
        leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf2);
        setRotationAngle(leaf2, -0.1309F, -0.9163F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf2.addChild(bone2);
        setRotationAngle(bone2, -0.6109F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone2.addChild(bone4);
        setRotationAngle(bone4, -0.3927F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone4.addChild(bone6);
        setRotationAngle(bone6, -0.3927F, 0.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 39, 19, -16.0F, -33.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone6.cubeList.add(new ModelBox(bone6, 31, 20, -1.0F, -30.8F, -0.2F, 2, 32, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone6.addChild(bone8);
        setRotationAngle(bone8, -0.3927F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 40, 51, -14.0F, -34.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 31, 20, -1.0F, -31.0F, 0.3F, 2, 32, 2, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone8.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 2, -4.5F, -13.5F, -1.0F, 9, 12, 0, 0.0F, false));

        leaf3 = new ModelRenderer(this);
        leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf3);
        setRotationAngle(leaf3, 0.0F, -1.7453F, 0.1745F);


        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf3.addChild(bone9);
        setRotationAngle(bone9, -0.6109F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone9.addChild(bone10);
        setRotationAngle(bone10, -0.3927F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone10.cubeList.add(new ModelBox(bone10, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone10.addChild(bone11);
        setRotationAngle(bone11, -0.3927F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone11.cubeList.add(new ModelBox(bone11, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone11.addChild(bone12);
        setRotationAngle(bone12, -0.3927F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 40, 51, -14.0F, -32.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 31, 20, -1.0F, -29.0F, 1.0F, 2, 32, 2, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone12.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 2, -4.5F, -11.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf4 = new ModelRenderer(this);
        leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf4);
        setRotationAngle(leaf4, 0.1745F, 0.7418F, 0.0F);


        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf4.addChild(bone13);
        setRotationAngle(bone13, -0.6109F, 0.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone13.addChild(bone14);
        setRotationAngle(bone14, -0.3927F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone14.cubeList.add(new ModelBox(bone14, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone14.addChild(bone15);
        setRotationAngle(bone15, -0.3927F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone15.cubeList.add(new ModelBox(bone15, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone15.addChild(bone16);
        setRotationAngle(bone16, -0.3927F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 40, 51, -14.0F, -32.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 31, 20, -1.0F, -29.0F, 1.0F, 2, 32, 2, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone16.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 2, -4.5F, -11.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf5 = new ModelRenderer(this);
        leaf5.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf5);
        setRotationAngle(leaf5, 0.0F, 1.3963F, 0.0436F);


        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf5.addChild(bone17);
        setRotationAngle(bone17, -0.6109F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone17.addChild(bone18);
        setRotationAngle(bone18, -0.3927F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone18.cubeList.add(new ModelBox(bone18, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone18.addChild(bone19);
        setRotationAngle(bone19, -0.3927F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone19.cubeList.add(new ModelBox(bone19, 31, 20, -1.0F, -30.8F, -0.3F, 2, 32, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone19.addChild(bone20);
        setRotationAngle(bone20, -0.3927F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 40, 51, -14.0F, -34.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 31, 20, -1.0F, -30.8F, 0.1F, 2, 32, 2, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone20.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 2, -4.5F, -13.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf6 = new ModelRenderer(this);
        leaf6.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf6);
        setRotationAngle(leaf6, 0.2618F, -2.5307F, 0.0F);


        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf6.addChild(bone21);
        setRotationAngle(bone21, -0.6109F, 0.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, -0.3927F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone22.cubeList.add(new ModelBox(bone22, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone22.addChild(bone23);
        setRotationAngle(bone23, -0.3927F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone23.cubeList.add(new ModelBox(bone23, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone23.addChild(bone24);
        setRotationAngle(bone24, -0.3927F, 0.0F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 40, 51, -14.0F, -32.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 31, 20, -1.0F, -29.0F, 1.0F, 2, 32, 2, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone24.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 2, -4.5F, -11.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf7 = new ModelRenderer(this);
        leaf7.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf7);
        setRotationAngle(leaf7, 0.0F, 2.9234F, 0.0F);


        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf7.addChild(bone25);
        setRotationAngle(bone25, -0.6109F, 0.0F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone25.addChild(bone26);
        setRotationAngle(bone26, -0.3927F, 0.0F, 0.0F);
        bone26.cubeList.add(new ModelBox(bone26, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone26.cubeList.add(new ModelBox(bone26, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, -0.3927F, 0.0F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone27.cubeList.add(new ModelBox(bone27, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone27.addChild(bone28);
        setRotationAngle(bone28, -0.3927F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 40, 51, -14.0F, -32.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 31, 20, -1.0F, -29.0F, 1.0F, 2, 32, 2, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone28.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 2, -4.5F, -11.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf8 = new ModelRenderer(this);
        leaf8.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf8);
        setRotationAngle(leaf8, 0.0F, 2.3126F, -0.0436F);


        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf8.addChild(bone29);
        setRotationAngle(bone29, -0.6109F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone29.addChild(bone30);
        bone30.cubeList.add(new ModelBox(bone30, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone30.cubeList.add(new ModelBox(bone30, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone30.addChild(bone31);
        setRotationAngle(bone31, -0.7854F, 0.0F, 0.0F);
        bone31.cubeList.add(new ModelBox(bone31, 39, 19, -16.0F, -32.0F, 0.4F, 32, 32, 0, 0.0F, true));
        bone31.cubeList.add(new ModelBox(bone31, 31, 20, -1.0F, -30.8F, 0.2F, 2, 32, 2, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone31.addChild(bone32);
        setRotationAngle(bone32, -0.3927F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 40, 51, -14.0F, -33.0F, 1.2F, 28, 32, 0, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 31, 20, -1.0F, -31.0F, 1.0F, 2, 32, 2, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, -30.0F, 2.0F);
        bone32.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 2, -4.5F, -13.0F, -0.5F, 9, 12, 0, 0.0F, false));

        leaf9 = new ModelRenderer(this);
        leaf9.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf9);
        setRotationAngle(leaf9, 0.4363F, -0.5672F, 0.0F);


        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf9.addChild(bone33);
        setRotationAngle(bone33, -0.6109F, 0.0F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone33.addChild(bone34);
        setRotationAngle(bone34, -0.3927F, 0.0F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone34.cubeList.add(new ModelBox(bone34, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone34.addChild(bone35);
        setRotationAngle(bone35, -0.3927F, 0.0F, 0.0F);
        bone35.cubeList.add(new ModelBox(bone35, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone35.cubeList.add(new ModelBox(bone35, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone35.addChild(bone36);
        setRotationAngle(bone36, -0.7854F, 0.0F, 0.0F);
        bone36.cubeList.add(new ModelBox(bone36, 40, 51, -14.0F, -33.0F, 1.5F, 28, 32, 0, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 31, 20, -1.0F, -30.55F, 1.45F, 2, 32, 2, 0.0F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone36.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 2, -4.5F, -13.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf10 = new ModelRenderer(this);
        leaf10.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf10);
        setRotationAngle(leaf10, 0.4363F, -3.0107F, 0.0F);


        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf10.addChild(bone37);
        setRotationAngle(bone37, -0.6109F, 0.0F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone37.addChild(bone38);
        setRotationAngle(bone38, -0.3927F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone38.cubeList.add(new ModelBox(bone38, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone38.addChild(bone39);
        setRotationAngle(bone39, -0.3927F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone39.cubeList.add(new ModelBox(bone39, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone39.addChild(bone40);
        setRotationAngle(bone40, -0.7854F, 0.0F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 40, 51, -14.0F, -34.0F, 1.6F, 28, 32, 0, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 31, 20, -1.0F, -30.6F, 1.4F, 2, 32, 2, 0.0F, false));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone40.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 2, -4.5F, -13.0F, -0.4F, 9, 12, 0, 0.0F, false));

        leaf11 = new ModelRenderer(this);
        leaf11.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf11);
        setRotationAngle(leaf11, 0.4363F, 1.8326F, 0.0F);


        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf11.addChild(bone41);
        setRotationAngle(bone41, -0.6109F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone41.addChild(bone42);
        setRotationAngle(bone42, -0.3927F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone42.cubeList.add(new ModelBox(bone42, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone42.addChild(bone43);
        setRotationAngle(bone43, -0.3927F, 0.0F, 0.0F);
        bone43.cubeList.add(new ModelBox(bone43, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone43.cubeList.add(new ModelBox(bone43, 31, 20, -1.0F, -30.0F, 0.0F, 2, 32, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 40, 51, -14.0F, -33.0F, 1.8F, 28, 32, 0, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 31, 20, -1.0F, -30.5F, 1.4F, 2, 32, 2, 0.0F, false));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone44.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 2, -4.5F, -13.0F, 0.0F, 9, 12, 0, 0.0F, false));

        leaf12 = new ModelRenderer(this);
        leaf12.setRotationPoint(0.0F, 0.0F, 0.0F);
        Angiopteris.addChild(leaf12);
        setRotationAngle(leaf12, -0.0436F, -2.2689F, 0.0F);


        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
        leaf12.addChild(bone45);
        setRotationAngle(bone45, -0.6109F, 0.0F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 22, 20, -1.0F, -32.0F, -1.0F, 2, 32, 2, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone45.addChild(bone46);
        setRotationAngle(bone46, -0.3927F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 39, 19, -16.0F, -32.0F, 0.0F, 32, 32, 0, 0.0F, true));
        bone46.cubeList.add(new ModelBox(bone46, 31, 20, -1.0F, -31.0F, -0.7F, 2, 32, 2, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone46.addChild(bone47);
        setRotationAngle(bone47, -0.3927F, 0.0F, 0.0F);
        bone47.cubeList.add(new ModelBox(bone47, 39, 19, -16.0F, -32.0F, 0.3F, 32, 32, 0, 0.0F, true));
        bone47.cubeList.add(new ModelBox(bone47, 31, 20, -1.0F, -30.0F, -0.2F, 2, 32, 2, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, -32.0F, 0.0F);
        bone47.addChild(bone48);
        setRotationAngle(bone48, -0.3927F, 0.0F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 40, 51, -14.0F, -32.0F, 1.0F, 28, 32, 0, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 31, 20, -1.0F, -30.0F, 0.5F, 2, 32, 2, 0.0F, false));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, -29.0F, 2.0F);
        bone48.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 2, -4.5F, -12.0F, -0.8F, 9, 12, 0, 0.0F, false));
    }

    public void renderAll(float f) {
        Angiopteris.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
